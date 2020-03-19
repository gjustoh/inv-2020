package com.grhabs.ui.directorio;

import com.grhabs.backend.data.Directorio;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.polymertemplate.TemplateParser;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.templatemodel.TemplateModel;
@Tag("form-view")
@JsModule("./src/directorio/form-view.js")
public class DirectorioForm extends PolymerTemplate<DirectorioForm.Model>{



    public interface Model extends TemplateModel {
        void setTotalPrice(String totalPrice);

        void setStatus(String status);
    }

    /*TextField id = new TextField("ID");
    TextField nombre = new TextField("Nombres");
    TextField direccion = new TextField("Direccion");
    TextField telefonos = new TextField("Telefono");
    TextField codigopostal = new TextField("Nº Postal");
    TextField ciudadestado = new TextField("Ciudad");
    TextField notas = new TextField("Notas");
    RadioButtonGroup<Integer> esCliente = new RadioButtonGroup <>();
    *//*group.setItems("foo", "bar", "baz");
group.addValueChangeListener(event -> message.setText(String.format(
            "Radio button group value changed from '%s' to '%s'",
            event.getOldValue(), event.getValue())));*//*
    RadioButtonGroup<String> esProveedor = new RadioButtonGroup<>();
    EmailField email = new EmailField("Email");
    TextField colonia = new TextField("Colonia");

    Button save = new Button("Guardar");
    Button delete = new Button("Eliminar");
    Button cancel = new Button("Cancelar");
    Binder<Directorio> directorio = new BeanValidationBinder<>(Directorio.class);

    public void setDirectorio(Directorio dir){
        directorio.setBean(dir);
    }

    public DirectorioForm() {
        esCliente.setLabel("Cliente");
        esCliente.setItems(2,3);
        esCliente.setValue(1);
        esCliente.setValue(2);
        esProveedor.setLabel("Proveedor");
        esProveedor.setItems("si","no");
        addClassName("directorio-form");
        esCliente.ite();
//        configurarRadioButton(esCliente);
        directorio.forField(esCliente).getField().getOptionalValue();
        directorio.bindInstanceFields(this);
        add(
                id,
                nombre,
                direccion,
                telefonos,
                codigopostal,
                ciudadestado,
                notas,
                esCliente,
                esProveedor,
                email,
                colonia,
                id,
                createButtonsLayout()
        );

    }

//    private void configurarRadioButton(HasValue<?, ?> campo) {
//        directorio.forField(campo)
//                .withConverter()
//    }

    private Component createButtonsLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        save.addClickShortcut(Key.ENTER);
        cancel.addClickShortcut(Key.ESCAPE);
        save.addClickListener(click -> validateAndSave());
        delete.addClickListener(click -> fireEvent(new DeleteEvent(this,directorio.getBean())));
        cancel.addClickListener(click -> fireEvent(new CloseEvent(this)));
        directorio.addStatusChangeListener(evnt ->save.setEnabled(directorio.isValid()));
        return new HorizontalLayout(save,delete,cancel);
    }

    private void validateAndSave() {
        if (directorio.isValid()){
            fireEvent(new SaveEvent(this,directorio.getBean()));
        }
    }*/

    public static abstract class DirectorioFormEvent extends ComponentEvent<DirectorioForm>{
        Directorio directorio;
        public DirectorioFormEvent(DirectorioForm source, Directorio directorio) {
            super(source, false);
            this.directorio = directorio;
        }
        public Directorio getDirectorio(){
            return directorio;
        }
    }
    public static class SaveEvent extends DirectorioFormEvent {
        SaveEvent(DirectorioForm source, Directorio directorio) {
            super(source, directorio);
        }
    }

    public static class DeleteEvent extends DirectorioFormEvent {
        DeleteEvent(DirectorioForm source, Directorio directorio) {
            super(source, directorio);
        }

    }

    public static class CloseEvent extends DirectorioFormEvent {
        CloseEvent(DirectorioForm source) {
            super(source, null);
        }
    }

    public <T extends ComponentEvent<?>> Registration addListener(Class<T> eventType,
                                                                  ComponentEventListener<T> listener) { //
        return getEventBus().addListener(eventType, listener);
    }


}
