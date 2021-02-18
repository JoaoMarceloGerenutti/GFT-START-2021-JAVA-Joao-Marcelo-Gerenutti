package entities;

public class Subtracao extends Operacao{

	private Double resultado;
	
	public Subtracao() {
		super();
	}

	public Subtracao(Double x, Double y) {
		super(x, y);
	}
	
	public Double getResultado() {
		return resultado;
	}

	@Override
	public Double efetuarOperacao(Double x, Double y) {
		this.resultado = x - y;
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Resultado da subtração: " + String.format("%.2f", getResultado());
	}

}
