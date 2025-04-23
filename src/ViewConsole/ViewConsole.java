package ViewConsole;
import Models.Book;

public class ViewConsole {
    
    public void listaprint(Book[] libros){
        for (int i = 0 ; i< libros.length - 1 - i ; i++){
            for (int j = 0 ; j< libros.length; j++ ){

                if(libros[j].getName().compareTo(libros[j+1].getName())){
                    Book temp = libros[j];

                    libros[j] = libros[j+1];
                    libros[j+1] = temp

                    
                }

            }       

        }
    }

}
    
