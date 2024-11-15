import java.util.*;

public class Interfaces{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,top,down, and digonally - all direction");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,top,down, and digonally - all direction - one step only");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,top, and down");
    }
}
