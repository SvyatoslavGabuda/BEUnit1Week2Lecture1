package Es1;



import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayNum {
	public static Scanner s = new Scanner(System.in);
	private static final Logger l = LoggerFactory.getLogger(ArrayNum.class);

	public static void main(String[] args) {
		
		int[] a = creaArreyNum();
		for(int i : a) {
			System.out.println(i);
		}
		stampaElemento(a);

	}
	public static int[] creaArreyNum() {
		l.info("creazione arrey");
		int[] arr = new int[5];
	
	 for(int i = 0; i<arr.length;i++) {
		 int numR = (int)(Math.random()*10 +1);
		 arr[i]=numR;
		 System.out.print(arr[0]);
		 l.warn(" valore: "+numR);
	 }
	 l.info("creato");
	 return arr;
	 
	}
	static public void stampaElemento(int[] a) {
		int c = 1;
		while(c!=0) {
		System.out.println("Quale elemnto del arrey desideri stampare?");
		
		c = s.nextInt();
		if(c<=a.length) {
			System.out.println("numero: "+a[c-1]);
			
		} else {
			l.error("Errore il valore " + c + " esce fuori dal array, inseririre valori massimo 5 o 0 per uscire");
			
			c = s.nextInt();
		}
		
		}
	}

}
