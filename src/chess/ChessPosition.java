package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		//porgramação defenciva abaixo [ || = OU ]
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantianting ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	//Não pode deixar a coluna ser alterada 
	//public void setColumn(char column) {
		//this.column = column;
	//}
	public int getRow() {
		return row;
	}
	//Não pode deixar a linha ser alterada
	//public void setRow(int row) {
		//this.row = row;
	//}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');		
	}	
		
	protected static ChessPosition fromPosition(Position position) {
		//(char)('a' - ....) fazendo casting de [a]
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		//"" forçando o compilador a concatenar string
		return "" + column + row;
	}

}
