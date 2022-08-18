import java.util.*;



public class Main_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Restaurante r1 = new Restaurante("Restaurante 1", 15);
		Restaurante r2 = new Restaurante("Restaurante 2", 5334);
		Restaurante r3 = new Restaurante("Restaurante 3", 68864);
		
		List<Restaurante> rest = new ArrayList<Restaurante>();
		rest.add(r3);
		rest.add(r2);
		rest.add(r1);
		
		for(Restaurante resst: rest) {
			System.out.println(resst);
			
			
		}
		
	}

}
