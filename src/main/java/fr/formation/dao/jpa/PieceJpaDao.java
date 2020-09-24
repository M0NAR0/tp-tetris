package fr.formation.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import fr.formation.dao.IPieceDao;
import fr.formation.model.Piece;

public class PieceJpaDao implements IPieceDao {
	
	private EntityManager em;

	@Override
	public List<Piece> findAll() {
		return em.createQuery("select p from Piece p", Piece.class)
				.getResultList();
	}

	@Override
	public Piece findById(int id) {
		return em.find(Piece.class, id);
	}

	@Override
	@Transactional
	public Piece save(Piece entity) {
		if (entity.getId() == 0) {
			em.persist(entity);
		}
		else {
			entity = em.merge(entity);
		}
		return entity;
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		em.createQuery("delete from Piece p where p.id = ?")
			.setParameter(1, id)
			.executeUpdate();
	}

}
