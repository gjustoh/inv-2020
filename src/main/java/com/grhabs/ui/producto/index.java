package com.grhabs.ui.producto;

import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Producto;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.ProductoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="producto")
public class index extends VerticalLayout {

    public index(ProductoService productoService) {
        Grid<Producto> grid = new Grid<>(Producto.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(productoService.findAll());
        add(grid);
    }


}
