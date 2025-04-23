package Controllers;

import Models.Book;

public class LibroController {
    // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] libros) {

        for (int i = 1 ; i<libros.length ; i++){
            Book izq = libros[0];
            Book der = libros[i-1];


        }

       

    }


// Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] libros, String nombre) {
    // Implementación pendiente
        return null;
    }
}
