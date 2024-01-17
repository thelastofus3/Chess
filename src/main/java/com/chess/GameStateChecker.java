package com.chess;

import com.chess.board.Board;

public abstract class GameStateChecker {
    public abstract GameState check(Board board, Color color);
}
