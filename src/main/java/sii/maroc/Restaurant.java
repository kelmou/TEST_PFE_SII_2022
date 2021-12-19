package sii.maroc;

public class Restaurant {
	private static int nombresalades;
	private int nombremozzarella;
	private int nombretomates;
	String nombremozzarellas ;
	String nombretomatess;
	String flouar;
	String water;
	public static int getNbOfSalads() {
		return nombresalades;
	}

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		String nombremozzarellas = string;
		String nombretomatess = string2;
		nombremozzarella = Integer.parseInt(nombremozzarellas.substring(0, 1));
		nombretomates = Integer.parseInt(nombretomatess.substring(0, 1));

	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
		this(string4,string2,string5,string3);
		flouar=string;
		water=string6;
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		nombresalades = Integer.parseInt(string.substring(0, 1));
		Ticket ticket1 = new Ticket();
		return ticket1;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal1 = new Meal();
		return meal1;
	}
	public void isOutStock(String order) throws UnavailableDishException {
		int nbOfCommand = Integer.parseInt(order.substring(0, 1));
		if(nombremozzarella < nbOfCommand || nombretomates < 2*nbOfCommand ){
			throw new UnavailableDishException();
		}
	}


	
}

