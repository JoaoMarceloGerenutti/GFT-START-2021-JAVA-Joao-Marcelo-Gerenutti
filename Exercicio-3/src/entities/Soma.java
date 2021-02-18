package entities;

public class Soma extends Operacao{

	private Double resultado;
	
	public Soma() {
		super();
	}

	public Soma(Double x, Double y) {
		super(x, y);
	}
	
	public Double getResultado() {
		return resultado;
	}
	
	@Override
	public Double efetuarOperacao(Double x, Double y) {
		this.resultado = x + y;
		return x + y;
	}

	@Override
	public String toString() {
		return "Resultado da soma: " + String.format("%.2f", getResultado());
	}
	

}
