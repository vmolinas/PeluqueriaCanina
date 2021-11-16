package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearMascota(Mascota mascota){
        controlPersis.crearMascota(mascota);
    }
    
    //
    public void crearMascota (String nombre, String raza, String color, String alergico, String atencionEsp, String duenio, String celular, String observaciones){
        Mascota mascota = new Mascota();
        mascota.setNombre_mascota(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergia(alergico);
        mascota.setAtencion_especial(atencionEsp);
        mascota.setNombre_duenio(duenio);
        mascota.setCelular_duenio(celular);
        mascota.setObservaciones(observaciones);
        
        controlPersis.crearMascota(mascota);
    }
}