package model;

public class CandyArtist {
	private String ingredient1;
	private String ingredient2;
	private String ingredient3;
	
	public CandyArtist() {}
	
	public CandyArtist(String ingredient1, String ingredient2, String ingredient3) {
		this.ingredient1 = ingredient1;
		setIngredient1(ingredient1);
		this.ingredient2 = ingredient2;
		setIngredient2(ingredient2);
		this.ingredient3 = ingredient3;
		setIngredient3(ingredient3);
	}


	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
		this.ingredient1 = ingredient1.toUpperCase();
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
		this.ingredient2 = ingredient2.toUpperCase();
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
		this.ingredient3 = ingredient3.toUpperCase();
	}
}