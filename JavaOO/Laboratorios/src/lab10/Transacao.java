package lab10;


import java.util.Calendar;
import java.util.Date;

public class Transacao {
	private Date data;
	private Conta contaDebito;
	private Conta contaCredito;
	private double valor;
	private String descricao;
	private EnumTipoTransacao tipoTransacao;
	
	public Transacao( Date data, Conta contaDebito, Conta contaCredito, Double valor, String descricao, EnumTipoTransacao tipoTransacao ) {
		this.data = data;
		this.contaDebito = contaDebito;
		this.contaCredito = contaCredito;
		this.valor = valor;
		this.descricao = descricao;
		this.tipoTransacao = tipoTransacao;
	}

	//get e set
	public String toString() {
	if (EnumTipoTransacao.TRANSFERENCIA == getTipoTransacao()) {
		return "Transacao data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta debito " + getContaDebito().getNumero() + ", conta credito " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
	} else if (EnumTipoTransacao.DEPOSITO == getTipoTransacao()) {
		return "Deposito data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
	} else if (EnumTipoTransacao.SAQUE == getTipoTransacao()) {
		return "Saque data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
	}
		return "Nenhum tipo de transação";
	}
	
	public EnumTipoTransacao getTipoTransacao(){
		return tipoTransacao;
	}
	
	public Date getData(){
		return data;
	}
	
	public Conta getContaCredito(){
		return contaCredito;
	}
	
	public Conta getContaDebito(){
		return contaDebito;
	}
	
	public double getValor(){
		return valor;
	}
	
	public String getDescricao(){
		return descricao;
	}
}
