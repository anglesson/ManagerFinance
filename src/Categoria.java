import java.util.ArrayList;

public class Categoria {
	private int id;
	private String descricao;
	private Tipo tipo;
	
	private ArrayList<Lancamento> lancamentos;
	
	public void addLancamento(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}
	
	public void excluirLancamento(int posicao) {
		lancamentos.remove(posicao);
	}
	
	public ArrayList<Lancamento> verLancamentos() {
		return lancamentos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Tipo getTipo() {
		return this.tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
