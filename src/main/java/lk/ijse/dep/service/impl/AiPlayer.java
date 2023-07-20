package lk.ijse.dep.service.impl;

import lk.ijse.dep.service.Board;
import lk.ijse.dep.service.Piece;
import lk.ijse.dep.service.Player;

import java.util.Random;

public class AiPlayer extends Player {
    public AiPlayer(Board board) {
        this.board = board;
    }

    @Override
    public void movePiece(int col) {
        Random random = new Random();
        //col = random.nextInt(5);
        col = minimax();
        if (board.isLegalMove(col)) {
            board.updateMove(col, Piece.GREEN);
            board.getBoardUI().update(col,false);
            Winner winner = board.findWinner();
            if (winner != null) {
                board.getBoardUI().notifyWinner(winner);
            }
        }
    }

    private int minimax() {
        // Piece[][] pieces = this.board.getPieces();

        return 0;
    }
}
