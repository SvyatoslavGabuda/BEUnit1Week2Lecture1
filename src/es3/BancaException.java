package es3;

public class BancaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String messaggio;
public BancaException(String msg) {
	super("problema banca " + msg);
	this.messaggio = msg;
}
public String toString() {
	return this.messaggio;
}
}
