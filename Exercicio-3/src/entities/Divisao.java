package entities;

public class Divisao extends Operacao{

	private Double resultado;
	
	public Divisao() {
		super();
	}

	public Divisao(Double x, Double y) {
		super(x, y);
	}

	public Double getResultado() {
		return resultado;
	}

	@Override
	public Double efetuarOperacao(Double x, Double y) {
		this.resultado = 0.0;
		if (y == 0) {
			System.out.println("Não é possivel dividir por zero!");
			this.resultado = 0.0;
		} else {
			this.resultado = x / y;
		}
		return getResultado();
	}
	
	@Override
	public String toString() {
		return "Resultado da Divisão: " + String.format("%.2f", getResultado());
	}

}
