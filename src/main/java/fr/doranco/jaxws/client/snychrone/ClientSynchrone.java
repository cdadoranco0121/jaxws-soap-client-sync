package fr.doranco.jaxws.client.snychrone;

import java.util.List;

import fr.doranco.jaxws.webservice.Etudiant;
import fr.doranco.jaxws.webservice.EtudiantService;
import fr.doranco.jaxws.webservice.EtudiantService_Service;

public class ClientSynchrone {

	public static void main(String[] args) {
		EtudiantService_Service service = new EtudiantService_Service();
		EtudiantService port = service.getEtudiantPort();
		
		Etudiant etudiantToAdd = new Etudiant("HUGO", "Victor", "écrivain", 35);
		Etudiant etudiantAdded = null;

		try {
			// etudiantAdded = port.addEtudiant(etudiantToAdd);
			// Etudiant etudiantById = port.getEtudiantById(6);
			List<Etudiant> etudiants = port.getEtudiants();
			
			etudiants.forEach(etudiant -> System.out.println(etudiant));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
