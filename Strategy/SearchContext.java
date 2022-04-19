package Strategy;

public class SearchContext {
	
	private SearchStrategy strategy;
	
	public void setSearchingMethod(SearchStrategy strategy) {
		this.strategy = strategy;
	}
	
	public SearchStrategy getStrategy() {
		return this.strategy;
	}
	
	public void search(int[] numbers, int a){
		this.strategy.search(numbers, a);
	}
}

