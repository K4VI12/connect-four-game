package lk.ijse.dep.service.impl;

import lk.ijse.dep.service.Board;
import lk.ijse.dep.service.Piece;
import lk.ijse.dep.service.Player;

public class HumanPlayer extends Player {

    public HumanPlayer(Board newBoard) {
        this.board = newBoard;
    }

    @Override
    public void movePiece(int col) {

        if (board.isLegalMove(col)) {
            board.updateMove(col, Piece.BLUE);
            board.getBoardUI().update(col,true);
            Winner winner = board.findWinner();
            if (winner != null) {
                board.getBoardUI().notifyWinner(winner);
            }
        }
    }
}
