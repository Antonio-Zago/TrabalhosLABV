package calculadora;

public class Funcionario {

	
	public Funcionario(String nome, String email, double salarioBase, String cargo) {
		this.nome = nome;
		this.email = email;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
	
	private String nome;
	
	private String email;
	
	private double salarioBase;
	
	private String cargo;
	
	
	public double CalcularSalarioLiquido() {
		if(this.cargo.equals("DESENVOLVEDOR")) {
			if(this.salarioBase >= 3000) {
				return this.salarioBase - ((20.0/100.0) * this.salarioBase);
			}
			else {
				return this.salarioBase - ((10.0/100.0) * this.salarioBase);
			}
			 
		}else if(this.cargo.equals("DBA")) {
			if(this.salarioBase >= 2000) {
				return this.salarioBase - ((25.0/100.0) * this.salarioBase);
			}
			else {
				return this.salarioBase - ((15.0/100.0) * this.salarioBase);
			}
			 
		}else if(this.cargo.equals("TESTADOR")) {
			if(this.salarioBase >= 2000) {
				return this.salarioBase - ((25.0/100.0) * this.salarioBase);
			}
			else {
				return this.salarioBase - ((15.0/100.0) * this.salarioBase);
			}
			 
		}else if(this.cargo.equals("GERENTE")) {
			if(this.salarioBase >= 5000) {
				return this.salarioBase - ((30.0/100.0) * this.salarioBase);
			}
			else {
				return this.salarioBase - ((20.0/100.0) * this.salarioBase);
			}
			 
		}
		
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
