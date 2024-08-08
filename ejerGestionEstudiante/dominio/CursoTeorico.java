package ejerGestionEstudiante.dominio;

import ejerGestionEstudiante.enumeration.ModalidadEnum;

public class CursoTeorico extends Curso {
    private ModalidadEnum modalidad;

    public ModalidadEnum getModalidad() {
        return modalidad;
    }

    public void setModalidad(ModalidadEnum modalidad) {
        this.modalidad = modalidad;
    }
}
