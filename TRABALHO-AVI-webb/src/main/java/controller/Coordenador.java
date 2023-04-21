package controller;

import java.util.ArrayList;
import java.util.List;

public class Coordenador {
    private int id;
    private List<String> nome = new ArrayList<>();
    private String identificar;
    
	public List<String> getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome.add(nome);
	}


}
