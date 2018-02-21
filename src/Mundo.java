import java.util.ArrayList;

public class Mundo {
    //Crear las funciones
    public void añadirObjetoAUsuario(Usuario u, Objeto o){
       u.AddObjeto(o);
    }

    public ArrayList<Objeto> consultarObjetosDeUsuario(Usuario u) {
        ArrayList<Objeto> lista = new ArrayList<>();
        lista = u.listado();
        System.out.println(lista);
        return lista;
    }

    public Objeto consultarObjetoDeUsuario(Usuario u, String nombreObjeto) {
        Objeto objeto;
        objeto = u.busqueda(nombreObjeto);
        return objeto;

    }
    public boolean eliminarObjetosDeUsuario(Usuario u){
            boolean eliminar = u.eliminarObjeto();
            return eliminar;
    }
}
