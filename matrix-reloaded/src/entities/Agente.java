package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivel=1;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int getNivel() {
        return nivel;
    }

    public void incrementarNivel() {
        this.nivel++;
        System.out.println("Nivel incrementado , Nivel actual: " + this.nivel);
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial + "  Nivel: "+this.nivel+
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
