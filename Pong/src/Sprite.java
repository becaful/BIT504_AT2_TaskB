import java.awt.Color;

public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;

	//Getters for Sprite variables
	public int getxPosition() {
		return xPosition;
	}
	
	public int getyPoisition() {
		return yPosition;
	}
	
	public int getxVelocity( ) {
		return xVelocity;
	}
	
	public int getyVelocity( ) {
		return yVelocity;
	}
	
	public int getWidth( ) {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	//Setters for Sprite variables
	public void setxVelocity(int newxVelocity) {
		this.xVelocity = newxVelocity;
	}
	
	public void setyVelocity(int newyVelocity) {
		this.yVelocity = newyVelocity;
	}
	
	public void setxPosition(int newxPosition) {
		this.xPosition = newxPosition;
	}
	
	public void setyPosition(int newyPosition) {
		this.yPosition = newyPosition;
	}
	
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	 public Color getColour() {
         return colour;
     }
	 
	 public void setColour(Color colour) {
         this.colour = colour;
     }
}
