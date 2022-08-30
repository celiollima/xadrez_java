package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		//percorrendo as linhas. 
		for (int i=0; i<board.getRows(); i++) {
		//percorrendo as colunas.	
			for (int j=0; j<board.getColumns(); j++) {
				//monta as peças abaixo
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		//retorna a matriz de peças
		return mat; 
	}
}
