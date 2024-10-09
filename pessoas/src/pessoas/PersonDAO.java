package pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonDAO {

	public void save(Person p) {
		
	}
	
	public List<String> IsValidToInclude(Person p){
		List<String> retorno = new ArrayList<String>();
		
		var validacaoNome = ValidaNome(p);
		
		if(validacaoNome != null) {
			retorno.add(validacaoNome);
		}
		
		var validacaIdade = ValidaIdade(p);
		
		if(validacaIdade != null) {
			retorno.add(validacaIdade);
		}
		
		var validacaEmailAssociado = ValidaEmailAssociado(p);
		
		if(validacaEmailAssociado != null) {
			retorno.add(validacaEmailAssociado);
		}
		
		var validacaEmail = ValidaEmail(p);
		
		if(validacaEmail != null) {
			retorno.add(validacaEmail);
		}
		
		
		return retorno;
	}
	
	public String ValidaNome(Person p) {
		
		if(p.getName().split(" ").length < 2) {
			return "Nome inválido";
		}
		
		for (var nome : p.getName().split(" ")) {
			 if(!nome.matches("[a-zA-Z]+")) {
				 return "Nome inválido";
			 }
		}
		
		return null;
		
	}
	
	public String ValidaIdade(Person p) {
		
		if(p.getAge() < 1 || p.getAge() > 200) {
			return "Idade inválida";
		}
		
		return null;
		
	}
	
	public String ValidaEmailAssociado(Person p) {
		
		if(p.getEmail() == null) {
			return "Nenhum email associado";
		}
		
		return null;
		
	}
	
	public String ValidaEmail(Person p) {
		
		 String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
	     Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	        if (p.getEmail().getName() == null
	        		|| !EMAIL_PATTERN.matcher(p.getEmail().getName()).matches()) {
	            return "Email invalido";
	        }

	        return null;	
	}
}
