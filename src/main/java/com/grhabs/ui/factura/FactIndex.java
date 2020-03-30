package com.grhabs.ui.factura;

import com.grhabs.MainView;
import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Factura;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.FacturaService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="factura", layout = MainView.class)
public class FactIndex extends VerticalLayout {

    public FactIndex(FacturaService facturaService) {
        Grid<Factura> grid = new Grid<>(Factura.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(facturaService.findAll());
        add(grid);
    }


}
