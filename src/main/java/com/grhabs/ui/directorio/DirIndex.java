package com.grhabs.ui.directorio;

import com.grhabs.MainView;
import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Directorio;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.DirectorioService;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route(value="directorio", layout = MainView.class)
@CssImport("./styles/shared-styles.css")
public class DirIndex extends VerticalLayout {
    private final DirectorioForm form;
    Grid<Directorio> grid = new Grid<>(Directorio.class);
    TextField filterText = new TextField();
    DirectorioService directorioService = new DirectorioService();
    public DirIndex(DirectorioService directorioService) {
        this.directorioService = directorioService;
        addClassName("list-view");
        setSizeFull();
        configureGrid();
        configureFilter();

        form=new DirectorioForm();
        form.getElement().getStyle().set("class","directorio-form");
        Div contenido = new Div(grid, form);
        contenido.addClassName("contenido");
        contenido.setSizeFull();

        add(filterText,contenido);
        updateList();
    }

    private void configureFilter() {
        filterText.setPlaceholder("Filtrar por nombre ");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);
        filterText.addValueChangeListener(e->updateList());
    }
    private void updateList() {
        grid.setItems(directorioService.findAll(filterText.getValue()));
    }

    private void configureGrid() {
        grid.addClassName("directorio-grid");
        grid.setColumns();
        grid.addColumn("iddirectorio").setHeader("ID");
        grid.addColumn("nombre").setHeader("Nombre");
        grid.addColumn("direccion").setHeader("Direccion");
        grid.addColumn("telefonos").setHeader("Telefono");
        grid.addColumn("colonia").setHeader("Colonia");
        grid.addColumn("codigopostal").setHeader("Nº Postal");
        grid.addColumn("ciudadestado").setHeader("Ciudad");
        grid.addColumn("notas").setHeader("Notas");
        grid.addColumn("email").setHeader("EMAIL");
        grid.getColumns().forEach(col->col.setAutoWidth(true));
    }


}
