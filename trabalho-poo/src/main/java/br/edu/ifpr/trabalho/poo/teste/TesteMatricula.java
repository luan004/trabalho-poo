package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;

public class TesteMatricula {

	public static void main(String[] args) {

		MatriculaDAO matriculaDAO = new MatriculaDAO();

		Matricula matricula = matriculaDAO.lerDadosMatricula();

		matriculaDAO.salvarMatricula(matricula);

		for (Matricula c : matriculaDAO.buscarMatriculas()) {
			System.out.println(c.getRa());
		}

	}

}
