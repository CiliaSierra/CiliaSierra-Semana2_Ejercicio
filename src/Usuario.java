import java.util.ArrayList;

public class Usuario extends Mundo {
    private String nombre;
    private String password;
    private int nivel;
    private int ataque;
    private int defensa;
    private int resistencia;
    private int numobjetos;
    private ArrayList<Objeto> objeto = new ArrayList<>();//array de los objetos que tiene

    public int getNumobjetos() {
        return numobjetos;
    }

    public void setNumobjetos(int numobjetos) {
        this.numobjetos = numobjetos;
    }

    public ArrayList<Objeto> getObjeto() {
        return objeto;
    }

    public void setObjeto(ArrayList<Objeto> objeto) {
        this.objeto = objeto;
    }

    public void AddObjeto(Objeto o) {
        objeto.add(o);
        this.numobjetos++;
    }

    public ArrayList<Objeto> listado() {
        ArrayList<Objeto> lista = new ArrayList();

        for (int i = 0; i < this.numobjetos; i++)
            lista.set(i, objeto.get(i));
        return lista;
    }

    public Objeto busqueda(String nombre) {
        Objeto o;
        boolean encontrado = false;
        int j;
        for (j = 0; j < this.numobjetos || encontrado == false; j++) {
            if (objeto.get(j).getNombreob() == nombre)
                encontrado = true;
        }
        o = objeto.get(j);
        return o;

    }

    public boolean eliminarObjeto() {
        boolean elimino = false;
        objeto = null;
        this.numobjetos = 0;
        if (objeto.size() == 0)
            elimino = true;

        return elimino;
    }
}


