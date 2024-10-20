package br.edu.fatec.sjc;


public class Principal {

	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		var calculable = new CalculableStrategyImpl();
		
		var customStack = new CustomStack<>(5, calculable);
		
		
		
		
		
		var custom = new NumberAscOrder(customStack);
		
		var retorno = custom.sort();
		
		for (int i = 0; i < retorno.size(); i++) {
			System.out.println(retorno.get(i));
		}
		
	}
}
