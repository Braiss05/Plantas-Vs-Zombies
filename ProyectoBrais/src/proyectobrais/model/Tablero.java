package proyectobrais.model;

public class Tablero {

    private int filas;
    private int columnas;
    private Object[][] terreno;  // La matriz 2D que representa el tablero

    // Constructor para definir las dimensiones del tablero
    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.terreno = new Object[filas][columnas];  // Inicializamos la matriz
    }

    // Método para añadir una planta en una posición específica
    public boolean colocarPlanta(Planta planta, int fila, int columna) {
        if (esPosicionValida(fila, columna) && terreno[fila][columna] == null) {
            terreno[fila][columna] = planta;
            System.out.println("Planta colocada en (" + fila + ", " + columna + ")");
            return true;
        } else {
            System.out.println("Posición no válida o ya ocupada.");
            return false;
        }
    }

    // Método para añadir un zombie en una posición específica
    public boolean colocarZombie(Zombie zombie, int fila, int columna) {
        if (esPosicionValida(fila, columna) && terreno[fila][columna] == null) {
            terreno[fila][columna] = zombie;
            System.out.println("Zombie colocado en (" + fila + ", " + columna + ")");
            return true;
        } else {
            System.out.println("Posición no válida o ya ocupada.");
            return false;
        }
    }

    // Método para verificar si una posición es válida
    private boolean esPosicionValida(int fila, int columna) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }

    // Método para mostrar el estado del tablero
    public void mostrarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (terreno[i][j] == null) {
                    System.out.print("[ ]");  
                } else if (terreno[i][j] instanceof Planta) {
                    System.out.print("[P]");  // Planta
                } else if (terreno[i][j] instanceof Zombie) {
                    System.out.print("[Z]");  // Zombie
                }
            }
            System.out.println();  
        }
    }

    // Método para mover todos los zombies en el tablero hacia la izquierda
    public void moverZombies() {
        // Iteramos desde la columna 1 hasta la última, moviendo los zombies hacia la izquierda
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {  // Empezamos desde la segunda columna
                if (terreno[i][j] instanceof Zombie) {
                    if (terreno[i][j - 1] == null) {  // Si la casilla de la izquierda está vacía
                        terreno[i][j - 1] = terreno[i][j];  // Mueve el zombie a la izquierda
                        terreno[i][j] = null;  // Limpia la posición anterior
                    } else if (terreno[i][j - 1] instanceof Planta) {
                        // Si hay una planta en la izquierda, el zombie ataca
                        System.out.println("Zombie ataca a la planta en (" + i + ", " + (j - 1) + ")");
                        // Aquí podrías reducir la vida de la planta o aplicar la lógica que quieras
                    }
                }
            }
        }
    }

    // Obtener la entidad en una posición específica del tablero
    public Object getEntidad(int fila, int columna) {
        if (esPosicionValida(fila, columna)) {
            return terreno[fila][columna];
        }
        return null;
    }

    // Eliminar una entidad del tablero (se usa cuando un zombie muere)
    public void eliminarEntidad(int fila, int columna) {
        if (esPosicionValida(fila, columna)) {
            terreno[fila][columna] = null;
            System.out.println("Entidad eliminada en (" + fila + ", " + columna + ")");
        }
    }

    // Metodos set y get para qu pueda funcionar la clae guerra
    
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
