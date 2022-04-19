package Strategy;

public class SecuentialSearch implements SearchStrategy {

	@Override
	public void search(int[] numbers, int a) {
		System.out.println("Secuential Search!");

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == a){
				System.out.println("Lo encontré en la posición " + i);
			}
		}

		
	}
}