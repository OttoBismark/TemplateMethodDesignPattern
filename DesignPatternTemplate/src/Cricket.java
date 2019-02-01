import java.awt.Dimension;

import javax.swing.JFrame;

public class Cricket extends Game
{
	private final static int w = 650;
	private final static int h = 500;
	
	@Override
	public void initialize(int level) {
		System.out.println("Cricked game initilialized");
		if(level == 1)
		{
			System.out.println(level);
		}
		if(level == 2)
		{
			System.out.println(level);
		}
		if(level == 2)
		{
			System.out.println(level);
		}
	}

	public void startPlay() {
		System.out.println("Cricked game started");
		
	}

	@Override
	public void endPlay() {
		System.out.println("Cricked game ended");
		
	}

	@Override
	public void menu()
	{
		JFrame frame = new JFrame("Finestra Template");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(w, h));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
	}

	@Override
	public void initialize() {}
}
