package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.CursoDAO;
import br.edu.ifpr.trabalho.poo.modelo.Curso;

public class TesteCurso {

	public static void main(String[] args) {

		CursoDAO cursoDAO = new CursoDAO();

		Curso curso = cursoDAO.lerDadosCurso();

		cursoDAO.salvarCurso(curso);

		for (Curso c : cursoDAO.buscarCursos()) {
			System.out.println(c.getNome());
		}

	}

}
