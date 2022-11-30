package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;

public class TesteDisciplina {

	public static void main(String[] args) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();

		Disciplina disciplina = disciplinaDAO.lerDadosDisciplina();

		disciplinaDAO.salvarDisciplina(disciplina);

		for (Disciplina c : disciplinaDAO.buscarDisciplinas()) {
			System.out.println(c.getNome());
		}

	}

}
