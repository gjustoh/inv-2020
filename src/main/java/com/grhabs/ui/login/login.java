package com.grhabs.ui.login;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.UI;

import java.util.Collections;

@PageTitle("Login")
@Route(value = "login")
@NpmPackage(value = "@polymer/iron-form", version = "3.0.1")
@JsModule("@polymer/iron-form/iron-form.js")
public class login extends VerticalLayout implements BeforeEnterObserver {
    public static final String ROUTE = "login";
    public login() {
        TextField userNameTextField = new TextField();
        userNameTextField.getElement().setAttribute("name", "username");
        PasswordField passwordField = new PasswordField();
        passwordField.getElement().setAttribute("name", "password");
        Button submitButton = new Button("Login");
        submitButton.setId("submitbutton");
        UI.getCurrent().getPage().executeJs("document.getElementById('submitbutton').addEventListener('click', () => document.getElementById('ironform').submit());");

        FormLayout formLayout = new FormLayout();
        formLayout.add(userNameTextField, passwordField, submitButton);

        Element formElement = new Element("form");
        formElement.setAttribute("method", "post");
        formElement.setAttribute("action", "login");
        formElement.appendChild(formLayout.getElement());

        Element ironForm = new Element("iron-form");
        ironForm.setAttribute("id", "ironform");
        ironForm.setAttribute("allow-redirect", true);
        ironForm.appendChild(formElement);

        getElement().appendChild(ironForm);

        setClassName("login-view");
    }
    @Override
    public void beforeEnter(BeforeEnterEvent event){
        if (!event.getLocation().getQueryParameters().getParameters().getOrDefault("error", Collections.emptyList()).isEmpty()){
            getElement().setProperty("error", true);
        }

    }
}
