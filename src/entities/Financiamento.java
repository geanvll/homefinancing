package entities;

public class Financiamento {
	
	private double valorCasa;
	private double salario;
	private int anos;
	
	public Financiamento(double valorCasa, double salario, int anos) {
		this.valorCasa = valorCasa;
		this.salario = salario;
		this.anos = anos;
	}
	
	public double getValorCasa() {
		return valorCasa;
	}

	public void setValorCasa(double valorCasa) {
		this.valorCasa = valorCasa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public double prestacao() {
		return valorCasa / (anos * 12);
	}
	
	public double minimo() {
		return salario * 30 / 100;
	}
	
	public String toString() {
		return "VALOR DA CASA: "
				+ String.format("%.2f", valorCasa)
				+ ", ANOS: "
				+ anos
				+ ", PRESTAÇÃO: "
				+ String.format("%.2f", prestacao());
				
	}

}
