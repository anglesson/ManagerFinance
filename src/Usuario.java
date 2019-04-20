import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	private ArrayList<Conta> contas;
	
	public Usuario () {
		contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removerConta(int posicao) {
		contas.remove(posicao);
	}
	
	public Conta verConta(int posicao){
		return contas.get(posicao);
	}
	
	public ArrayList<Conta> todasContas(){
		return contas;
	}
	
	public void cadastrar() {
		
	}
	
	public void recuperarSenha() {
		
	}
	
	public void mudarSenha() {
		
	}
	
	public void entrar() {
		
	}
	
	public void sair() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
