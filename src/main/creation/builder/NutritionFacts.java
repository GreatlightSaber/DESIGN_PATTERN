package main.creation.builder;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		// Required parameters(필수 인자)
		private final int servingSize;
		private final int servings;
		
		// Optional parameters - initialized to default values(선택적 인자는 기본값으로 초기화)
		private int caloreis 		= 0;
		private int fat				= 0;
		private int carbohydrate	= 0;
		private int sodium			= 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int calories) {
			this.caloreis = calories;
			return this;
		}
		
		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder) {
		servingSize 	= builder.servingSize;
		servings		= builder.servings;
		calories		= builder.caloreis;
		fat				= builder.fat;
		sodium			= builder.sodium;
		carbohydrate	= builder.carbohydrate;
		
		System.out.println("==== 빌더 객체 생성 ====");
		System.out.println("servingSize = " + servingSize);
		System.out.println("servings = " + servings);
		System.out.println("calories = " + calories);
		System.out.println("fat = " + fat);
		System.out.println("sodium = " + sodium);
		System.out.println("carbohydrate = " + carbohydrate);
		
	}
}
