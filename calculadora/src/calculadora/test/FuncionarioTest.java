package calculadora.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculadora.Funcionario;

public class FuncionarioTest {

	@Test
	public void testDesenvolvedorSalarioMenor(){
		
		double expectedResult = 1800;
			
		var func = new Funcionario("Antonio", "email", 2000,"DESENVOLVEDOR");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testDesenvolvedorSalarioMaior(){
		
		double expectedResult = 2400;
			
		var func = new Funcionario("Antonio", "email", 3000,"DESENVOLVEDOR");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testDbaSalarioMenor(){
		
		double expectedResult = 850;
			
		var func = new Funcionario("Antonio", "email", 1000,"DBA");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testDbaSalarioMaior(){
		
		double expectedResult = 1500;
			
		var func = new Funcionario("Antonio", "email", 2000,"DBA");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testTestadorSalarioMenor(){
		
		double expectedResult = 850;
			
		var func = new Funcionario("Antonio", "email", 1000,"TESTADOR");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testTestadorSalarioMaior(){
		
		double expectedResult = 1500;
			
		var func = new Funcionario("Antonio", "email", 2000,"TESTADOR");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testGerenteSalarioMaior(){
		
		double expectedResult = 3500;
			
		var func = new Funcionario("Antonio", "email", 5000,"GERENTE");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
	@Test
	public void testGerenteSalarioMenor(){
		
		double expectedResult = 3200;
			
		var func = new Funcionario("Antonio", "email", 4000,"GERENTE");
		
		var retorno = func.CalcularSalarioLiquido();

		assertEquals(expectedResult, retorno,2);
	}
	
}
