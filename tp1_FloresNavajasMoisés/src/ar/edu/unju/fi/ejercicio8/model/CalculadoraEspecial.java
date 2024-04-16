package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	//constructor
	public CalculadoraEspecial() {
		
	}
	
	//método sumatoria
	public int calcularSumatoria(int n) {
		int sumatoria = 0;
		for(int k = 1; k <= n; k++) {
			sumatoria += Math.pow(((k * (k + 1))/2), 2);
			//System.out.println(sumatoria);
		}
		return sumatoria;
	}
	
	//método producto
	public long calcularProductoria(int n) {
		long productoria = 1;
		for (int k = 1; k <= n; k++) {
			productoria *= k * (k + 4);
			
		}
		return productoria;
	}
	
	
	//getter and setter
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}