package persistencia;
import logica.Mascota;

public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    //Método para alta
    public void crearMascota(Mascota mascota){
        try{
            mascotaJPA.create(mascota);
        }catch(Exception e){
            System.out.println("No se pudo crear la mascota");
        }
    }
}