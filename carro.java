
public class carro {

	public String placa;
	public String cidade;
	public int ano;
	public int modelo;
	public int valor;

	@Override
	public String toString() {
		return "carro [placa=" + placa + ", cidade=" + cidade + ", ano=" + ano + ", modelo=" + modelo + ", valor="
				+ valor + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	carro(){
		this.cidade = "Bragança Paulista";
		this.ano = 2018;
	}
	
	carro(String placa, String cidade, int ano, int modelo, int valor){
		this.placa = placa;
		this.cidade = cidade;
		this.ano = ano;
		this.modelo = modelo;
		this.valor = valor;
	}
	public double calculaIPVA() {
		double ipva;
		if (this.valor >=0) {
			ipva = this.valor * 0.04;
		} else {
			ipva = 0.0;
		}
		return ipva;
	}
}


