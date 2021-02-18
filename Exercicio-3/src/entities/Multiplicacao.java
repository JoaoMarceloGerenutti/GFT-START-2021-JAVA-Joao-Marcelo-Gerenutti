package entities;

public class Multiplicacao extends Operacao{

	private Double resultado;
	
	public Multiplicacao() {
		super();
	}

	public Multiplicacao(Double x, Double y) {
		super(x, y);
	}

	public Double getResultado() {
		return resultado;
	}
	
	@Override
	public Double efetuarOperacao(Double x, Double y) {
		this.resultado = x * y;
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Resultado da multiplicação: " + String.format("%.2f", getResultado());
	}

}
