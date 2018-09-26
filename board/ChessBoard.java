package board;

public class ChessBoard{
	// Object attributes
	private ChessBoard[][] Pieces  = new ChessBoard[8][8];
	private String typeName;
	private String newColor;
	private String type;
	private int posX;
	private int posY;
	private char posYChar;
	
	// Object Methods
	public void ChessBoard(){
		
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
				Pieces[i][j].makeChessBoard(type, i, j);
					
			}
		}
		//printBoard();
	}
	public void makeChessBoard(String p, int a, int b){
		if(a == 2 || a == 3 || a == 4 || a == 5){
			
		}else{
		setColor(a);
		setPieceType(p);
		setPosition(a,b);		
		}
	}

	
	public String getPosition(){
		
		return "Piece position: " + posX + "," + posYChar;
		
	}
	public void printBoard(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.println(Pieces[i][j].printInfo());
			}
		}
		
	}
	/*public void pBoard(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.println(Pieces[i][j].printInfo());
			}
		}
		
	}*/
	
	public void setPosition(int x, int y){
		posX = x+1;
		posY = y;
		
	
		if (posY == 0){
			posYChar = 'A';
		}
		if (posY == 1){
			posYChar = 'B';
		}
		if (posY == 2){
			posYChar = 'C';
		}
		if (posY == 3){
			posYChar = 'D';
		}
		if (posY == 4){
			posYChar = 'E';
		}
		if (posY == 5){
			posYChar = 'F';
		}
		if (posY == 6){
			posYChar = 'G';
		}
		if (posY == 7){
			posYChar = 'H';
		}
		
		
	}
	public String getColor(){
		return newColor;
	}
	public void setColor(int x){
		if(x==1 || x==2){
			newColor = "white";
		}
		if(x==7 || x==8){
			newColor = "black";
		}
	}
	public String getPieceType(){
		return typeName;
	}
	public void setPieceType(String name){
		typeName = name;
	}
	public String printInfo(){
		return "This piece is a " + getPieceType() + "\n"
			+ " is color " + getColor() + "\n"
			+ " and is in \n" + getPosition() + "\n";
	}
	
}