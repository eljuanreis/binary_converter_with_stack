package view;

import controller.ConversorController;

public class Main {
	public static void main(String[] args) {
		ConversorController cCont = new ConversorController(26);
		try {
			String decToBin = cCont.decToBin();
			System.out.println(decToBin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
