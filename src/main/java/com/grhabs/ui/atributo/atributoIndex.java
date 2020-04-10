package com.grhabs.ui.atributo;

import com.grhabs.MainView;
import com.grhabs.backend.data.Atributo;
import com.grhabs.backend.services.AtributoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "atributo", layout = MainView.class)
public class atributoIndex extends VerticalLayout {
    Grid<Atributo> grid = new Grid<>(Atributo.class);
    @Autowired
    public atributoIndex(AtributoService as) {
//        grid.setColumns();
//        grid.addColumn("")
        grid.setItems(as.findAll());
        add(grid);
    }
}
