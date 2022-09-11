import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour = Color.WHITE;
	private int initialXPosition, initialYPosition;

	//Getters for Sprite variables
	public int getxPosition() {
		return xPosition;
	}
	
	public int getyPosition() {
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
	
	 public void setXPosition(int newX, int panelWidth) {
	     xPosition = newX;
	     if(xPosition < 0) {
	    	 xPosition = 0;
	     }
	     else if(xPosition + width > panelWidth) {
	    	 xPosition = panelWidth - width;
	     }
	 }
	 public void setYPosition(int newY, int panelHeight) {
		 yPosition = newY;
	      if(yPosition < 0) {
	          yPosition = 0;
	      } else if(yPosition + height > panelHeight) {
	          yPosition = panelHeight - height;
	      }
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
	 
	 public void setInitialPosition(int initialX, int initialY) {
		 initialXPosition = initialX;
		 initialYPosition = initialY;
	 }
	 
	 public void resetToInitialPosition() {
		 setxPosition(initialXPosition);
		 setyPosition(initialYPosition);
	 }
	 
	 public Rectangle getRectangle() {
         return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
     }
}
