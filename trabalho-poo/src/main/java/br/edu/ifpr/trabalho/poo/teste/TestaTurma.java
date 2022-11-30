package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.TurmaDAO;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TestaTurma {

	public static void main(String[] args) {
		TurmaDAO turmaDAO = new TurmaDAO();

		Turma turma = turmaDAO.lerDadosTurma();

		turmaDAO.salvarTurma(turma);

		for (Turma c : turmaDAO.buscarTurmas()) {
			System.out.println(c.getNome());
		}

	}

}
