package it.alessia.sito.form;

public class FormUtente {
	
	private String nome;
	private String cognome;
	
	
	public FormUtente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
}
