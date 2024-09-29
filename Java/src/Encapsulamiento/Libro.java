package Encapsulamiento;

public class Libro {

    private String titulo;
    private String autor;
    private Genero genero;
    private int paginas;


    public Libro() {
    }


    public Libro(String titulo, String autor, Genero genero, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public Genero getGenero() {
        return genero;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public int getPaginas() {
        return paginas;
    }


    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    

}
