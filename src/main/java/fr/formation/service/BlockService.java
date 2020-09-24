package fr.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.IBlockRepository;
import fr.formation.exception.BlockNotFoundException;
import fr.formation.model.Block;

@Service
public class BlockService {

	@Autowired
	private IBlockRepository daoBlock;
	
	public List<Block> findAll() {
		return this.daoBlock.findAll();
	}
	
	public Block findById(int id) {
		return this.daoBlock.findById(id)
				.orElseThrow(BlockNotFoundException::new);
	}
	
	public Block save(Block block) {
		return this.daoBlock.save(block);
	}
	
	public void deleteById(int id) {
		this.daoBlock.deleteById(id);
	}
}
