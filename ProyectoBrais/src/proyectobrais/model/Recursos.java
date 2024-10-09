package proyectobrais.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recursos {
    
    private double dinero;
    private Random random;
    
    public Recursos(double dineroInicial) {
        this.dinero = dineroInicial;
        this.random = new Random();
    }

    // Obtener el dinero actual
    public double getDinero() {
        return dinero;
    }

    // Añadir dinero
    public void addDinero(double cantidad) {
        this.dinero += cantidad;
    }

    // Gastar dinero
    public boolean gastarDinero(double cantidad) {
        if (this.dinero >= cantidad) {
            this.dinero -= cantidad;
            return true;
        } else {
            System.out.println("Dinero insuficiente.");
            return false;
        }
    }
    
    // Generar una lista aleatoria de zombies
    public List<Zombie> generarZombiesAleatorios(int cantidad) {
        List<Zombie> listaZombies = new ArrayList<>();
        String[] tiposDeZombies = {"Común", "Yeti", "Caminante", "Gigante"};

        for (int i = 0; i < cantidad; i++) {
            String tipo = tiposDeZombies[random.nextInt(tiposDeZombies.length)];
            int vida = 50 + random.nextInt(100);  // vida entre 50 y 150
            int damage = 5 + random.nextInt(20);  // daño entre 5 y 25
            int velocidad = 1 + random.nextInt(5); // velocidad entre 1 y 5
            Zombie zombieAleatorio = new Zombie("Zombie Aleatorio " + (i+1), vida, damage, velocidad, tipo);
            listaZombies.add(zombieAleatorio);
        }

        return listaZombies;
    }
    
    // Generar una lista aleatoria de plantas con costos
    public List<Planta> generarPlantasAleatorias(int cantidad) {
        List<Planta> listaPlantas = new ArrayList<>();
        String[] tiposDePlantas = {"Lanzaguisantes", "Girasol", "Nuez", "Hielaguisantes"};

        for (int i = 0; i < cantidad; i++) {
            String tipo = tiposDePlantas[random.nextInt(tiposDePlantas.length)];
            int vida = 50 + random.nextInt(100);  // vida entre 50 y 150
            int damage = tipo.equals("Girasol") ? 0 : 10 + random.nextInt(20); // Girasol no hace daño
            String nombre = "Planta Aleatoria " + (i + 1);
            Planta plantaAleatoria = new Planta(nombre, vida, damage, tipo);
            listaPlantas.add(plantaAleatoria);
        }

        return listaPlantas;
    }

    // Calcular el costo de una planta (aleatorio basado en la vida y el daño)
    public double calcularCostoPlanta(Planta planta) {
        return planta.getVida() * 0.5 + planta.getDamage() * 1.5;  // Fórmula de costo basada en vida y daño
    }
}
