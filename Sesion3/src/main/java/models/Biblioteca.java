package models;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();



    public void agregarLibro(String titulo){
        libros.add(new Libro(titulo));
    }
    public void mostrarLibros(){
        System.out.println("\tLista de libros");
        libros.forEach(libro -> System.out.println(libro));
    }

    private static class Libro{
        private String titulo;

        public Libro(String titulo){
            this.titulo = titulo;
        }

        public Libro() {
        }

        public String getTitulo() {
            return titulo;
        }
        public String setTitulo(String titulo) {
            return this.titulo;
        }

        @Override
        public String toString() {
            System.out.printf("Titulo: %s\n", this.titulo);
            return "";
        }
    }

}
