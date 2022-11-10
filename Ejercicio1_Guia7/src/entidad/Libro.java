package entidad;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public Libro LlenarLibro() {
        Scanner leerN = new Scanner(System.in);
        Scanner leerT = new Scanner(System.in);
        Libro libroLleno = new Libro();

        System.out.println("Ingrese el ISBN ");
        libroLleno.setISBN(leerN.nextInt());
        System.out.println("Ingrese el titulo ");
        libroLleno.setTitulo(leerT.nextLine());
        System.out.println("Ingrese el autor ");
        libroLleno.setAutor(leerT.nextLine());
        System.out.println("Ingrese Numero de paginas ");
        libroLleno.setNumeroPaginas(leerN.nextInt());

        return libroLleno;

    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
    

}
