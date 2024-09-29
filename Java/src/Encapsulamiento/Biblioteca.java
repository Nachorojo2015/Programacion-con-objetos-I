package Encapsulamiento;

public class Biblioteca {
    private Libro[] libros;

    // Se construya a partir de la máxima cantidad de libros que puede contener.
    public Biblioteca(int maxCantidadDeLibros) {

        if (maxCantidadDeLibros <= 0) {
            throw new IllegalArgumentException("La cantidad de libros debe ser mayor a 0");
        }

        this.libros = new Libro[maxCantidadDeLibros];
    }

    // Se pueda consultar la cantidad de libros que contiene.
    public int cuantosLibros() {
        return libros.length;
    }

    // Se pueda agregar un libro indicando su título, autor, Genero y cantidad de
    // páginas, siempre y cuando haya lugar en la Biblioteca. Los Generos literarios
    // que le gustan a éste bibiotecario son: POESIA, CIENCIAFICCION, AVENTURA,
    // NOVELA, HISTORIA, INFANTILES.
    public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
        Libro nuevoLibro = new Libro(titulo, autor, genero, paginas);
        if (libros.length == cuantosLibros()) {
            return false;
        } else {
            libros[cuantosLibros() - 1] = nuevoLibro;
            return true;
        }
    }

    // Devuelva el título de un libro a partir de la posición.
    public String libroEnLaPosicion(int posicion) {
        return libros[posicion].getTitulo();
    }

    // Devuelva el libro con más cantidad de páginas.
    public Libro libroConMasPaginas() {
        int mayor = 0;
        Libro libroMayor = new Libro();
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getPaginas() > mayor) {
                mayor = libros[i].getPaginas();
                libroMayor = libros[i];
            }
        }

        return libroMayor;
    }

    // Se pueda consultar cuantos libros hay de determinado autor.
    public int cuantosLibrosDelAutor(String autor) {
        int contadorAutor = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getAutor() == autor) contadorAutor++;
        }

        return contadorAutor;
    }

    // Devuelva un arreglo con todos los Libros de un autor que se pasa por
    // parámetro.
    public Libro[] librosDelAutor(String autor) {
        return libros;
    }

    // Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo
    // que se tarda 1 minuto por página.
    public int tiempoEnLeetTodosLosLibros() {
        int sumaMinutos = 0;
        for (int i = 0; i < libros.length; i++) {
            sumaMinutos += libros[i].getPaginas();
        }

        return sumaMinutos;
    }

    // Informe por pantalla la cantidad de libros que hay por cada Genero literario.
    public void librosPorGeneroLiterario() {
    // POESIA, CIENCIAFICCION, AVENTURA,
    // NOVELA, HISTORIA, INFANTILES.
    int poesia = 0, cienciaFiccion = 0, aventura = 0, novela = 0, historia = 0, infantiles = 0;

    for (int i = 0; i < libros.length; i++) {
        switch (libros[i].getGenero().getGenero()) {
            case "POESIA":
            poesia++;
            break;
            case "CIENCIA FICCION":
            cienciaFiccion++;
            break;
            case "AVENTURA":
            aventura++;
            break;
            case "NOVELA":
            novela++;
            break;
            case "HISTORIA":
            historia++;
            break;
            case "INFANTILES":
            infantiles++;
            break;
        }
    }

    System.out.println("Hay " + poesia + " libros  de poesía");
    System.out.println("Hay " + cienciaFiccion + " libros de ciencia ficción");
    System.out.println("Hay " + aventura + " libros de aventura");
    System.out.println("Hay " + novela + " libros de aventura");
    System.out.println("Hay " + historia + " libros de historia");
    System.out.println("Hay " + infantiles + " libros infantiles");
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(20);

        System.out.println("Hay una cantidad total de " + biblioteca.cuantosLibros() + " libros");

        biblioteca.agregarLibro("La odisea", "Homero", new Genero("CIENCIA FICCION"), 200);
    }
}
