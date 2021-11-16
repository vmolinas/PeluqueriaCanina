package logica;
import igu.Pantalla;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Pantalla pantalla = new Pantalla(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
}
