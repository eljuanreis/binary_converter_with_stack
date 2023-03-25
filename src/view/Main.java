package view;

import javax.swing.JOptionPane;

import controller.ConversorController;

public class Main {
	public static void main(String[] args) {

		int value;

		do {
			value = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			
		} while(value > 1000);

		ConversorController cCont = new ConversorController(value);

		try {
			String decToBin = cCont.decToBin();
			System.out.println(decToBin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
