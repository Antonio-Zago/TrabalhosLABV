package principal;

public class Triangulo {

	public Triangulo(int valor1, int valor2, int valor3) throws Exception {
		
		Validacao(valor1, valor2, valor3);
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		
		
		
	}
	
	private void Validacao(int valor1, int valor2, int valor3) throws Exception {
		
		if((valor1 + valor2 <= valor3)
			||	(valor1 + valor3 <= valor2)
			|| (valor2 + valor3 <= valor1)) {
			throw new Exception("Parâmetros inválidos");
		}		
	}
	
	public String RetornarTipoTriangulo() {
		if(valor1 == valor2 && valor1 == valor3) {
			return "Equilatero";
		}
		else if((valor1 == valor2 && valor1 != valor3) 
				|| (valor1 == valor3 && valor1 != valor2)
				|| (valor2 == valor3 && valor1 != valor2)) {
			return "Isóceles";
		}
		else if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			return "Escaleno";
		}
		
		return "";
	}
	
	private int valor1;
	
	private int valor2;
	
	private int valor3;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
	
	
}
