import board.*;

public class setupChessBoard{
	public static void main(String[] args){
		final int COUNT = 16;
		
		ChessBoard[] whitePieces  = new ChessBoard[COUNT];
		ChessBoard[] blackPieces  = new ChessBoard[COUNT];
		
		int countA=0;
		int countB=0;
		String type = "holder";
		int posX=0;
		int posY=0;
		
		while (countA<COUNT){
			for(int i=1;i<3;i++){
				for(int j=1;j<9;j++){
					if(i==2){
						type = "pawn";
					}
					if(i==1 && (j==1||j==8)){
						type = "rook";
					}
					if(i==1 && (j==2||j==7)){
						type = "knight";
					}
					if(i==1 && (j==3||j==6)){
						type = "bishop";
					}
					if(i==1 && j==4){
						type = "queen";
					}
					if(i==1 && j==5){
						type = "king";
					}
					
					whitePieces[countA] = new ChessBoard();
					whitePieces[countA].ChessBoard("White", type, i, j);
					countA++;
				}
			}
		}
		while (countB<COUNT){	
			for(int i=8;i>6;i--){
				for(int j=1;j<9;j++){
					if(i==7){
						type = "pawn";
					}
					if(i==8 && (j==1||j==8)){
						type = "rook";
					}
					if(i==8 && (j==2||j==7)){
						type = "knight";
					}
					if(i==8 && (j==3||j==6)){
						type = "bishop";
					}
					if(i==8 && j==4){
						type = "queen";
					}
					if(i==8 && j==5){
						type = "king";
					}
					
					blackPieces[countB] = new ChessBoard();
					blackPieces[countB].ChessBoard("Black", type, i, j);
					countB++;
				}
			}
		}
		
		for(int i=0;i<COUNT;i++){
			System.out.println(whitePieces[i].printInfo());
		}
		for(int i=0;i<COUNT;i++){
			System.out.println(blackPieces[i].printInfo());
		}
		
	}	
}