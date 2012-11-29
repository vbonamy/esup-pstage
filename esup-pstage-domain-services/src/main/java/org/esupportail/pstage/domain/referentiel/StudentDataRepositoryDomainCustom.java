package org.esupportail.pstage.domain.referentiel;

import java.util.List;

import org.esupportail.pstage.domain.beans.EtudiantRef;

/**
 * 
 * Acces au composantes du personnel personnalise
 *
 */

public class StudentDataRepositoryDomainCustom implements
	StudentDataRepositoryDomain {


	/**
	 * @see org.esupportail.pstage.domain.referentiel.StudentDataRepositoryDomain#getEtudiantRef(java.lang.String, java.lang.String)
	 */
	public EtudiantRef getEtudiantRef(String universityCode, String id) {
		throw new UnsupportedOperationException(Configuration.getString("method.nom.implementee"));
	}

	
	/**
	 * @see org.esupportail.pstage.domain.referentiel.StudentDataRepositoryDomain#getEtudiantRefByNum(java.lang.String, java.lang.String)
	 */
	public EtudiantRef getEtudiantRefByNum(String universityCode, String id) {
		throw new UnsupportedOperationException(Configuration.getString("method.nom.implementee"));
	}


	/**
	 * @see org.esupportail.pstage.domain.referentiel.StudentDataRepositoryDomain#getEtudiantsRefByName(java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<EtudiantRef> getEtudiantsRefByName(String universityCode,
			String name, String firstName) {
		throw new UnsupportedOperationException(Configuration.getString("method.nom.implementee"));
	}


	



}