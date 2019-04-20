import java.util.Date;

public class Lancamento {
	
	// Attributes
	private int id;
	private String descricao;
	private double valor;
	private Date data_lancamento;
	private Categoria categoria;
	private Conta conta;
	
	// Construct
	public Lancamento(String descricao, double valor, Date date, Conta conta) {
		this.descricao = descricao;
		this.valor = valor;
		this.data_lancamento = date;
		this.conta = conta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}


	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
