package com.chess.piece;

import com.chess.Color;
import com.chess.Coordinates;

import java.util.Set;

public class Rook extends LongRangePiece implements IRook{
    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return getRookMoves();
    }

}
