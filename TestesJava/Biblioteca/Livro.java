package Biblioteca;
import java.util.ArrayList;


public class Livro {
    private String titulo;
    private String autor;
    private final int paginas;

public Livro(String titulo, String autor, int paginas){
     this.titulo = titulo;
     this.autor = autor;
     this.paginas = paginas;
    }

public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
};
public int getPaginas(){
    return paginas;
};

public static void main(String[] args) {
    ArrayList<Livro> biblioteca = new ArrayList<>();
    Livro livro1 = new Livro("Bibliografia da Myla","Myleninha Linda",500);
    biblioteca.add(livro1);
    System.out.println("Livro adicionado: " + livro1.getTitulo() + ", páginas: " + livro1.getPaginas());
    }

}

