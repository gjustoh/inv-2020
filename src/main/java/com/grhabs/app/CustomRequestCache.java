package com.grhabs.app;

import com.grhabs.ui.login.login;
import com.vaadin.flow.server.VaadinServletRequest;
import com.vaadin.flow.server.VaadinServletResponse;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomRequestCache extends HttpSessionRequestCache {

    @Override
    public void saveRequest(HttpServletRequest request, HttpServletResponse response) {
        if (!SecurityUtils.isFrameworkInternalRequest(request)) {
            super.saveRequest(request, response);
        }
    }

}
