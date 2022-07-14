package reto3;

public class Preferencial extends Asistente {

    // ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE

    boolean participaSorteo;

    // Y SU MÉTODO CONSTRUCTOR
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;

    }

    public void participarSorteo() {

        // ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        // participarSorteo()
        if (isParticipaSorteo()) {
            setParticipaSorteo(false);;
        } else {
            setParticipaSorteo(true);
        }

    }

    // ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    // SETTER DEL CASO
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }

}