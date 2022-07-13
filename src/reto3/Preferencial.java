package reto3;

public class Preferencial extends Asistente {

    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    boolean participasorteo;
    //Y SU MÉTODO CONSTRUCTOR
    
    public Preferencial(String id, String nombre, String direccion) {
        this.idTiquete=id;
        this.nombreCompleto=nombre;
        this.direccionResidencia=direccion;
        this.participasorteo = false;
    }
    
    public void participarSorteo() {

        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //participarSorteo()
        if (this.isParticipaSorteo()) {
            this.setParticipaSorteo(false);
        } else {
            this.setParticipaSorteo(true);
        }
    }

    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public boolean isParticipaSorteo() {
        return participasorteo;
    }
    
    public void setParticipaSorteo(boolean participasorteo) {
        this.participasorteo = participasorteo;
    }
    
}
