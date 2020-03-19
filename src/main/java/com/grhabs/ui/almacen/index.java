package com.grhabs.ui.almacen;

import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.services.AlmacenService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@Route(value="almacen")
public class index extends VerticalLayout {
    Grid<Almacen> grid = new Grid<>(Almacen.class);
    @Autowired
    public index(AlmacenService almacenService) {

        grid.setColumns();
        grid.addColumn("idmovimiento");
        grid.addColumn("iddirectorio");
        grid.addColumn("idproducto");
        grid.addColumn("cantidad");
        grid.addColumn("idpresentacion");
        grid.addColumn("fecha");
        grid.addColumn("entrada");
        grid.addColumn("salida");
        grid.addColumn("idpedido");
        grid.addColumn("pedido");
        grid.addColumn("factura");
        grid.addColumn("fechafactura");
        grid.getColumns().forEach(col->col.setAutoWidth(true));
        grid.setItems(almacenService.findAll());
        add(grid);
    }




}
