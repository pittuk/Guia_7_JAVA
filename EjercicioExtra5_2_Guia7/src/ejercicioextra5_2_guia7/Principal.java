package ejercicioextra5_2_guia7;

//@author pittu
import Entidad.Triangulo;
import Servicio.ServicioTriangulo;

public class Principal {

    public static void main(String[] args) {
       Triangulo[] arrayTri=new Triangulo[4];
        ServicioTriangulo accion = new ServicioTriangulo();

        accion.crearTriangulos(arrayTri);
        accion.calcularArea(arrayTri);
        
        accion.calcularPerimetro(arrayTri);
        
        

    }

}
