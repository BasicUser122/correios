package mattpaes.correios;

public class DadosFrete {
	private String codigo;
	private String valor;
	private String prazo;
	private String valorSemAdicionais;
	private String valorMaoPropria;
	private String valorAvisoRecebimento;
	private String valorValorDeclarado;
	private String entregaDomiciliar;
	private String entregaSabado;
	private String codigoErro;
	
	public DadosFrete(String codigo, String valor, String prazo, String valorSemAdicionais, String valorMaoPropria,
			String valorAvisoRecebimento, String valorValorDeclarado, String entregaDomiciliar, String entregaSabado,
			String codigoErro ) {
		this.codigo = codigo;
		this.valor = valor;
		this.prazo = prazo;
		this.valorSemAdicionais = valorSemAdicionais;
		this.valorMaoPropria = valorMaoPropria;
		this.valorAvisoRecebimento = valorAvisoRecebimento;
		this.valorValorDeclarado = valorValorDeclarado;
		this.entregaDomiciliar = entregaDomiciliar;
		this.entregaSabado = entregaSabado;
		this.codigoErro = codigoErro;
	}
	public String getCodigo() {
		return this.codigo;
	}
	public String getValor() {
		return this.valor;
	}
	public String getPrazo() {
		return this.prazo;
	}
	public String getValorSemAdicionais() {
		return this.valorSemAdicionais;
	}
	public String getValorMaoPropria() {
		return this.valorMaoPropria;
	}
	public String getValorAvisoRecebimento() {
		return this.valorAvisoRecebimento;
	}
	public String getValorValorDeclarado() {
		return this.valorValorDeclarado;
	}
	public String getEntregaDomiciliar() {
		return this.entregaDomiciliar;
	}
	public String getEntregaSabado() {
		return this.entregaSabado;
	}
	public String getCodigoErro() {
		return this.codigoErro;
	}
}
