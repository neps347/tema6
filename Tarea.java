import java.util.Scanner;

public class Tarea {

	static int[] numerosrandom = new int[20];

	public static void imprimirPares() {
		for (int i = 0; i <= numerosrandom.length; i++) {
			if (numerosrandom[i] % 2 == 0) {
				System.out.println(numerosrandom[i]);
			}
		}
	}

	public static void imprimirImpares() {
		for (int i = 1; i <= numerosrandom.length; i++) {
			if (numerosrandom[i] % 2 != 0) {
				System.out.println(numerosrandom[i]);
			}
		}
	}

	public static void EnsenarValores() {
		for (int i = 0; i < numerosrandom.length; i++) {
			System.out.println(numerosrandom[i]);
		}
	}

	public static double Media() {
	
		int suma = 0;
		for (int i = 0; i < numerosrandom.length; i++) {
			suma += numerosrandom[i];
		}
		
		return (double)suma/(double)numerosrandom.length;
		
		
	}


	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < numerosrandom.length; i++)
			numerosrandom[i]= (int) Math.ceil((Math.random()*9 + 1));
		
			Scanner sc =new Scanner(System.in); /// PARA AÑADIR DATOS POR TECLADO IMPORTANTE!
	
		int opcion;
		do { 
			//imprimir el menu
			//System.out.println()
			System.out.println("menu");
			System.out.println("1.- Imprimir el mayor valor");
			System.out.println("2.- Imprimir el menor valor)");
			System.out.println("3.- Hacer media");
			System.out.println("4.- Enseñar todos los valores de la Array");
			System.out.println("5.- Imprimir Pares");
			System.out.println("6.- Imprimir Impares");
			System.out.println("0.- Salir");
			System.out.println("su opcion: ");	
		
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1: imprimirPares(); break; 
			case 2: imprimirImpares(); break;
			case 3: Media(); break;
			case 4: EnsenarValores();
			case 5: imprimirPares();
			case 6: imprimirImpares();
			case 0: System.out.println("adios"); break;
			default: System.out.println("introduce una opcion valida");
			}
			
			} while (opcion != 0);
		
		
	}
}