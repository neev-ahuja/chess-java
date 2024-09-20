class piece {
    int x , y ;
    String type , player;
    public piece(int x , int y , String type , String player){
        this.type = type;
        this.x = x ;
        this.y = y ;
        this.player = player;
    }
}
class board{
    static piece pawn1 = new piece(1,7,"pawn", "white");
    static piece pawn2 = new piece(2,7,"pawn", "white");
    static piece pawn3 = new piece(3,7,"pawn", "white");
    static piece pawn4 = new piece(4,7,"pawn", "white");
    static piece pawn5 = new piece(5,7,"pawn", "white");
    static piece pawn6 = new piece(6,7,"pawn", "white");
    static piece pawn7 = new piece(7,7,"pawn", "white");
    static piece pawn8 = new piece(8,7,"pawn", "white");
    
    static piece pawn1b = new piece(1,2,"pawn", "black");
    static piece pawn2b = new piece(2,2,"pawn", "black");
    static piece pawn3b = new piece(3,2,"pawn", "black");
    static piece pawn4b = new piece(4,2,"pawn", "black");
    static piece pawn5b = new piece(5,2,"pawn", "black");
    static piece pawn6b = new piece(6,2,"pawn", "black");
    static piece pawn7b = new piece(7,2,"pawn", "black");
    static piece pawn8b = new piece(8,2,"pawn", "black");

    static piece king = new piece(5, 8, "king", "white");
    static piece queen = new piece(4, 8, "queen", "white");
    static piece bishop1 = new piece(3, 8, "bishop", "white");
    static piece bishop2 = new piece(6, 8, "bishop", "white");
    static piece knight1 = new piece(2, 8, "knight", "white");
    static piece knight2 = new piece(7, 8, "knight", "white");
    static piece rook1 = new piece(1, 8, "rook", "white");
    static piece rook2 = new piece(8, 8, "rook", "white");

    static piece kingb = new piece(5, 1, "king", "black");
    static piece queenb = new piece(4, 1, "queen", "black");
    static piece bishop1b = new piece(3, 1, "bishop", "black");
    static piece bishop2b = new piece(6, 1, "bishop", "black");
    static piece knight1b = new piece(2, 1, "knight", "black");
    static piece knight2b = new piece(7, 1, "knight", "black");
    static piece rook1b = new piece(1, 1, "rook", "black");
    static piece rook2b = new piece(8, 1, "rook", "black");
}