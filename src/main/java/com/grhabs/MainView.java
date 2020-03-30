package com.grhabs;

import com.github.appreciated.app.layout.addons.notification.component.NotificationButton;
import com.github.appreciated.app.layout.component.appbar.AppBarBuilder;
import com.github.appreciated.app.layout.component.applayout.LeftLayouts;
import com.github.appreciated.app.layout.component.builder.AppLayoutBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftAppMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftSubMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.items.LeftClickableItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftNavigationItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftSectionItem;
import com.github.appreciated.app.layout.component.router.AppLayoutRouterLayout;

import com.grhabs.ui.almacen.AlmIndex;
import com.grhabs.ui.categoria.CatIndex;
import com.grhabs.ui.directorio.DirIndex;
import com.grhabs.ui.factura.FactIndex;
import com.grhabs.ui.pago.PagIndex;
import com.grhabs.ui.pedido.PedIndex;
import com.grhabs.ui.presentacion.PreIndex;
import com.grhabs.ui.producto.ProIndex;
import com.grhabs.ui.usuario.UserIndex;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import static com.github.appreciated.app.layout.entity.Section.HEADER;
import static com.github.appreciated.app.layout.entity.Section.FOOTER;

@Route(value="")
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends AppLayoutRouterLayout<LeftLayouts.LeftResponsive> {

    private LeftNavigationItem arti;
    public MainView() {
        LeftNavigationItem menu;menu = new LeftNavigationItem("menu",VaadinIcon.ENTER,DefaultView.class);
        arti = new LeftNavigationItem("Articulos", VaadinIcon.BOOK.create(), DefaultView.class);
        init(AppLayoutBuilder.get(LeftLayouts.LeftResponsive.class)
                .withAppBar(AppBarBuilder.get().add(new DrawerToggle())
                .add(new Image("img/logo.png", "logo"))
                .build())
                .withTitle("sd")
                .withAppBar(AppBarBuilder.get()
                        .build())
                .withAppMenu(LeftAppMenuBuilder.get()
                        .addToSection(HEADER,
                                new LeftSectionItem("COMISOFTWARE")//,
                                //new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ..."))
                        ).add(new LeftNavigationItem("Almacen",VaadinIcon.ENTER, AlmIndex.class),
                                new LeftNavigationItem("Categoria",VaadinIcon.ENTER, CatIndex.class),
                                new LeftNavigationItem("Directorio",VaadinIcon.ENTER, DirIndex.class),
                                new LeftNavigationItem("Factura",VaadinIcon.ENTER, FactIndex.class),
                                new LeftNavigationItem("Pago",VaadinIcon.ENTER, PagIndex.class),
                                new LeftNavigationItem("Pedido",VaadinIcon.ENTER, PedIndex.class),
                                new LeftNavigationItem("Presentacion",VaadinIcon.ENTER, PreIndex.class),
                                new LeftNavigationItem("producto",VaadinIcon.ENTER, ProIndex.class),
                                new LeftNavigationItem("Usuario",VaadinIcon.ENTER, UserIndex.class),
                                new LeftNavigationItem("prueba",VaadinIcon.ENTER,DefaultView.class),menu
                        )
                        .addToSection(FOOTER, new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ..."))).build()).build());

    }
}

@Route(value = "default", layout = MainView.class)
class DefaultView extends Div {
    public DefaultView() {
        add(new Span("Default view content"));
    }
}

