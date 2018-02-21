import java.util.ArrayList;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Mundo[] principal = new Mundo[100];
        //Añadir objeto lo almacenamos en un Array de objetos
        for (Mundo a : principal){
            a.añadirObjetoAUsuario(user,objeto);
        }
        //Llamar a la lista de objetos de un usuario
        for (Mundo b : principal){
            ArrayList<Objeto> res = new ArrayList<>();
            res = b.consultarObjetosDeUsuario(user);
            for (int i=0; i<res.size();i++)
            System.out.println(res.get(i));
        }
        //LLamar a consultar un obejeto
        for (Mundo c : principal){
            Objeto objeto = c.consultarObjetoDeUsuario(user,nombreObjeto);
        }
        //Llamar a la funcion eliminar
        for (Mundo d : principal){
            Boolean eliminar = d.eliminarObjetosDeUsuario(user);
            if (eliminar == true)
                System.out.println("Los objetos han sido eliminados");
            else
                System.out.println("Los objetos no has podido ser eliminados");
        }

    }
}
