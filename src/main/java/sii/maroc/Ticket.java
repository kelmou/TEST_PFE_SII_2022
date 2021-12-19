package sii.maroc;

public class Ticket {
	 
	private static int nombrePizza;
    
	public static int getNbOfPizzas() {
		return nombrePizza;
	}

	public Ticket and(String string) {
		Ticket ticket1 = new Ticket();
		nombrePizza = Integer.parseInt(string.substring(0, 1));
		return ticket1;
	}

}
