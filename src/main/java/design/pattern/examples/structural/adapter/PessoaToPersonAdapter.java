package design.pattern.examples.structural.adapter;

public class PessoaToPersonAdapter implements IPerson {
	
	private Pessoa pessoa;
	
	public PessoaToPersonAdapter(Pessoa pessoa){
		this.pessoa = pessoa;
	}
	
	public String getName() {
		return pessoa.getNome();
	}

	public void setName(String name) {
		pessoa.setNome(name);
	}

	public String getSurname() {
		return pessoa.getSobrenome();
	}

	public void setSurname(String surname) {
		pessoa.setSobrenome(surname);		
	}
	
}
