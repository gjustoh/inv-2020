import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';    
import '@vaadin/vaadin-text-field/src/vaadin-email-field.js';
import {set} from "@polymer/polymer/lib/utils/path";

class FormView extends PolymerElement {
    
    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    padding-right: var(--lumo-space-l); 
                }
                :host #nombre{
                    max-width: 204px;
                }
                :host #direccion{
                    max-width: 254px;
                }
                :host #telefono{
                    max-width: 104px;
                }
                :host #postal{
                    width: 84px;
                }
                :host #postal{
                    max-width: 84px;
                }
            </style>
<div style="width: 100%; height: 100%;">
 <vaadin-form-layout>
  <vaadin-text-field label="Nombre" value="" theme="align-right" placeholder="Juan Perez" id="nombre"></vaadin-text-field>
  <vaadin-text-field label="Direccion" placeholder="Calle jerusalen 215" id="direccion"></vaadin-text-field>
  <vaadin-text-field label="Telefono" id="telefono" value="" theme="align-right" placeholder="975622548" has-value></vaadin-text-field>
  <vaadin-text-field label="Nº Postal" value="" theme="align-right" placeholder="051" has-value id="postal"></vaadin-text-field>
  <vaadin-text-field label="Ciudad" value="" theme="align-right" placeholder="Carcabana" id="ciudad"></vaadin-text-field>
  <vaadin-text-area label="Notas" placeholder="Ingrese sus notas aqui" id="notas"></vaadin-text-area>
  <vaadin-radio-group label="Cliente" id="cliente" value="0">
   <vaadin-radio-button value="1" checked>
     si 
   </vaadin-radio-button>
   <vaadin-radio-button checked value="0">
     no 
   </vaadin-radio-button>
  </vaadin-radio-group>
  <vaadin-radio-group label="Proveedor" id="proveedor" value="on">
   <vaadin-radio-button value="1">
     si 
   </vaadin-radio-button>
   <vaadin-radio-button tabindex="0" checked>
     no 
   </vaadin-radio-button>
  </vaadin-radio-group>
  <vaadin-email-field pattern="^[a-zA-Z0-9.!#$%&amp;’*+/=?^_{|}~-]+@[a-zA-Z0-9-]+(?:.[a-zA-Z0-9-]+)*$" label="Email" id="email"></vaadin-email-field>
  <vaadin-button theme="primary" id="guardar">
    Guardar 
  </vaadin-button>
  <vaadin-button theme="error" id="eliminar">
    Eliminar 
  </vaadin-button>
  <vaadin-button theme="tertiary" id="cancelar">
    Cancelar 
  </vaadin-button>
 </vaadin-form-layout>
</div>
`;
    }

    static get is() {
        return 'form-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(FormView.is, FormView);
