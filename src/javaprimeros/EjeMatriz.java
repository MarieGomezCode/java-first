package javaprimeros;

public class EjeMatriz {
	public static void main(String[] args) {
		for(int fila = 0; fila <= 10; fila++ ) {
			for(int colu = 0; colu < fila; colu++) {				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
