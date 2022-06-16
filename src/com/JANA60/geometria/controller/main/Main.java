package com.JANA60.geometria.controller.main;

import java.util.Scanner;

public class Main {
	
	
	/*
	 * una classe Main contenente il metodo main, 
	 * nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza 
	 * con cui istanziare un nuovo oggetto Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
	 */
	
	/*
	 * chiedere all’utente per 5 volte di definire le dimensioni di un rettangolo 
	 * e stampare a video l’area del rettangolo più grande
	 */

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Rectangle biggestRec = new Rectangle();
		Rectangle userRec = new Rectangle();
		int higherArea=0;
		
		/*
		 * ho chiesto all'utente di inserire i dati da tastiera e li ho salvati 
		 * nelle proprietà acquisite dall'oggetto rec, che possiede le proprietà della classe Rectangle
		 */
		for (int i=0;i<5;i++) //chiedo all'utente di inserire 5 volte i dati
		{
			
			System.out.println("Please insert the rectangle width: ");
			userRec.width = Integer.parseInt(keyboard.nextLine()); // invece di scrivere keyboard.nextInt()
			
			System.out.println("Please insert the rectangle height: ");
			userRec.height = Integer.parseInt(keyboard.nextLine());
			
			if(userRec.getArea()>=higherArea) //se l'area immessa dall'utente è più grande di quella salvata nella ram
				{
					higherArea=userRec.getArea(); //l'area in ram è
					biggestRec.height=userRec.height; 
					biggestRec.width=userRec.width;
				}
			
			
			
		}
		System.out.println(biggestRec.toString()+ " Questo è il più grande.");
		keyboard.close();
		
	}

}
