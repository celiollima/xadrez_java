package boardgame;
//criando o tabuleiro 
public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	//[][] matriz de pe�as
	public Board(int rows, int columns) {
		//Programa��o defensiva
		if (rows <1 || columns < 1) {
			throw new BoardException("Error creating board there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	//para n�o ser alterado as linhas do tabuleiro
	//public void setRows(int rows) {
		//this.rows = rows;
	//}
	public int getColumns() {
		return columns;
	}
	//para n�o ser alterado as colunas do tabuleiro
	//public void setColumns(int columns) {
	//	this.columns = columns;
	//}
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
		//sobre carga do m�todo abaixo:	
	}
	    //sobre carga do m�todo acima:
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsaPiece(position)) {
			throw new BoardException("There is already a piece on position " + position); 
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	//m�todo auxiliar o m�todo abaixo: 
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsaPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
