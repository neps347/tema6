import java.util.Scanner;

public class Ejercicio2 {
	
	public static int sumarNumeros(int numero) {
		int resultado = 0;
		for (int i = 1; i <= numero; i++) {
			resultado += i;
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int valor1 = 1;
		
		
		System.out.print("dame un numero:");
		int valor = sc.nextInt();
		
		
		//metodo sin realizar Añadido en Public static int 
		int resultado = 0;
		for (int i = 1; i <= valor; i++) {
			resultado += i;
		}
		//int resultado = valor1 + numero;
		
		
		
		
		//int resultado = sumarNumeros(valor1, numero);
		System.out.println(sumarNumeros(valor));
		
		//ooooooo
		
		//System.out.println(sumarNumeros(valor1, numero));
		
		// Crear un método llamado sumarNumeros() que llamaremos desde el método main() y que obtenga el sumatorio entre los números 1 y n, siendo n un número entero introducido por teclado. El número n ha de pasarse como parámetro al método _sumarNumeros().
//sumarNumeros(numero);
	}

}

