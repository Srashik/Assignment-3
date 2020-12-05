import java.awt.Color;
import java.util.Random;



public class ColoredBall{
	int xpos;
	int ypos;
	Color color;
	Random rand;
	int num;



	public ColoredBall(int xpos, int ypos){

		this.xpos = xpos;
		this.ypos = ypos;
		this.color = color;
		this.num = num;
		rand = new Random();
		num = rand.nextInt(2);

		if (num == 1) 

		{
			
			this.color = Color.GREEN;
			
		}
		else
			this.color = Color.PINK;

		

	}
}