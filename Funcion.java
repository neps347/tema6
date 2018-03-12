import java.util.Scanner;
public class Funcion {
public static void imprimirmensaje(String m) {
		System.out.println(m);
		
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Intrudzca un texto: ");
		String mensaje = sc.nextLine();
		//System.out.println(mensaje);
		
		imprimirmensaje("Hola Mundo!");
		imprimirmensaje(mensaje);
	}
	
}
