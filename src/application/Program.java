package application;

import chess.ChessMatch;
//import boardgame.Position;

public class Program {

	public static void main(String[] args) {


		ChessMatch chessMatch = new ChessMatch();
		//UI = USER INTERFACE
		UI.printBoard(chessMatch.getPieces());
	}

}
