package pessoas.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import pessoas.Email;
import pessoas.Person;
import pessoas.PersonDAO;

public class PessoaTest {

	@Test
	public void testNomeFormatoCerto(){
		
		String expectedResult = null;
			
		var person = new Person();
		
		person.setName("abc abc");
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaNome(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testComUmNome(){
		
		String expectedResult = "Nome inválido";
			
		var person = new Person();
		
		person.setName("abc");
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaNome(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testComCaracteresErradosNome(){
		
		String expectedResult = "Nome inválido";
			
		var person = new Person();
		
		person.setName("abc1@a");
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaNome(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testIdadeCorreta(){
		
		String expectedResult = null;
			
		var person = new Person();
		
		person.setAge(18);
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaIdade(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testIdadeMenorLimite(){
		
		String expectedResult = "Idade inválida";
			
		var person = new Person();
		
		person.setAge(0);
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaIdade(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testIdadeMaiorLimite(){
		
		String expectedResult = "Idade inválida";
			
		var person = new Person();
		
		person.setAge(201);
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaIdade(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testEmailAssociado(){
		
		String expectedResult = null;
			
		var person = new Person();
		
		person.setEmail(new Email());
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaEmailAssociado(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testSemEmailAssociado(){
		
		String expectedResult = "Nenhum email associado";
			
		var person = new Person();
		
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaEmailAssociado(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testEmail(){
		
		String expectedResult = null;
			
		var person = new Person();
		
		var email = new Email();
		email.setName("antonio@gmail.com");
		
		person.setEmail(email);
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaEmail(person);

		assertEquals(expectedResult, retorno);
	}
	
	@Test
	public void testEmailInvalido(){
		
		String expectedResult = "Email invalido";
			
		var person = new Person();
		
		var email = new Email();
		email.setName("antonio@gmail");
		
		person.setEmail(email);
		
		var personDao = new PersonDAO();
		
		var retorno = personDao.ValidaEmail(person);

		assertEquals(expectedResult, retorno);
	}
	
}
