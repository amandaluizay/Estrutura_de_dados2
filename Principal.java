import java.util.ArrayList;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		carro cl = new carro();
		//System.out.println(cl);
		
		cl.setValor(60000);
		double ipva = cl.calculaIPVA();
		System.out.println(ipva);
		
		carro c2 = new carro("aaaa", "bbbb", 13545, 1, 458);
		//System.out.println(c2);
		
		carro c3 = new carro();
		//System.out.println(c3);
		
		List<carro> lista = new ArrayList<carro>();
		lista.add(cl);
		lista.add(c2);
		lista.add(c3);
		
		
			System.out.println(lista.get(1));
		
		
		

	}

}
