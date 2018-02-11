package mattpaes.correios;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;




public class CorreiosFrete {
	public static DadosFrete consultarFretePAC(String cepDestino, String cepOrigem, Pacote pacote) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=&sDsSenha=&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico=04510&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFretePAC(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico="+parceiro.getCodigoPAC()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFretePAC(String cepDestino, String cepOrigem, Pacote pacote, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=08082650&sDsSenha=564321&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico=04510&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFretePAC(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico="+parceiro.getCodigoPAC()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX(String cepDestino, String cepOrigem, Pacote pacote) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=&sDsSenha=&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico=04014&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico="+parceiro.getCodigoSEDEX()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);	
	}
	public static DadosFrete consultarFreteSEDEX(String cepDestino, String cepOrigem, Pacote pacote, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=08082650&sDsSenha=564321&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico=04014&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico="+parceiro.getCodigoSEDEX()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX10(String cepDestino, String cepOrigem, Pacote pacote) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=&sDsSenha=&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico=40215&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX10(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria=n&nVlValorDeclarado=0&sCdAvisoRecebimento=n&nCdServico="+parceiro.getCodigoSEDEX10()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX10(String cepDestino, String cepOrigem, Pacote pacote, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=08082650&sDsSenha=564321&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico=04014&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete consultarFreteSEDEX10(String cepDestino, String cepOrigem, Pacote pacote, Parceiro parceiro, ServicosAdicionais servicosAdicionais) throws Exception{
		String uri = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa="+parceiro.getCdAdmEmpresa()+"&sDsSenha="+parceiro.getSenhaEmpresa()+"&sCepOrigem="+cepOrigem+"&sCepDestino="+cepOrigem+"&nVlPeso="+pacote.getPesoTotalKg()+"&nCdFormato="+pacote.getFormato()+"&nVlComprimento="+pacote.getComprimentoCm()+"&nVlAltura="+pacote.getAlturaCm()+"&nVlLargura="+pacote.getLarguraCm()+"&sCdMaoPropria="+servicosAdicionais.getEntregaMaoPropria()+"&nVlValorDeclarado="+servicosAdicionais.getValorDeclarado()+"&sCdAvisoRecebimento="+servicosAdicionais.getAvisoRecebimento()+"&nCdServico="+parceiro.getCodigoSEDEX10()+"&nVlDiametro="+pacote.getDiametroCm()+"&StrRetorno=xml&nIndicaCalculo=3";
		URL url = new URL(uri);
		return getNParse(url);
	}
	public static DadosFrete  getNParse(URL url) throws Exception {
		//Http GET pega o Xml e manipula com o pacote dom
				
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Accept", "application/xml");
			InputStream xml = connection.getInputStream();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(xml);
			//Usa a classe Xpath pra navegar o XML e instanciar DadosFrete com os values desejados.
			XPath xPath = XPathFactory.newInstance().newXPath();
	        NodeList nl = (NodeList) xPath.compile("//cServico").evaluate(doc, XPathConstants.NODESET);
	        DadosFrete dFrete =new DadosFrete(
	        		xPath.compile("./Codigo").evaluate(nl.item(0)),
	        		xPath.compile("./Valor").evaluate(nl.item(0)),
	        		xPath.compile("./PrazoEntrega").evaluate(nl.item(0)),
	        		xPath.compile("./ValorSemAdicionais").evaluate(nl.item(0)),
	        		xPath.compile("./ValorMaoPropria").evaluate(nl.item(0)),
	        		xPath.compile("./ValorAvisoRecebimento").evaluate(nl.item(0)),
	        		xPath.compile("./ValorValorDeclarado").evaluate(nl.item(0)),
	        		xPath.compile("./EntregaDomiciliar").evaluate(nl.item(0)),
	        		xPath.compile("./EntregaSabado").evaluate(nl.item(0)),
	        		xPath.compile("./Erro").evaluate(nl.item(0)));
			
			return dFrete;

	}
}
