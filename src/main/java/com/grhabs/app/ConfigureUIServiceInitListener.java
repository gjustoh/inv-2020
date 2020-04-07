package com.grhabs.app;

import com.grhabs.ui.login.login;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;

public class ConfigureUIServiceInitListener implements VaadinServiceInitListener {
    @Override
    public void serviceInit(ServiceInitEvent serviceInitEvent) {
        serviceInitEvent.getSource().addUIInitListener(uiInitEvent -> {
            final UI ui = uiInitEvent.getUI();
            ui.addBeforeEnterListener(this::beforeEnter);
        });
    }
    /**
     *
     * Redirige al usuario si no está autorizado para acceder a la vista.
     *
     * @param event
     *          antes del evento de navegación con detalles del evento
     */
    private void beforeEnter(BeforeEnterEvent event) {
        if (!login.class.equals(event.getNavigationTarget()) //
                && !SecurityUtils.isUserLoggedIn()) { //
            event.rerouteTo(login.class); //
        }
    }
}
