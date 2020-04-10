package com.grhabs.ui.login;

import com.grhabs.MainView;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.*;
import  com.grhabs.app.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

@PageTitle("login")
@Route(value = "login")
@JsModule("./styles/shared-styles.js")
@Viewport("width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes, viewport-fit=cover")
public class login extends LoginOverlay implements AfterNavigationObserver, BeforeEnterObserver {
    @Autowired
    public login() {
        // configures login dialog and adds it to the main view
        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setHeader(new LoginI18n.Header());
        i18n.getHeader().setTitle("Sistema de inventario");
        i18n.getHeader().setDescription("SubaCom");
        i18n.setAdditionalInformation(null);
        i18n.setForm(new LoginI18n.Form());
        i18n.getForm().setSubmit("Sign in");
        i18n.getForm().setTitle("Sign in");
        i18n.getForm().setUsername("Email");
        i18n.getForm().setPassword("Password");
        setI18n(i18n);
        setForgotPasswordButtonVisible(true);
        setAction("login");
        getElement().setVisible(true);
    }

    @Override
    public void afterNavigation(AfterNavigationEvent afterNavigationEvent) {
        setError(
                afterNavigationEvent.getLocation().getQueryParameters().getParameters().containsKey(
                        "error"
                )
        );
    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        if (SecurityUtils.estaLogeado()){
            beforeEnterEvent.forwardTo(MainView.class);
        }
    }
}