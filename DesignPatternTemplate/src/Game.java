
public abstract class Game
{
	abstract public void initialize();
	abstract public void menu();
	abstract public void startPlay();
	abstract public void endPlay();
	
	public final void play()
	{
		this.menu();
		
		this.startPlay();
		
		this.endPlay();
	}
	public void initialize(int level) {}
}
