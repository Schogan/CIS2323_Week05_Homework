package board;

public class ChessBoard{
	// Object attributes
	//private ChessBoard[][] board = new ChessBoard[8][8]
	private String typeName;
	private String newColor;
	private int posX;
	private int posY;
	private char posYChar;
	
	// Object Methods
	public void ChessBoard(String p, int a, int b){
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
	/*public void setBoard(int x, int y){
		
		board[x][y] = 
	}*/
	public void setPosition(int x, int y){
		posX = x+1;
		posY = y;
		
		/*posX
		if (posX == 0){
			posX =;
		}
		if (posX == 1){
			posYChar = 'B';
		}
		if (posX == 2){
			posYChar = 'C';
		}
		if (posX == 3){
			posYChar = 'D';
		}
		if (posX == 4){
			posYChar = 'E';
		}
		if (posX == 5){
			posYChar = 'F';
		}
		if (posX == 6){
			posYChar = 'G';
		}
		if (posX == 7){
			posYChar = 'H';
		}*/
		//posY
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