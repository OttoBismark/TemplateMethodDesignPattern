public class TemplatePatternDemo
{
	public static void main(String[] args)
	{
		Game game = new Cricket();
		game.play();
		game.initialize(1);
	}
}