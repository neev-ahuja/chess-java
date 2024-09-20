import javax.swing.ImageIcon;

class icons{

    static ImageIcon dot= new ImageIcon(new ImageIcon("data/dot.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));

    static ImageIcon  WhitePawn =  new ImageIcon(new ImageIcon("data/Whitepawn.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Whiteking =  new ImageIcon(new ImageIcon("data/Whiteking.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Whitequeen =  new ImageIcon(new ImageIcon("data/Whitequeen.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Whitebishop =  new ImageIcon(new ImageIcon("data/Whitebishop.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Whiteknight =  new ImageIcon(new ImageIcon("data/Whiteknight.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Whiterook =  new ImageIcon(new ImageIcon("data/Whiterook.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    
    static ImageIcon  BlackPawn =  new ImageIcon(new ImageIcon("data/Blackpawn.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Blackrook =  new ImageIcon(new ImageIcon("data/Blackrook.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Blackbishop =  new ImageIcon(new ImageIcon("data/Blackbishop.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Blackknight =  new ImageIcon(new ImageIcon("data/Blackknight.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Blackking =  new ImageIcon(new ImageIcon("data/Blackking.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon  Blackqueen =  new ImageIcon(new ImageIcon("data/Blackqueen.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
}

public class chess{
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        ui ui = new ui();
        ui.start();
        ui.move(board.pawn1.x, board.pawn1.y , icons.WhitePawn); 
        ui.move(board.pawn2.x, board.pawn2.y , icons.WhitePawn);        
        ui.move(board.pawn3.x, board.pawn3.y , icons.WhitePawn);        
        ui.move(board.pawn4.x, board.pawn4.y , icons.WhitePawn);        
        ui.move(board.pawn5.x, board.pawn5.y , icons.WhitePawn);        
        ui.move(board.pawn6.x, board.pawn6.y , icons.WhitePawn);        
        ui.move(board.pawn7.x, board.pawn7.y , icons.WhitePawn);        
        ui.move(board.pawn8.x, board.pawn8.y , icons.WhitePawn);     
        
        ui.move(board.pawn1b.x, board.pawn1b.y , icons.BlackPawn); 
        ui.move(board.pawn2b.x, board.pawn2b.y , icons.BlackPawn);        
        ui.move(board.pawn3b.x, board.pawn3b.y , icons.BlackPawn);        
        ui.move(board.pawn4b.x, board.pawn4b.y , icons.BlackPawn);        
        ui.move(board.pawn5b.x, board.pawn5b.y , icons.BlackPawn);        
        ui.move(board.pawn6b.x, board.pawn6b.y , icons.BlackPawn);        
        ui.move(board.pawn7b.x, board.pawn7b.y , icons.BlackPawn);        
        ui.move(board.pawn8b.x, board.pawn8b.y , icons.BlackPawn); 
    
        ui.move(board.king.x, board.king.y , icons.Whiteking); 
        ui.move(board.queen.x, board.queen.y , icons.Whitequeen); 
        ui.move(board.rook1.x, board.rook1.y , icons.Whiterook); 
        ui.move(board.rook2.x, board.rook2.y , icons.Whiterook); 
        ui.move(board.bishop1.x, board.bishop1.y , icons.Whitebishop); 
        ui.move(board.bishop2.x, board.bishop2.y , icons.Whitebishop); 
        ui.move(board.knight1.x, board.knight1.y , icons.Whiteknight); 
        ui.move(board.knight2.x, board.knight2.y , icons.Whiteknight); 
        
        ui.move(board.kingb.x, board.kingb.y , icons.Blackking); 
        ui.move(board.queenb.x, board.queenb.y , icons.Blackqueen); 
        ui.move(board.rook1b.x, board.rook1b.y , icons.Blackrook); 
        ui.move(board.rook2b.x, board.rook2b.y , icons.Blackrook); 
        ui.move(board.bishop1b.x, board.bishop1b.y , icons.Blackbishop); 
        ui.move(board.bishop2b.x, board.bishop2b.y , icons.Blackbishop); 
        ui.move(board.knight1b.x, board.knight1b.y , icons.Blackknight); 
        ui.move(board.knight2b.x, board.knight2b.y , icons.Blackknight); 
    }
}