import java.util.Scanner;

public class Ejercicio3 {

	
	//Crear 
	public static void imprimirPares(){
		for (int i =1 ;i <= 20; i++) {
			if (i % 2 ==0) {
			System.out.println(i);
			
			//Creado imprimir pares
}
		}

	}
	// CREAR
	public static void imprimirImpares(){
		for (int i =1 ;i <= 20; i++) {
			if (i % 2 !=0) {
			System.out.println(i);
}
			//CREADO NUMERO IMPARES
		}

	}

public static void main(String[] arg) {
	Scanner sc =new Scanner(System.in); /// PARA AÑADIR DATOS POR TECLADO IMPORTANTE!
	int opcion;
	
	
	do { 
		//imprimir el menu
		//System.out.println()
		System.out.println("menu");
		System.out.println("1.- Imprimir pares del 1 al 20");
		System.out.println("2.- Imprimir impares del 1 al 20)");
		System.out.println("0.- Salir");
		System.out.println("su opcion: ");	
	
		
		opcion=sc.nextInt();
	
		switch(opcion) {
		case 1: imprimirPares(); break; //siempre en el caso de switch al acabar el caso
		case 2: imprimirImpares(); break;
		case 0: System.out.println("adios"); break;
		default: System.out.println("introduce una opcion valida");
		}
		
	} while (opcion != 0);
	}
}