import board.*;
import java.util.Scanner;
public class setupChessBoard{
	public static void main(String[] args){
		//final int COUNT = 64;
		
		//ChessBoard[][] Pieces  = new ChessBoard[8][8];
		
		char choice = 'a';
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Would you like to make a new chess board? \n");
		choice = inputDevice.next().charAt(0);
		inputDevice.nextLine();
		
		
		boolean cont = true;
		//Chessboard newBoard = new ChessBoard();
		
		
		while(cont){
			System.out.println("=================================== \n");
			System.out.println("What would you like to do? \n");
			System.out.println("y) Make a new chess board? \n");
			//System.out.println("p) Print board \n");
			//System.out.println("c) Mark list done \n");
			//System.out.println("d) Print count of ToDo \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if(choice=='y'){
				new board.ChessBoard();
				//ChessBoard.printBoard();
			}
			/*if(choice=='p'){
				ChessBoard.printBoard();
			}*/
		}
		/*int countA=0;
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
				System.out.println(ChessBoard.Pieces[i][j].printInfo());
			}
		}*/
				
	}	
}