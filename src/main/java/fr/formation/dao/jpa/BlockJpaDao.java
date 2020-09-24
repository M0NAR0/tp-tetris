package fr.formation.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import fr.formation.dao.IBlockDao;
import fr.formation.model.Block;

public class BlockJpaDao implements IBlockDao {
	
	private EntityManager em;

	@Override
	public List<Block> findAll() {
		return em.createQuery("select b from Block b", Block.class)
				.getResultList();
	}

	@Override
	public Block findById(int id) {
		return em.find(Block.class, id);
	}

	@Override
	@Transactional
	public Block save(Block entity) {
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
		em.createQuery("delete from Block b where b.id = ?")
			.setParameter(1, id)
			.executeUpdate();
	}

}
