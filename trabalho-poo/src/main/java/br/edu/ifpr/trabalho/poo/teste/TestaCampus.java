package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TestaCampus {

	public static void main(String[] args) {

		CampusDAO campusDAO = new CampusDAO();

		Campus campus = campusDAO.lerDadosCampus();

		campusDAO.salvarCampus(campus);

		for (Campus c : campusDAO.buscarCampi()) {
			System.out.println(c.getNome());
		}

	}

}
