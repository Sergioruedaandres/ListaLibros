
/**
 * Lista de libro de una biblioteca
 * 
 * @author Sergio y Pablo
 * @version (1.1)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
        primero = null;
    }

    /**
    * Completar los metodos
    *
    * Incluye un nuevo libro en la lista
    */
    public void pon( Libro valor){
        valor = valor.siguiente;
        primero = valor;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
    }
    /**
     Devuelve un libro que es eliminado de la lista o null si no exite
    */
    public Libro quitar ( int id ) {
        if (estaVacia()) return null;
        Libro p2 = primero;
        Libro p1 = primero.siguiente;
        while (p1 != null){
            if (p1.id == id){
                p2.siguiente = p1.siguiente;
                return primero;
            }
            p2=p1;
            p1=p1.siguiente;
        }
        return null;
    }
    /**
     *
     * 
     *Devuelve el id del libro o -1 si no esta
     */
    public int buscarId ( String titulo ){
        Libro aux = primero;
        while (aux!=null){
            if (aux.titulo.equals(titulo)) return aux.id;
        }
        return -1;    
    }
    /**
     * Muestra los libros almacenados
     */
    public void verCatalogo (){
        Libro aux = primero;
        while (aux != null){
            System.out.println(aux);
        }
    }
}
