import java.util.Iterator;

public class exercises {
	public static void main(String[] args) {
		// Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e
		// 100.
		for (int number = 1; number <= 100; number++) {
			if (number % 3 == 0) {
				System.out.print(number);
			} else {
				System.out.print(" ");
			}

		}
	}
}
