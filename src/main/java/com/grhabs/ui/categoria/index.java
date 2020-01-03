package com.grhabs.ui.categoria;

import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.services.CategoriaService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="categoria")
public class index extends VerticalLayout {

    public index(CategoriaService categoriaService) {
        Grid<Categoria> grid = new Grid<>(Categoria.class);
        grid.setColumns();
        grid.addColumn("idcategoria").setHeader("ID");
        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(categoriaService.findAll());
        add(grid);
    }


}
