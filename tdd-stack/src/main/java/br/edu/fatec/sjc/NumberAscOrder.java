package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder {

	public NumberAscOrder(CustomStack<Number> customStack){
		this.customStack = customStack;
	}
	
	
	private CustomStack<Number> customStack;
	
	public  List<Number> sort() throws StackEmptyException {
		
		if(customStack.isEmpty()) {
            throw new StackEmptyException();
        }
		var tamanho = customStack.size();
		List<Number> lista = new ArrayList<Number>();
		
		for (int i = 0; i < tamanho; i++) {
			lista.add(customStack.top());
			customStack.pop();
		}
		
		lista.sort((a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
		
		return lista;
		
	}
	

	public CustomStack<Number> getCustomStack() {
		return customStack;
	}

	public void setCustomStack(CustomStack<Number> customStack) {
		this.customStack = customStack;
	}
	
	
	
}
