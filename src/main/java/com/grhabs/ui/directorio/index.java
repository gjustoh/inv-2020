package com.grhabs.ui.directorio;

import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Directorio;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.DirectorioService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="directorio")
public class index extends VerticalLayout {

    public index(DirectorioService directorioService) {
        Grid<Directorio> grid = new Grid<>(Directorio.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(directorioService.findAll());
        add(grid);
    }


}
