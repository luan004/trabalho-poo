package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.modelo.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		ProfessorDAO professorDAO = new ProfessorDAO();

		Professor professor = professorDAO.lerDadosProfessor();

		professorDAO.salvarProfessor(professor);

		for (Professor c : professorDAO.buscarProfessores()) {
			System.out.println(c.getNome());
		}

	}

}
