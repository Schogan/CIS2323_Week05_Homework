import board.*;

public class setupChessBoard{
	public static void main(String[] args){
		final int COUNT = 64;
		
		ChessBoard[][] Pieces  = new ChessBoard[8][8];
		//ChessBoard[] blackPieces  = new ChessBoard[COUNT];
		
		int countA=0;
		int countB=0;
		String type = "holder";
		int posX=0;
		int posY=0;
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==1 || i==6){
					type = "pawn";
				}
				if((i==0 || i==7) && (j==0||j==7)){
					type = "rook";
				}
				if((i==0 || i==7) && (j==1||j==6)){
					type = "knight";
				}
				if((i==0 || i==7) && (j==2||j==5)){
					type = "bishop";
				}
				if((i==0 || i==7) && j==3){
					type = "queen";
				}
				if((i==0 || i==7) && j==4){
					type = "king";
				}
				
				Pieces[i][j] = new ChessBoard();
				Pieces[i][j].ChessBoard(type, i, j);
					
			}
		}
	
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.println(Pieces[i][j].printInfo());
			}
		}
				
	}	
}