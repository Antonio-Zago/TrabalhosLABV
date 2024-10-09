package principal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import principal.Triangulo;

public class TrianguloTest {

	
	@Test
	public void testEscalenoValido() throws Exception{
		
		var expectedResult = "Escaleno";
		var triangulo = new Triangulo(5, 7, 8);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test
	public void testIsócelesValido() throws Exception{
		
		var expectedResult = "Isóceles";
		var triangulo = new Triangulo(5, 5, 8);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test
	public void testEquilateroValido() throws Exception{
		
		var expectedResult = "Equilatero";
		var triangulo = new Triangulo(5, 5, 5);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test
	public void testIsocelesValidoPermutacao1() throws Exception{
		
		var expectedResult = "Isóceles";
		var triangulo = new Triangulo(5, 5, 9);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test
	public void testIsocelesValidoPermutacao2() throws Exception{
		
		var expectedResult = "Isóceles";
		var triangulo = new Triangulo(5, 9, 5);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test
	public void testIsocelesValidoPermutacao3() throws Exception{
		
		var expectedResult = "Isóceles";
		var triangulo = new Triangulo(9, 5, 5);
		
		var resultado = triangulo.RetornarTipoTriangulo();
		assertEquals(expectedResult, resultado);
	}
	
	@Test(expected = Exception.class)
	public void testValorZero() throws Exception{
		
		var triangulo = new Triangulo(0, 3, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testValorNegativo() throws Exception{
		
		var triangulo = new Triangulo(-1, 3, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro() throws Exception{
		
		var triangulo = new Triangulo(2, 3, 5);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro2() throws Exception{
		
		var triangulo = new Triangulo(2, 5, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro3() throws Exception{
		
		var triangulo = new Triangulo(5, 2, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro4() throws Exception{
		
		var triangulo = new Triangulo(5, 3, 2);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro5() throws Exception{
		
		var triangulo = new Triangulo(3, 5, 2);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosIgualATerceiro6() throws Exception{
		
		var triangulo = new Triangulo(3, 2, 5);
		
	}
	
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro() throws Exception{
		
		var triangulo = new Triangulo(1, 3, 5);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro2() throws Exception{
		
		var triangulo = new Triangulo(1, 5, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro3() throws Exception{
		
		var triangulo = new Triangulo(5, 1, 3);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro4() throws Exception{
		
		var triangulo = new Triangulo(5, 3, 1);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro5() throws Exception{
		
		var triangulo = new Triangulo(3, 5, 1);
		
	}
	
	@Test(expected = Exception.class)
	public void testSomaDoisLadosMenorTerceiro6() throws Exception{
		
		var triangulo = new Triangulo(3, 1, 5);
		
	}
	
	@Test(expected = Exception.class)
	public void testValores0() throws Exception{
		
		var triangulo = new Triangulo(0,0,0);
		
	}
	
	
}
