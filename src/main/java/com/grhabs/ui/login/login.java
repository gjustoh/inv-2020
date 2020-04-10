package com.grhabs.ui.login;

import com.grhabs.MainView;
import com.grhabs.app.CustomRequestCache;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.*;
import com.vaadin.flow.component.UI;
import  com.grhabs.app.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collections;
@PageTitle("Login")
@Route(value = "login")
public class login extends LoginOverlay implements AfterNavigationObserver, BeforeEnterObserver {
    public static final String ROUTE = "login";
    @Autowired
    public login() {
        // configures login dialog and adds it to the main view
        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setHeader(new LoginI18n.Header());
        i18n.getHeader().setTitle("Sistema de inventario");
        i18n.getHeader().setDescription(
                "admin@vaadin.com + admin\n" + "barista@vaadin.com + barista");
        i18n.setAdditionalInformation(null);
        i18n.setForm(new LoginI18n.Form());
        i18n.getForm().setSubmit("Sign in");
        i18n.getForm().setTitle("Sign in");
        i18n.getForm().setUsername("Email");
        i18n.getForm().setPassword("Password");
        setI18n(i18n);
        setForgotPasswordButtonVisible(false);
        setAction("login");
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