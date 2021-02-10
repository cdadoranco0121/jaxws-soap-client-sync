package fr.doranco.jaxws.etudiant;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.doranco.jaxws.webservice.EtudiantService;
import fr.doranco.jaxws.webservice.EtudiantService_Service;

public class EtudiantWebServiceSynchroneTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EtudiantService_Service service = new EtudiantService_Service();
		EtudiantService port = service.getEtudiantPort();	
	}
	
	@Test
	public void testGetEtudiants() {
		// TODO
	}

}
