package com.grhabs.ui.distrito;

import com.grhabs.MainView;
import com.grhabs.backend.data.Distrito;
import com.grhabs.backend.services.DistritoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "distritos" ,layout = MainView.class)
public class distritoIndex extends VerticalLayout {
    Grid<Distrito> grid = new Grid<>(Distrito.class);

    @Autowired
    public distritoIndex(DistritoService ds) {
        grid.setColumns();
        grid.addColumn("id").setHeader("ID");
        grid.addColumn("nombre").setHeader("Nombre");
        grid.addColumn("provincia_id").setHeader("Provincia");
        grid.addColumn("departamento_id").setHeader("Departamento");
        grid.setItems(ds.findDepProvAll());
        add(grid);
    }
}
