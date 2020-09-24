package fr.formation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.dao.IPieceRepository;
import fr.formation.exception.PieceNotFoundException;
import fr.formation.model.Piece;

@Service
public class PieceService {

	private IPieceRepository daoPiece;
	
	public List<Piece> findAll() {
		return this.daoPiece.findAll();
	}
	
	public Piece findById(int id) {
		return this.daoPiece.findById(id)
				.orElseThrow(PieceNotFoundException::new);
	}
	
	public Piece save(int id, Piece piece) {
		return this.daoPiece.save(piece);
	}
	
	public void deleteById(int id) {
		this.daoPiece.deleteById(id);
	}
}
