package Adivina;
import java.util.Random;

//Genera un número aleatorio entre [1,100]
class Generador {
    public int generar(){
        final Random r = new Random();
        return 1 + r.nextInt(100);
    }
}
