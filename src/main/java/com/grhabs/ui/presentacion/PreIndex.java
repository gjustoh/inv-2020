package com.grhabs.ui.presentacion;

import com.grhabs.MainView;
import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Presentacion;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.PresentacionService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="presentacion", layout = MainView.class)
public class PreIndex extends VerticalLayout {

    public PreIndex(PresentacionService presentacionService) {
        Grid<Presentacion> grid = new Grid<>(Presentacion.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(presentacionService.findAll());
        add(grid);
    }


}
