package mattpaes.correios;

public class ServicosAdicionais {
	private boolean entregaMaoPropria;
	private double valorDeclarado;
	private boolean avisoRecebimento;

	public ServicosAdicionais(boolean entregaMaoPropria, double valorDeclarado, boolean avisoRecebimento) {
		this.entregaMaoPropria = entregaMaoPropria;
		this.valorDeclarado = valorDeclarado;
		this.avisoRecebimento = avisoRecebimento;
	}
	public String getEntregaMaoPropria() {
		String x = this.entregaMaoPropria ? "S" : "N";
		return x;
	}
	public double getValorDeclarado() {
		return this.valorDeclarado;
	}
	public String getAvisoRecebimento() {
		String x = this.avisoRecebimento ? "S" : "N";
		return x;
	}

}
