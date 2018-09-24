package board;

public class ChessBoard{
	// Object attributes
	
	private String typeName;
	private String newColor;
	private int posX;
	private int posY;
	private char posYChar;
	
	// Object Methods
	public void ChessBoard(String c, String p, int a, int b){
		setColor(c);
		setPieceType(p);
		setPosition(a,b);		
	}
	
	public String getPosition(){
		
		return "Piece position: " + posX + "," + posYChar;
		
	}
	public void setPosition(int x, int y){
		posX = x;
		posY = y;
		
		if (posY == 1){
			posYChar = 'A';
		}
		if (posY == 2){
			posYChar = 'B';
		}
		if (posY == 3){
			posYChar = 'C';
		}
		if (posY == 4){
			posYChar = 'D';
		}
		if (posY == 5){
			posYChar = 'E';
		}
		if (posY == 6){
			posYChar = 'F';
		}
		if (posY == 7){
			posYChar = 'G';
		}
		if (posY == 8){
			posYChar = 'H';
		}
		
	}
	public String getColor(){
		return newColor;
	}
	public void setColor(String color){
		newColor = color;
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