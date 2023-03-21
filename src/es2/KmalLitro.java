package es2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class KmalLitro {
	public static Scanner s = new Scanner(System.in);
	private static final Logger l = LoggerFactory.getLogger(KmalLitro.class);


	public static void main(String[] args) {
		
		try {
			chiedivalori();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			l.error(""+e);
			l.error("ERRore");
			
		}

	}
 static private void chiedivalori() throws Exception{
	 l.info("inserisci i km percorsi");
	 double km = s.nextDouble();
	 l.info("inserisci i litri consumati");
	 double litri = s.nextDouble();
	 double risultato = km/litri;
	 if(litri > 0 && km>=0) {
		 calcolaConsumo(risultato);
		 
	 } else {
		 throw new Exception("valori inseriti non validi");
	 }
	 
 }
 static private void calcolaConsumo(double r) {
	 l.warn("il tuo consume è di "+r+" Km/l");
 }
}
