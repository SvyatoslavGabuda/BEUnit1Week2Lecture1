package es3;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException{
		if (x <= maxPrelievo) {
			try {
				super.preleva(x);
			} catch (BancaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//throw new BancaException(" il prelievo non è disponibile");
			}
		} else {
			throw new BancaException(" Il prelievo non è disponibile");
			
		}
	}
}
