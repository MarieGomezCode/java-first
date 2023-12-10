package javaprimeros;

public class memoria {
		public static void main (String[] args) {
			int num1 = 5;
			int num2 = 9;
			System.out.println(num2);
			num2 = num1;
			System.out.println(num2);
			num1 = 88;
			//No se actuliza el valor
			System.out.println(num2);
		}
}
