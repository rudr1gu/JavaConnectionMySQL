package eteczl.BancodeDados.model;

public class Pessoa {
	private String nome;
	private int id;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa(String n) {
		this.nome = n;
	}
	

}
