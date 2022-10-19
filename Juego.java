package Adivina;
import java.util.Scanner;

public class Juego {
   private Generador gen;
    
   Juego(){
        gen = new Generador();
    }

   public void jugar(){
        bienvenido ();
        int numero = gen.generar();
        System.out.println(numero);
        int intentos = 10;
        while(intentos >= 0){
            if(intentos == 0){
                System.out.println("Has perdido. Y no te dire el numero para usarlo otra vez.");
                break;
            }
            estado(intentos);
       
            Scanner s = new Scanner(System.in);
            int numAdivinado = s.nextInt();
            
            if(numAdivinado == -1){
                System.out.println("Hasta la proxima 🤘🏻");
            				break;
            }
            else if(numAdivinado < 1 || numAdivinado > 100){
                System.out.println("Sabes que ese número no es válido.");
            				continue;
            }
            else if(numAdivinado == numero){
                System.out.println("Felicidades, has adivinado. Te ha tomado " + (10 - intentos + 1) + " intentos. Puedes mejorarlo?");
                break;
            }
            else if(numAdivinado < numero){
                System.out.println("El numero es menor del que adivinaste.");
                --intentos;
                continue;
            }
            else if(numAdivinado > numero){
                System.out.println("El numero es mayor del que adivinaste.");
            --intentos;
                continue;
            }
            
        }
    }
   private void bienvenido(){
        System.out.println("Bienvenido. He seleccionado un número aleatorio entre el 1 y el 100, ambos incluidos. Serás capaz de adivinarlo en no mas de 10 intentos. Ya veremos.");
    }
   private void estado(int intentos){
        System.out.println(intentos + "intentos restantes. Cual es el siguiente número? Pon -1 para salir.");
    }
}
