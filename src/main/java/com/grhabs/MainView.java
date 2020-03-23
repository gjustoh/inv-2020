package com.grhabs;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.RouterLink;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import java.util.HashMap;
import java.util.Map;

@Route(value="")
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends AppLayout implements BeforeEnterObserver {

    private Tabs tabs = new Tabs();
    private Map<Class<? extends Component>, Tab> navigationTargetToTab = new HashMap<>();

    public MainView() {
        Image img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
        img.setHeight("44px");
        addMenuTab("tablas", DefaultView.class);
        addMenuTab("Main", DefaultView.class);
        addMenuTab("Main", DefaultView.class);
        addMenuTab("Main", DefaultView.class);
        addMenuTab("Main", DefaultView.class);
        addMenuTab("Main", DefaultView.class);

        addMenuTab("Admin", AdminView.class);
        addMenuTab("Dashboard", DashboardView.class);
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        addToDrawer(tabs);
        addToNavbar(img,new DrawerToggle());
    }

    private void addMenuTab(String label, Class<? extends Component> target) {
        Tab tab = new Tab(new RouterLink(label, target));
        tab.add(VaadinIcon.EDIT.create());
        tab.add("hola");
        MenuBar menubar = new MenuBar();
        MenuItem mi = menubar.addItem("m", null);
        tab.add(mi);
        navigationTargetToTab.put(target, tab);
        tabs.add(tab);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        tabs.setSelectedTab(navigationTargetToTab.get(event.getNavigationTarget()));
    }
}

@Route(value = "default", layout = MainView.class)
class DefaultView extends Div {
    public DefaultView() {
        add(new Span("Default view content"));
    }
}

@Route(value = "admin", layout = MainView.class)
class AdminView extends Div {
    public AdminView() {
        add(new Span("Admin view content"));
    }
}

@Route(value = "dashboard", layout = MainView.class)
class DashboardView extends Div {
    public DashboardView() {
        add(new Span("Dashboard view content"));
    }
}


