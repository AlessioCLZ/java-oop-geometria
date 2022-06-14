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
		Rectangle rec = new Rectangle();
		Rectangle ret = new Rectangle();
		int higherArea=0;
		
		/*
		 * ho chiesto all'utente di inserire i dati da tastiera e li ho salvati 
		 * nelle proprietà acquisite dall'oggetto rec, che possiede le proprietà della classe Rectangle
		 */
		for (int i=0;i<5;i++) //chiedo all'utente di inserire 5 volte i dati
		{
			
			System.out.println("Please insert the rectangle width: ");
			ret.width = Integer.parseInt(keyboard.nextLine()); // invece di scrivere keyboard.nextInt()
			
			System.out.println("Please insert the rectangle height: ");
			ret.height = Integer.parseInt(keyboard.nextLine());
			
			if(ret.getArea()>=higherArea) //se l'area immessa dall'utente è più grande di quella salvata nella ram
				{
					higherArea=ret.getArea(); //l'area in ram è
					rec.height=ret.height; 
					rec.width=ret.width;
				}
			
			
			
		}
		System.out.println(rec.toString()+ " Questo è il più grande.");
		keyboard.close();
		
	}

}
