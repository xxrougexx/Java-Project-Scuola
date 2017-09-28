
public class Parcheggio {
	private int n_ingressi;
	private int n_posti;
	private int costo_posto;
	private int n_posti_occupati;
	private String strerrore;
	
	public int getN_ingressi() {
		return n_ingressi;
	}
	public void setN_ingressi(int n_ingressi) {
		this.n_ingressi = n_ingressi;
	}
	public int getN_posti() {
		return n_posti;
	}
	public void setN_posti(int n_posti) {
		this.n_posti = n_posti;
	}
	public int getCosto_posto() {
		return costo_posto;
	}
	public void setCosto_posto(int costo_posto) {
		this.costo_posto = costo_posto;
	}
	public int getN_posti_occupati() {
		return n_posti_occupati;
	}
	public void setN_posti_occupati(int n_posti_occupati) {
		this.n_posti_occupati = n_posti_occupati;
	}
	public String getStrerrore() {
		return strerrore;
	}
	public void setStrerrore(String strerrore) {
		this.strerrore = strerrore;
	}
	public boolean ingresso(){
		n_posti_occupati++;
		n_ingressi++;
		return true;
	}
	public boolean uscita(){
		n_posti_occupati--;
		return false;
	}
	public int postiLiberi(){
		
	}
	public int incasso(){
		
	}
	public int valoreLordo(){
		
	}
	public int valoreParcheggio(){
	
	
	
	
	
	
	
	
	
	
}


