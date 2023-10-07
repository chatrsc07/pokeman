package pokeman;
import pokeman.BotFactory;
import java.util.Scanner;
import pokeman.GuiStart;

public class game_driver {

	
	public static void main(String[] args) {
		GuiStart gui = new GuiStart();
		BotFactory bots = new BotFactory();
		System.out.println(bots.getOpponent1());
	}

}
