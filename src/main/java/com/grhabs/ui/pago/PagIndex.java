package com.grhabs.ui.pago;

import com.grhabs.MainView;
import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Pago;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.PagoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="pago", layout = MainView.class)
public class PagIndex extends VerticalLayout {

    public PagIndex(PagoService pagoService) {
        Grid<Pago> grid = new Grid<>(Pago.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(pagoService.findAll());
        add(grid);
    }


}
