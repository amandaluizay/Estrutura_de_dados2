
public class Restaurante {
	private String nome;
	
	public Restaurante(String nome, int qtdeLugares) {
		super();
		this.nome = nome;
		this.qtdeLugares = qtdeLugares;
	}

	private int qtdeLugares;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdeLugares() {
		return qtdeLugares;
	}
	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}
	@Override
	public String toString() {
		return "Restaurante [nome=" + nome + ", qtdeLugares=" + qtdeLugares + "]";
	}
}
