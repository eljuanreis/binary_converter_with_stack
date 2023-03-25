package controller;

import stack.StackInt;

public class ConversorController {
	
	int decimal;
	
	public ConversorController(int decimal) {
		this.decimal = decimal;
	}

	public String decToBin() throws Exception
	{
		StackInt pilha = new StackInt();

		while (this.decimal != 0) {
			pilha.push(this.decimal % 2);
			this.decimal = this.decimal / 2;
		}
		
		StringBuffer binary = new StringBuffer();

		while (!pilha.isEmpty()) {
			binary.append(pilha.pop());
		}
		
		return binary.toString();
	}

}
