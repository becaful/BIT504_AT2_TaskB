import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private final static int SCREEN_WIDTH = 800;
	private final static int SCREEN_HEIGHT = 600;
	private final static String TITLE = "Pong";
	
	public Pong() {
		setTitle(TITLE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Pong();

	}

}
