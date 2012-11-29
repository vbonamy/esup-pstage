/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstage.domain;

import java.util.List;

import org.esupportail.pstagedata.remote.DataAddException_Exception;
import org.esupportail.pstagedata.remote.DataDeleteException_Exception;
import org.esupportail.pstagedata.remote.DataUpdateException_Exception;
import org.esupportail.pstagedata.remote.EtudiantDTO;
import org.esupportail.pstagedata.remote.RemoteServices;
import org.esupportail.pstagedata.remote.WebServiceDataBaseException_Exception;

/**
 * Convention Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtudiantDomainServiceImpl implements EtudiantDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * RemoteServices
	 */
	public RemoteServices remoteServices;

	/**
	 * @return the RemoteServices
	 */
	public RemoteServices getRemoteServices() {
		return remoteServices;
	}

	/**
	 * @param RemoteServices the RemoteServices to set
	 */
	public void setRemoteServices(RemoteServices remoteServices) {
		this.remoteServices = remoteServices;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#addEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public int addEtudiant(EtudiantDTO etudiant) throws DataAddException_Exception,
		WebServiceDataBaseException_Exception {
		return this.remoteServices.addEtudiant(etudiant);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#deleteEtudiant(int)
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteException_Exception,WebServiceDataBaseException_Exception {
		return this.remoteServices.deleteEtudiant(idEtudiant);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#getEtudiantFromId(int)
	 */
	public EtudiantDTO getEtudiantFromId(int id) {
		return this.remoteServices.getEtudiantFromId(id);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#getEtudiants()
	 */
	public List<EtudiantDTO> getEtudiants() {
		return this.remoteServices.getEtudiants();
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#updateEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public boolean updateEtudiant(EtudiantDTO etudiant)
	throws DataUpdateException_Exception, WebServiceDataBaseException_Exception {
		return this.remoteServices.updateEtudiant(etudiant);
	}

}