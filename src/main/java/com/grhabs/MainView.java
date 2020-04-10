package com.grhabs;


import com.flowingcode.addons.applayout.*;
import com.flowingcode.addons.applayout.MenuItem;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;

import java.awt.*;


@Route(value="")
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout implements RouterLayout {
    private VerticalLayout container = new VerticalLayout();
    private final AppLayout app = new AppLayout(createLogoImage(), createAvatarComponent(), "Inventario");
    private final ToolbarIconButton miSettings = new ToolbarIconButton("Settings", "settings", this::openSettings);

    public MainView() {
        container.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        container.setSizeFull();

        this.setPadding(true);
        this.setSpacing(true);
        this.setMargin(true);

        app.setMenuItems(createMenuItems());

        app.setToolbarIconButtons(miSettings);
        this.add(app, container);



    }


    private void openSettings() {
        Dialog dialog = new Dialog();
        H3 title = new H3("Demo settings");
        title.getStyle().set("margin-top", "0");
        dialog.add(title);

        Checkbox cbMenuVisible = new Checkbox("Menu visible");
        Checkbox cbSwipeOpen = new Checkbox("Swipe Open");
        Checkbox cbFixed = new Checkbox("Fixed");
        Checkbox cbReveals = new Checkbox("Reveals");
        Checkbox cbCompact = new Checkbox("Compact");

        cbMenuVisible.getElement().setAttribute("title", "Toggle visibility of the hamburguer icon.");
        cbSwipeOpen.getElement().setAttribute("title", "When enabled, you can open the menu by swiping the left border of the screen.");
        cbFixed.getElement().setAttribute("title", "When enabled, the header is fixed at the top so it never moves away.");
        cbReveals.getElement().setAttribute("title", "When enabled, the header slides back when scrolling back up.");
        cbCompact.getElement().setAttribute("title", "When enabled, the height of the header is set to 32px.");

        VerticalLayout content = new VerticalLayout(
                cbMenuVisible,
                cbSwipeOpen,
                cbFixed,
                cbReveals,
                cbCompact);
        content.setSpacing(false);

        HorizontalLayout buttons = new HorizontalLayout();
        Button btnOk = new Button("OK", ev -> {
            dialog.close();
        });

        Button btnCancel = new Button("Cancel", ev -> dialog.close());
        btnOk.getElement().setAttribute("theme", "primary");
        buttons.setSpacing(true);
        buttons.add(btnOk, btnCancel);
        buttons.setSpacing(true);

        dialog.add(content, buttons);
        dialog.setSizeUndefined();
        dialog.open();
    }

    private Image createLogoImage() {
        Image img = new Image("img/log.png","subacom");
        img.setHeight("50px");
        img.addClassName("applogo");
        return img;
    }

    private Component createAvatarComponent() {
        Div container = new Div();
        container.getElement().setAttribute("style", "text-align: center;");
        Image img = new Image("/frontend/images/avatar.png","avatar");
        img.getStyle().set("width", "80px");
        img.getStyle().set("margin-top", "20px");
        H4 h4 = new H4("User");
        container.add(img,h4);
        return container;
    }

    private void toggleSettings(MenuItem toggleSettings) {

        app.setToolbarIconButtons(miSettings);
           toggleSettings.setLabel("Enable settings");
    }

    private Component[] createMenuItems() {

        MenuItem miToggleSettings = new MenuItem().setIcon("settings");
        miToggleSettings.setCommand(() -> toggleSettings(miToggleSettings));
        toggleSettings(miToggleSettings);

        this.getElement().getStyle().set("--icon-spacing", "normal");

        return new Component[] {
               miToggleSettings,
                new MenuItem("Almacen", VaadinIcon.STORAGE, () -> com.vaadin.flow.component.UI.getCurrent().navigate("almacen")),
                new MenuItem("Categoria", VaadinIcon.INDENT, () -> com.vaadin.flow.component.UI.getCurrent().navigate("categoria")),
                new MenuItem("Directorio", VaadinIcon.PHONE, () -> com.vaadin.flow.component.UI.getCurrent().navigate("directorio")),
                new MenuItem("Factura", VaadinIcon.INVOICE, () -> com.vaadin.flow.component.UI.getCurrent().navigate("factura")),
                new MenuItem("atributo", VaadinIcon.MONEY_DEPOSIT, () -> com.vaadin.flow.component.UI.getCurrent().navigate("atributo")),
                new MenuItem("Pedido", VaadinIcon.CLIPBOARD_TEXT, () -> com.vaadin.flow.component.UI.getCurrent().navigate("pedido")),
                new MenuItem("Presentacion", VaadinIcon.BUTTON, () -> com.vaadin.flow.component.UI.getCurrent().navigate("presentacion")),
                new MenuItem("producto", VaadinIcon.ARCHIVE, () -> com.vaadin.flow.component.UI.getCurrent().navigate("producto")),
                new MenuItem("Usuario", VaadinIcon.USER, () -> com.vaadin.flow.component.UI.getCurrent().navigate("usuario")), //icon as string
//                new MenuItem("Clear Items", "clear", () -> app.clearMenuItems()),
                new MenuItem("Ubigeo")
                        .setIcon("build")
                        .add(
                        new MenuItem("Distritos", "inbox",()->com.vaadin.flow.component.UI.getCurrent().navigate("distritos")),
                        new MenuItem("And Again",()->showContent("And Again!")),
                        new MenuItem("SubMenu")
                                .add(new MenuItem("Hello Again",()->showContent("Hello Again!")))
                                .add(new MenuItem("And Again",()->showContent("And Again!")))
                ),

        };
    }

    private void showContent(String content) {
        container.setClassName("");
        container.removeAll();
        H3 label = new H3();
        label.setSizeFull();
        label.setText(content);

    }
}