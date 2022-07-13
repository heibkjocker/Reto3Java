package reto3;

//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()
import java.util.Random;

public class VIP extends Asistente {

    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    boolean[] pantallas;
    String credencialesPrevia;

    //Y SU MÉTODO CONSTRUCTOR
    public VIP(String id, String nombre, String direccion) {
        this.idTiquete=id;
        this.nombreCompleto=nombre;
        this.direccionResidencia=direccion;
        pantallas = new boolean[]{false, false, false};
    }

    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if (credencialesPrevia.isEmpty()) {
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }

    public void asignarPantalla(int pantalla) {

        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //asignarPantalla()
        if(pantalla < 0 && pantalla < 4){
            if(this.pantallas[pantalla]){
                pantallas[pantalla] = false;
                this.setPantallas(pantallas);
            } else {
                pantallas[pantalla] = true;
                this.setPantallas(pantallas);
            }
        }
        
        
    }

    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

}
