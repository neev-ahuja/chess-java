import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

enum Piece {
    BlackBishop,
    BlackKing,
    BlackKnight,
    BlackQueen,
    BlackRook,
    BlackPawn,
    WhiteBishop,
    WhiteKing,
    WhiteKnight,
    WhiteQueen,
    WhiteRook,
    WhitePawn
}

public class Chess implements ActionListener {
    class Icons {
        static ImageIcon BlackRook = new ImageIcon(
                new ImageIcon("data/Blackrook.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon BlackKnight = new ImageIcon(
                new ImageIcon("data/Blackknight.png").getImage().getScaledInstance(50, 50,
                        java.awt.Image.SCALE_SMOOTH));
        static ImageIcon BlackBishop = new ImageIcon(
                new ImageIcon("data/Blackbishop.png").getImage().getScaledInstance(50, 50,
                        java.awt.Image.SCALE_SMOOTH));
        static ImageIcon BlackKing = new ImageIcon(
                new ImageIcon("data/Blackking.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon BlackQueen = new ImageIcon(
                new ImageIcon("data/Blackqueen.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhiteKnight = new ImageIcon(
                new ImageIcon("data/Whiteknight.png").getImage().getScaledInstance(50, 50,
                        java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhiteBishop = new ImageIcon(
                new ImageIcon("data/Whitebishop.png").getImage().getScaledInstance(50, 50,
                        java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhiteKing = new ImageIcon(
                new ImageIcon("data/Whiteking.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhiteQueen = new ImageIcon(
                new ImageIcon("data/Whitequeen.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhiteRook = new ImageIcon(
                new ImageIcon("data/Whiterook.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon WhitePawn = new ImageIcon(
                new ImageIcon("data/Whitepawn.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon BlackPawn = new ImageIcon(
                new ImageIcon("data/Blackpawn.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        static ImageIcon Dot = new ImageIcon(
                new ImageIcon("data/dot.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    }

    static HashMap<JButton, int[]> map = new HashMap<>();
    static Piece board[][] = new Piece[8][8];
    static JButton buttons[][] = new JButton[8][8];
    static boolean whiteTurn = true;

    public static void main(String[] args) {
        // Buttons
        Chess chessInstance = new Chess();
        JFrame frame = new JFrame();
        for (int i = 0; i < buttons.length; i++) {
            int y = 70 * i;
            Color color1;
            for (int j = 0; j < buttons[i].length; j++) {
                if ((i + 1) % 2 == 0) {
                    color1 = Color.black;
                } else {
                    color1 = Color.white;
                }
                if ((j + 1) % 2 == 0) {
                    if (color1 == Color.white) {
                        color1 = Color.black;
                    } else {
                        color1 = Color.white;
                    }
                }
                buttons[i][j] = new JButton();
                buttons[i][j].setBounds(j * 70, y, 70, 70);
                frame.add(buttons[i][j]);
                buttons[i][j].setBackground(color1);
                map.put(buttons[i][j], new int[] { i, j });
                buttons[i][j].addActionListener(chessInstance);
            }
        }
        JButton btn9 = new JButton();
        frame.add(btn9);
        btn9.setBounds(490, 490, 1, 1);
        btn9.setBackground(Color.white);

        // frame settings
        frame.setTitle("Chess");
        frame.setSize(575, 599);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        // icon
        ImageIcon icon = new ImageIcon("data//logo.jpg");
        frame.setIconImage(icon.getImage());
        createPieces(buttons);
    }

    private static void createPieces(JButton buttons[][]) {
        for (int i = 0; i < 8; i++) {
            buttons[6][i].setIcon(Icons.WhitePawn);
            buttons[1][i].setIcon(Icons.BlackPawn);
        }

        buttons[0][0].setIcon(Icons.BlackRook);
        buttons[0][1].setIcon(Icons.BlackKnight);
        buttons[0][2].setIcon(Icons.BlackBishop);
        buttons[0][3].setIcon(Icons.BlackQueen);
        buttons[0][4].setIcon(Icons.BlackKing);
        buttons[0][5].setIcon(Icons.BlackBishop);
        buttons[0][6].setIcon(Icons.BlackKnight);
        buttons[0][7].setIcon(Icons.BlackRook);

        buttons[7][0].setIcon(Icons.WhiteRook);
        buttons[7][1].setIcon(Icons.WhiteKnight);
        buttons[7][2].setIcon(Icons.WhiteBishop);
        buttons[7][3].setIcon(Icons.WhiteQueen);
        buttons[7][4].setIcon(Icons.WhiteKing);
        buttons[7][5].setIcon(Icons.WhiteBishop);
        buttons[7][6].setIcon(Icons.WhiteKnight);
        buttons[7][7].setIcon(Icons.WhiteRook);
        board[0][0] = Piece.BlackRook;
        board[0][1] = Piece.BlackKnight;
        board[0][2] = Piece.BlackBishop;
        board[0][3] = Piece.BlackBishop;
        board[0][4] = Piece.BlackKing;
        board[0][5] = Piece.BlackBishop;
        board[0][6] = Piece.BlackKnight;
        board[0][7] = Piece.BlackRook;

        board[7][0] = Piece.WhiteRook;
        board[7][1] = Piece.WhiteKnight;
        board[7][2] = Piece.WhiteBishop;
        board[7][3] = Piece.WhiteBishop;
        board[7][4] = Piece.WhiteKing;
        board[7][5] = Piece.WhiteBishop;
        board[7][6] = Piece.WhiteKnight;
        board[7][7] = Piece.WhiteRook;
    }

    private void clrDots() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (buttons[i][j].getIcon() == Icons.Dot)
                    buttons[i][j].setIcon(null);
                if (buttons[i][j].getRolloverIcon() == Icons.Dot)
                    buttons[i][j].setRolloverIcon(null);
            }
        }
    }

    private void rookPlace(int[] arr, List<JButton> targets) {
        int y = arr[0] - 1, x = arr[1];
        while (y >= 0) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y--;
        }
        y = arr[0] + 1;
        while (y < 8) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y++;
        }
        y = arr[0];
        x = arr[1] - 1;
        while (x >= 0) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            x--;
        }
        x = arr[1] + 1;
        while (x < 8) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            x++;
        }
    }

    private void bishopPlace(int[] arr, List<JButton> targets) {
        int y = arr[0] - 1, x = arr[1] - 1;
        while (y >= 0 && x >= 0) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y--;
            x--;
        }
        y = arr[0] - 1;
        x = arr[1] + 1;
        while (y >= 0 && x < 8) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y--;
            x++;
        }
        y = arr[0] + 1;
        x = arr[1] + 1;
        while (y < 8 && x < 8) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y++;
            x++;
        }
        y = arr[0] + 1;
        x = arr[1] - 1;
        while (y < 8 && x >= 0) {
            if (buttons[y][x].getIcon() != null) {
                targets.add(buttons[y][x]);
                break;
            }
            targets.add(buttons[y][x]);
            y++;
            x--;
        }
    }

    private Piece icoToPiece(Icon icon) {
        if (icon.equals(Icons.BlackRook))
            return Piece.BlackRook;
        if (icon.equals(Icons.BlackKnight))
            return Piece.BlackKnight;
        if (icon.equals(Icons.BlackBishop))
            return Piece.BlackBishop;
        if (icon.equals(Icons.BlackKing))
            return Piece.BlackKing;
        if (icon.equals(Icons.BlackQueen))
            return Piece.BlackQueen;
        if (icon.equals(Icons.WhiteKnight))
            return Piece.WhiteKnight;
        if (icon.equals(Icons.WhiteBishop))
            return Piece.WhiteBishop;
        if (icon.equals(Icons.WhiteKing))
            return Piece.WhiteKing;
        if (icon.equals(Icons.WhiteQueen))
            return Piece.WhiteQueen;
        if (icon.equals(Icons.WhiteRook))
            return Piece.WhiteRook;
        if (icon.equals(Icons.WhitePawn))
            return Piece.WhitePawn;
        if (icon.equals(Icons.BlackPawn))
            return Piece.BlackPawn;
        return null;
    }

    private boolean isWhitePiece(Icon icon){
        return icon == Icons.WhiteBishop || icon == Icons.WhiteKing || icon == Icons.WhiteKnight || icon == Icons.WhitePawn || icon == Icons.WhiteQueen || icon == Icons.WhiteRook;
    }
    int[] last = new int[2];

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        int[] arr = map.get(btn);

        if (btn.getIcon() == Icons.Dot || btn.getRolloverIcon() == Icons.Dot) {
            if(btn.getRolloverIcon() == Icons.Dot) btn.setRolloverIcon(null);
            buttons[arr[0]][arr[1]].setIcon(buttons[last[0]][last[1]].getIcon());
            buttons[last[0]][last[1]].setIcon(null);
            board[arr[0]][arr[1]] = icoToPiece(buttons[arr[0]][arr[1]].getIcon());
            board[last[0]][last[1]] = null;
            clrDots();
            if(isWhitePiece(buttons[arr[0]][arr[1]].getIcon())){
                whiteTurn = false;
            } else {
                whiteTurn = true;
            }
            return;
        }

        clrDots();

        List<JButton> targets = new LinkedList<>();

        if (whiteTurn) {
            if (btn.getIcon() == Icons.WhitePawn) {
                if (arr[0] - 1 >= 0) targets.add(buttons[arr[0] - 1][arr[1]]);
                if (arr[0] - 2 >= 0) targets.add(buttons[arr[0] - 2][arr[1]]);
            }

            if (btn.getIcon() == Icons.WhiteKnight) {
                int[][] moves = {
                        { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 },
                        { 1, 2 }, { -1, 2 }, { 1, -2 }, { -1, -2 }
                };

                for (int[] move : moves) {
                    int newRow = arr[0] + move[0];
                    int newCol = arr[1] + move[1];
                    if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
                        targets.add(buttons[newRow][newCol]);
                    }
                }
            }

            if (btn.getIcon() == Icons.WhiteBishop) {
                bishopPlace(arr, targets);
            }

            if (btn.getIcon() == Icons.WhiteRook) {
                rookPlace(arr, targets);
            }

            if (btn.getIcon() == Icons.WhiteQueen) {
                rookPlace(arr, targets);
                bishopPlace(arr, targets);
            }

            if (btn.getIcon() == Icons.WhiteKing) {
                if(arr[0]-1 >= 0)targets.add(buttons[arr[0] - 1][arr[1]]);
                if(arr[0]+1 < 8)targets.add(buttons[arr[0] + 1][arr[1]]);
                if(arr[1]-1 >= 0)targets.add(buttons[arr[0]][arr[1] - 1]);
                if(arr[1]+1 < 8)targets.add(buttons[arr[0]][arr[1] + 1]);
                if(arr[0]-1 >= 0 && arr[1]+1 < 8)targets.add(buttons[arr[0] - 1][arr[1] - 1]);
                if(arr[0]+1 < 8 && arr[1]-1 >= 0)targets.add(buttons[arr[0] + 1][arr[1] + 1]);
                if(arr[1]-1 >= 0 && arr[0]-1 >= 0)targets.add(buttons[arr[0] - 1][arr[1] + 1]);
                if(arr[1]+1 < 8 && arr[0]+1 < 8)targets.add(buttons[arr[0] + 1][arr[1] - 1]);
            }
        } else {
            if(btn.getIcon() == Icons.BlackPawn){
                if(arr[0]+1 >= 0) targets.add(buttons[arr[0] +1][arr[1]]);
                if(arr[0]+2 >= 0) targets.add(buttons[arr[0] + 2][arr[1]]);

            }    
            
            if(btn.getIcon() == Icons.BlackKnight){
                int[][] moves = {
                    {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                    {1, 2}, {-1, 2}, {1, -2}, {-1, -2}
                };
                
                for (int[] move : moves) {
                    int newRow = arr[0] + move[0];
                    int newCol = arr[1] + move[1];
                    if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
                        targets.add(buttons[newRow][newCol]);
                    }
                }
            }
    
            if(btn.getIcon() == Icons.BlackBishop){
                bishopPlace(arr, targets);
            }
    
            if(btn.getIcon() == Icons.BlackRook){
                rookPlace(arr, targets);
            }
    
            if(btn.getIcon() == Icons.BlackQueen){
                rookPlace(arr, targets);
                bishopPlace(arr, targets);
            }
    
            if(btn.getIcon() == Icons.BlackKing){
                if(arr[0]-1 >= 0)targets.add(buttons[arr[0] - 1][arr[1]]);
                if(arr[0]+1 < 8)targets.add(buttons[arr[0] + 1][arr[1]]);
                if(arr[1]-1 >= 0)targets.add(buttons[arr[0]][arr[1] - 1]);
                if(arr[1]+1 < 8)targets.add(buttons[arr[0]][arr[1] + 1]);
                if(arr[0]-1 >= 0 && arr[1]+1 < 8)targets.add(buttons[arr[0] - 1][arr[1] - 1]);
                if(arr[0]+1 < 8 && arr[1]-1 >= 0)targets.add(buttons[arr[0] + 1][arr[1] + 1]);
                if(arr[1]-1 >= 0 && arr[0]-1 >= 0)targets.add(buttons[arr[0] - 1][arr[1] + 1]);
                if(arr[1]+1 < 8 && arr[0]+1 < 8)targets.add(buttons[arr[0] + 1][arr[1] - 1]);
            }
        }

        last = arr;

        for (int i = 0; i < targets.size(); i++) {
            if (targets.get(i).getIcon() == null) 
                targets.get(i).setIcon(Icons.Dot);
            else if(whiteTurn){
                if(!isWhitePiece(targets.get(i).getIcon())) targets.get(i).setRolloverIcon(Icons.Dot);
            } else {
                if (isWhitePiece(targets.get(i).getIcon())) targets.get(i).setRolloverIcon(Icons.Dot);
            }
            
        }
    }

}
