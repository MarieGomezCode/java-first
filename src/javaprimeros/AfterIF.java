package javaprimeros;

public class AfterIF {
	public static void main(String[] args) {
		System.out.println("hal hala hala");
		int edad = 18;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedenEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: "+ esPareja);
		
		if (puedenEntrar) {
			System.out.println("mi loco dele pa' entro");
			System.out.println("Bienvenido");
		} else {
			System.out.println("Usted no esta permitido" + " a entrar ");
		}
	}
}
