package assignment1;

public class mainPerfume{
	
	public static void main(String[] args) {

Perfume f = new Perfume("For Him", "For Her");

PerfumeBrand b = new PerfumeBrand ("DKNY", "CK", "Victoria Secret", "Givenchy", "Bulgari", "Hugo Boss");

System.out.println("Type of Perfume: " + f.getForMan());
System.out.println("Brand perfume for Man: ");
System.out.println(b.getBrand1());

System.out.println(b.getBrand5());

System.out.println(b.getBrand6());
System.out.println("");

System.out.println("Type of Perfume: " + f.getForWoman());
System.out.println("Brand perfume for Woman: ");
System.out.println(b.getBrand1());

System.out.println(b.getBrand2());

System.out.println(b.getBrand3());

System.out.println(b.getBrand4());

System.out.println(b.getBrand5());
System.out.println("");

	}
}

