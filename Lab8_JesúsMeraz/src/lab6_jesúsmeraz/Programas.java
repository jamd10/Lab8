package Lab6_JesúsMeraz;

public class Programas {

    private String nombre, tipo, genero;
    private int Puntuacion, años;

    public Programas() {
    }

    public Programas(String nombre, String tipo, String genero, int Puntuacion, int años) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.Puntuacion = Puntuacion;
        this.años = años;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
