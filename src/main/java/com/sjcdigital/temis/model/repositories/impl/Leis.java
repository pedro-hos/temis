package com.sjcdigital.temis.model.repositories.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.TypedQuery;

import com.sjcdigital.temis.model.entities.impl.Lei;
import com.sjcdigital.temis.model.repositories.Repository;

/**
 * @author pedro-hos
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class Leis extends Repository<Lei> {

	public List<Lei> doAutor(final Long idAutor) {
		TypedQuery<Lei> query = em.createQuery("SELECT lei FROM Lei lei WHERE lei.autor.id = :autor_id", Lei.class);
		query.setParameter("autor_id", idAutor);
		return query.getResultList();
	}

}
