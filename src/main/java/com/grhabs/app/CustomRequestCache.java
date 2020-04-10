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
    public String resolveRedirectUrl() {
        SavedRequest savedRequest = getRequest(VaadinServletRequest.getCurrent().getHttpServletRequest(), VaadinServletResponse.getCurrent().getHttpServletResponse());
        if (savedRequest instanceof DefaultSavedRequest) {
//            Aquí usamos nuestra caché de solicitud personalizada para obtener la URL de redireccionamiento guardada
            final String requestURI = ((DefaultSavedRequest) savedRequest).getRequestURI();
//            Dado que Spring Security solo guarda la solicitud en casos excepcionales (el usuario no ha iniciado sesión)
//            , nos aseguramos de no encontrarnos aquí con un NPE. Además, evitamos los redireccionamientos a la vista de inicio de sesión.
            if (requestURI != null && !requestURI.isEmpty() && !requestURI.contains((login.ROUTE))) {
//                Un poco de satisfacción para satisfacer Ui.navigate()que espera enlaces relativos sin una barra diagonal.
                return requestURI.startsWith("/") ? requestURI.substring(1) : requestURI;
            }
        }
        return "";
    }



}
