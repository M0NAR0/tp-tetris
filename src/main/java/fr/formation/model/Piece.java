package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "piece")
public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PIECE_ID")
	private int id;
	
	@OneToMany(mappedBy = "piece")
	private List<Block> blocks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}
}
