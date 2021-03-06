package lab08;


final public class Cliente extends Pessoa{
	private String cpf;
	private String rg;
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf ) {
		super(nome);
		this.cpf = cpf;
	}
	
	@Override
	public void ImprimeNome() {
		System.out.println("Nome do cliente é : " + getNome() + " No CPF: " + cpf + " Seu endereco :" + getEndereco());
	}
	
	//get e set
	public void setCpf(String value){
		this.cpf = cpf;
	}
	public void setRg(String value){
		this.rg = rg;
	}
	public String getCpf(){
		return cpf;
	}
	public String getRg(){
		return rg;
	}
}
