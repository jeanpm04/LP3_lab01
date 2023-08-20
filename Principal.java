import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        Regalo regaloGanador = new Regalo();

        do {
            vida ++;
            System.out.println("Vida:"+ vida + "\t¿Cual es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);
        if (fl == true)
        {
			switch(vida)
			{
                case 1:
<<<<<<< HEAD
                    System.out.println(" FELICIDADES adivinaste a la primera!!!!" );
                    break;
                case 2:
                    System.out.println(" FELICIDADES adivinaste al 2do intento!!!!" );
                    break;
                case 3:
                    System.out.println(" FELICIDADES adivinaste al 3er intento!!!!" );
                    break;
=======
					System.out.println(" FELICIDADES adivinaste a la primera!!!!" );
					System.out.println("Ganaste: "+regaloGanador.elegir(vida) );
                    break;
				case 2:
					System.out.println(" FELICIDADES adivinaste al 2do intento!!!!" );
					System.out.println("Ganaste: "+regaloGanador.elegir(vida) );
                    break;
				case 3:
					System.out.println(" FELICIDADES adivinaste al 3er intento!!!!" );
					System.out.println("Ganaste: "+regaloGanador.elegir(vida) );
					break;
>>>>>>> rama2
			}
			System.out.println("Ganaste un viaje a la luna!!!!! " );
		}

        else {
            System.out.println("ups, perdiste...");
            System.out.println("El número secreto era: 1234");
        }
            
        System.out.println("¡Gracias por jugar!");    
    }
}