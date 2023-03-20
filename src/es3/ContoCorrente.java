package es3;

public class ContoCorrente {
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		if(saldo-x>0) {
		if (nMovimenti < maxMovimenti)
			saldo = saldo - x;
		else {
			saldo = saldo - x - 0.50;
		}
		nMovimenti++;
		} else {
			throw new BancaException("Conto in Rosso");			
			
		}
	}

	double restituisciSaldo() {
		return saldo;
	}
}
