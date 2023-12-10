package javaprimeros;

public class Scope {
	public static void main(String[] args) {
		System.out.println("hal hala hala");
		int edad = 18;
		int cantidadPersonas = 2;
		//System.out.println("El valor de la condicion es: "+ esPareja);
		boolean esPareja = true;
		
		System.out.println("El valor de la condicion es: "+ esPareja);
		if(cantidadPersonas > 1){
			esPareja = true;
		}else {
			esPareja = false;
		}
		boolean puedenEntrar = edad >= 18 && esPareja;
		if (puedenEntrar) {
			System.out.println("mi loco dele pa' entro");
			System.out.println("Bienvenido");
		} else {
			System.out.println("Usted no esta permitido" + " a entrar ");
		}
	}
}
