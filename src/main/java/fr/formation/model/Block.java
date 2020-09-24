package fr.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "block")
public class Block {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BLOCK_ID")
	private int id;
	
	@Column(name = "BLOCK_COORDINATE_X")
	private int coordinateX;
	
	@Column(name = "BLOCK_COORDINATE_Y")
	private int coordinateY;
	
	@ManyToOne
	@JoinColumn(name = "BLOCK_PIECE_ID")
	private Piece piece;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
}
