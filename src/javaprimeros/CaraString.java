package javaprimeros;

public class CaraString {
		public static void main(String[] args) {
			char caracter = 'a';
			System.out.println(caracter);
			
			 caracter = 65;
			System.out.println(caracter);
			
			caracter = 65 + 1 ;
			System.out.println(caracter);
			char segCar = (char) (caracter + 1);			
			System.out.println(segCar);
			String word = "Angela eres la mejor!";
			System.out.println(word);
			System.out.println(word+word+word+word + "Comillas"+" espacio"+word);
		}

}
