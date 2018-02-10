package mattpaes.correios;

public class Pacote {
	private String pesoTotalKg;
	private double comprimentoCm;
	private double alturaCm;
	private double larguraCm;
	private double diametroCm;
	private int formato;

	public Pacote(String pesoTotalKg, double comprimentoCm, double alturaCm, double larguraCM, double diametroCm, int formato) {
		//enum para formato?
		this.pesoTotalKg = pesoTotalKg;
		this.comprimentoCm = comprimentoCm;
		this.alturaCm = alturaCm;
		this.larguraCm = larguraCM;
		this.diametroCm = diametroCm;
		this.formato = formato;
	}
	
	public String getPesoTotalKg() {
		return this.pesoTotalKg;
	}
	public double getComprimentoCm() {
		return this.comprimentoCm;
	}
	public double getAlturaCm() {
		return this.alturaCm;
	}
	public double getLarguraCm() {
		return this.larguraCm;
	}
	public double getDiametroCm() {
		return this.diametroCm;
	}
	public int getFormato() {
		return this.formato;
	}

}
