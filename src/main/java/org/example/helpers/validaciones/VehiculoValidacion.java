package org.example.helpers.validaciones;

import org.example.helpers.mensajes.MensajesVehiculo;

public class VehiculoValidacion {

    public boolean validarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarMarca(String marca) {return true;}

    public boolean validarModelo(String fechaModelo) {return true;}

    public boolean validarKilometraje() {return true;}

    public boolean validarColor() {return true;}

    public boolean validarDescripcion() {return true;}

    public boolean validarTipo() {return true;}

    public boolean validarAutonomia() {return true;}

    public boolean validarCapacidad() {return true;}

    public boolean validarAvaluo() {return true;}


}
