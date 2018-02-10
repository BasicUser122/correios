package mattpaes.correios;

public class Parceiro {
	private String cdAdmEmpresa;
	private String senhaEmpresa;
	private String codigoPAC;
	private String codigoSEDEX;
	private String codigoSEDEX10;
	
	public Parceiro(String cdAdmEmpresa, String senhaEmpresa, String codigoPAC, String codigoSEDEX, String codigoSEDEX10) {
		this.cdAdmEmpresa = cdAdmEmpresa;
		this.senhaEmpresa = senhaEmpresa;
		this.codigoPAC = codigoPAC;
		this.codigoSEDEX = codigoSEDEX;
		this.codigoSEDEX10 = codigoSEDEX10;
	}
	public String getCdAdmEmpresa() {
		return this.cdAdmEmpresa;
	}
	public String getSenhaEmpresa() {
		return this.senhaEmpresa;
	}
	public String getCodigoPAC() {
		return this.codigoPAC;
	}
	public String getCodigoSEDEX() {
		return this.codigoSEDEX;
	}
	public String getCodigoSEDEX10() {
		return this.codigoSEDEX10;
	}
}
