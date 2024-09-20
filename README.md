Java Chess Game
This is a simple Chess Game developed in Java, providing a classic two-player chess experience. The game follows standard chess rules, with the goal of checkmating the opponent's king.

Features
Graphical User Interface (GUI): The game includes a chessboard rendered in a grid with pieces displayed as icons.
Two-player functionality: Players can take turns moving pieces according to standard chess rules.
Chess Pieces: Supports all standard chess pieces - King, Queen, Bishop, Knight, Rook, and Pawns.
Legal Moves: Enforces legal moves for each piece, including special moves like castling, en passant, and pawn promotion (if implemented).
Check and Checkmate Detection: Recognizes check and checkmate conditions (if implemented).
Project Structure
src/: Contains all the Java source code files.
Chess.java: The main class which launches the game.
Board.java: Handles the chessboard setup and piece positions.
Piece.java: Defines the logic and movement of different chess pieces.
Game.java: Manages game flow, including turns and win conditions.
How to Run the Project
Clone the repository:

bash
```console
foo@bar:~$ whoami
foo
```
Copy code
git clone https://github.com/yourusername/java-chess-game.git
Compile the project:

Navigate to the project directory and run the following command:

bash
Copy code
javac src/*.java
Run the Game:

After compiling, run the main class to start the chess game:

bash
Copy code
java src.Chess
Screenshots

Future Enhancements
AI Opponent: Implement an AI player to allow single-player gameplay.
Undo/Redo Moves: Add functionality to undo or redo moves.
Timed Games: Add timers for competitive play.
Multiplayer over Network: Support for online multiplayer chess matches.
