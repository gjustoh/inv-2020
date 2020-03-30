package com.grhabs.ui.usuario;

import com.grhabs.MainView;
import com.grhabs.backend.data.Categoria;
import com.grhabs.backend.data.Usuario;
import com.grhabs.backend.services.CategoriaService;
import com.grhabs.backend.services.UsuarioService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="usuario", layout = MainView.class)
public class UserIndex extends VerticalLayout {

    public UserIndex(UsuarioService UsuarioService) {
        Grid<Usuario> grid = new Grid<>(Usuario.class);
//        grid.setColumns();
//        grid.addColumn("idcategoria").setHeader("ID");
//        grid.addColumn("categoria").setHeader("Nombre");
        grid.setItems(UsuarioService.findAll());
        add(grid);
    }


}
