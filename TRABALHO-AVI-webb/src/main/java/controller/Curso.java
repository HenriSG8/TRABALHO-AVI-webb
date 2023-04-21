package controller;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	    private static int index = 0;
	    private int id;
	    private List<String> Cursos = new ArrayList<>();

	    public Curso() {
	        this.id = ++index;
	    }

	    public int getId() {
	        return id;
	    }

		public List<String> getCursos() {
			return Cursos;
		}

		public void setCursos(String cursos) {
			Cursos.add(cursos);
		}

	    
	}


	


