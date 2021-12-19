package sii.maroc;

public class Meal {
	
	public int servedDishes() {
		// TODO Auto-generated method stub
		int nombrDishes = Restaurant.getNbOfSalads() + Ticket.getNbOfPizzas();
		return nombrDishes;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		int nombrepizza = Ticket.getNbOfPizzas();
		int nombresalade = Restaurant.getNbOfSalads();
		
		int durationSalade = 6 + (nombresalade -1) * 3;
		int durationsPizza = 10 + (nombrepizza -1) * 5;
		
		if(nombrepizza == 0) {
			return durationSalade;
		}
		
		return durationSalade + durationsPizza;
	}

}
