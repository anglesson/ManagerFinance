import java.util.ArrayList;

public class Conta {
	// Atributos
	private int id;
	private String nome;
	private double saldo;
	private Usuario usuario;
	private ArrayList<Lancamento> lancamentos;
	
	// Construtor
	public Conta(Usuario usuario) {
		this.usuario = usuario;
		this.saldo = 0.00;
		this.lancamentos = new ArrayList<Lancamento>();
	}
	
	public void adicionarLancamento(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}
	
	public void removerLancamento(int posicao) {
		lancamentos.remove(posicao);
	}
	
	public ArrayList<Lancamento> verLancamentos(){
		return lancamentos;
	}
	
	// Métodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		double soma = 0.0;
		for(int i=0; i < lancamentos.size(); i++) {
			soma = soma + lancamentos.get(i).getValor();
		}
		this.setSaldo(soma);
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
