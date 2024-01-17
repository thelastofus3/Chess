# Chess

This chess project is a console application implemented in Java. It includes various classes to represent the chessboard, pieces, moves, and game logic.

## Project Structure

- **com.chess.board** - contains classes related to the chessboard, its creation, cells, and moves.
  - `Board` - class representing the chessboard.
  - `BoardFactory` - factory for creating a board from Forsyth-Edwards Notation (FEN).
  - `BoardUtils` - utilities for working with coordinates on the board.
  - `Move` - class representing a move on the board.

- **com.chess.piece** - includes classes for different chess pieces.
  - `Piece` - abstract class for pieces.
  - `King`, `Queen`, `Rook`, `Bishop`, `Knight`, `Pawn` - classes for respective pieces.
  - `LongRangePiece` - abstract class for long-range pieces.
  - `IBishop`, `IRook` - interfaces providing possible moves.

- **com.chess** - contains main classes for game management and console rendering.
  - `Game` - class for managing the game process.
  - `GameState` - enumeration for different game states.
  - `GameStateChecker` - abstract class for checking the game state.
  - `CheckmateGameStateChecker`, `StalemateGameStateChecker` - classes for checking checkmate and stalemate situations.
  - `BoardConsoleRenderer` - class for rendering the board in the console.
  - `InputCoordinates` - class for console input of coordinates and moves.

## How to Use

1. Create an instance of the `Board` class with the initial board state in FEN format.
2. Use the `Game` class to start the game loop and manage the game.
3. Monitor the console display of the game board using `BoardConsoleRenderer`.

## Important Classes and Methods

- `Board`:
  - `makeMove(Move move)`: Performs a move on the board.
  - `isSquareAttackedByColor(Coordinates coordinates, Color color)`: Checks if a square is attacked by pieces of a certain color.
  - `getPiecesByColor(Color color)`: Returns a list of pieces of a specific color.

- `Game`:
  - `gameLoop()`: Main game loop managing moves and checking the game state.

- `BoardConsoleRenderer`:
  - `render(Board board)`: Displays the current state of the board in the console.
  - `render(Board board, Piece pieceToMove)`: Displays the board with highlighted available moves for a selected piece.

## Example Usage

```java
public static void main(String[] args) {
    String startingFen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
    Board board = new Board(startingFen);
    board.setupDefaultPiecesPositions();

    Game game = new Game(board);
    game.gameLoop();
}
```

This code creates a board from an FEN string, sets up standard pieces, and starts the game loop. During the game, moves can be input in the console, and the board will be displayed accordingly.
