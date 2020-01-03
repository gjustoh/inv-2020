package com.grhabs.ui.pedido;

import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Pedido;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.PedidoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="pedido")
public class index extends VerticalLayout {

    public index(PedidoService pedidoService) {
        Grid<Pedido> grid = new Grid<>(Pedido.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(pedidoService.findAll());
        add(grid);
    }


}
