
public class  Objeto extends Usuario {
    private String nombreob;
    private String tipo;
    private String descripcion;
    private int valor;
    private int coste;

    public String getNombreob() {
        return nombreob;
    }
    public void setNombreob(String nombre) {
        this.nombreob = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCoste() {
        return coste;
    }
    public void setCoste(int coste) {
        this.coste = coste;
    }
}

