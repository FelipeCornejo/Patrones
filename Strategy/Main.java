package Strategy;

public class Main {

	public static void main(String[] args) {
		
		int numbers[] = {0, 1, 2, 3, 4};
		int a = 3;
		
		System.out.println("----------------------------------------");
		System.out.println("Ejemplo de Patron Strategy");
		System.out.println("----------------------------------------");

		SearchContext context = new SearchContext();
		context.setSearchingMethod(new SecuentialSearch());
		context.search(numbers,a);
		
		System.out.println("--------------------------");
		context.setSearchingMethod(new BinarySearch());
		context.search(numbers,a);
		
	}
}