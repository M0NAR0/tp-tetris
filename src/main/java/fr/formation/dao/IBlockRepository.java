package fr.formation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Block;

public interface IBlockRepository extends JpaRepository<Block, Integer> {

}
