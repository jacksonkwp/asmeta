// BasicDomain_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import java.util.Scanner;

class BasicDomain_Exe {
	
	static void printControlled(BasicDomain esecuzione) {
		
		System.out.println("x = " + esecuzione.x.get());
		
		
		}
		
	static void askMonitored(BasicDomain esecuzione) {
		
		
		}
	
	
	public static void main(String[] args) {
		
		
		  System.out.println("INFO - file java creto e tradotto dal file originale BasicDomain.asm");
		  System.out.println("Inizio esecuzione del file BasicDomain.java\n\n");
		  
		  BasicDomain esecuzione = new BasicDomain();
		  
		  String continuare = "no";
		  int stato =0;
		  stato++;
		  
		  System.out.println("INITIAL STATE: ");
		     
		  do {
		  
		  	   System.out.println("<State "+ stato +" (controlled)>");
		  	   
		  	   //Aggiornamento valori dell'ASM e inserimento dati monitorati
		  	   
		  	   printControlled(esecuzione);
		  	   askMonitored(esecuzione);
		  	   esecuzione.UpdateASM();
		  	   
		  	   System.out.println("</State "+ stato +" (controlled)>");
		  	   
		  	   System.out.println("\n<Stato attuale>");
		  	   printControlled(esecuzione);
		  	   
		  	   
		  	    System.out.print("Vuoi continuare? (yes/no)  "); 
		  	    Scanner input = new Scanner(System.in);
		  	   continuare = input.next();
		  	              
		  	   stato++;
		  	 }
		  	 
		  while(continuare.contentEquals("yes") || continuare.contentEquals("Yes") || continuare.contentEquals("YES") );
		  	     
		  	     
		  System.out.println("FINAL STATE:");
		  
		  //Valori finale delle variabili
		  printControlled(esecuzione);
		  
		  System.out.println("esecuzione terminata");
		  	     
		}
	
}


