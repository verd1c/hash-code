package hashcodepractice;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private int id;
	private List<String> ingredients;
	
	public Pizza() {
		this.ingredients = new ArrayList<String>();
	}
	
	public void addIngredient(String ingredient) {
		this.ingredients.add(ingredient);
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
