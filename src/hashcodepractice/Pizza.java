package hashcodepractice;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private int id;
	private int score;
	private List<String> ingredients;
	
	public Pizza() {
		this.ingredients = new ArrayList<String>();
	}
	
	public void addIngredient(String ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public boolean hasIngredient(String ingredient) {
		return this.ingredients.contains(ingredient);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Pizza [score=" + score + ", ingredients=" + ingredients + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
