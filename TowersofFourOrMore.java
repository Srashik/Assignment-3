import java.awt.Color;
import java.util.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;


public class TowersofFourOrMore extends JPanel implements ActionListener{

	Timer tm = new Timer(5,this);
	int numberofTubes;
	int numberOfBallsPerTube;
	int numberOfFilledTubes;

	


	public TowersofFourOrMore(int numberofTubes, int numberOfBallsPerTube, int numberOfFilledTubes){

		this.numberofTubes = numberofTubes;
		this.numberOfBallsPerTube = numberOfBallsPerTube;
		this.numberOfFilledTubes = numberOfFilledTubes;
		
		

		
		


	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		//Random rand = new Random();

	
		//int coloredBalls = rand.nextInt(2);
		ColoredBall [] balls = new ColoredBall[numberOfBallsPerTube];
	//	System.out.println(coloredBalls);
		int xCoordinateForTube = 30;
		int placementForBalls =0;
		int onToTheNextTube = 35;		
		int y = 0;
		//Color color = Color.PINK;

		


		while(y < numberofTubes){

			g.drawRect(xCoordinateForTube,100,30,100);
			xCoordinateForTube+=50;
			//System.out.println(this.numberOfBallsPerTube);
			placementForBalls = 180;
			y++;
	

	}


	for (int x = 0;x < numberOfFilledTubes;x++) 

	{
		
		placementForBalls=180;


		int a = 0;
		
		/*while(a != numberOfBallsPerTube){


			


			

			g.setColor(Color.GREEN);
			g.drawOval(onToTheNextTube,placementForBalls,20,20);
			g.setColor(color);
			g.fillOval(onToTheNextTube,placementForBalls,20,20);
			placementForBalls-=20;
			a++;


		}*/

		for (int i = 0;i < numberOfBallsPerTube;i++) 
		{
			balls[0] = new ColoredBall(onToTheNextTube, placementForBalls);
			//Color c = ball.color;
			g.setColor(balls[0].color);
			g.drawOval(onToTheNextTube,placementForBalls,20,20);
			g.fillOval(onToTheNextTube,placementForBalls,20,20);
			placementForBalls-=20;
			
		}

		onToTheNextTube+=50;

}

			
		
		tm.start();
	}

	public void actionPerformed(ActionEvent e){

		repaint();

	}

	public static void main(String[] args) {



		JFrame frame = new JFrame();
		
		TowersofFourOrMore tower = new TowersofFourOrMore(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		if (tower.numberOfBallsPerTube > 8) 
		{
			System.out.println("Too many balls per tube! Enter a number less than eight please!");
			
		}
		if (tower.numberofTubes < 3) 
		{
			System.out.println("You have to have at least three tubes!");
			
		}
		if (tower.numberOfFilledTubes != 2) 
		{
			System.out.println("You can only have two filled tubes!");
			
		}
		



		frame.setTitle("Tutorial");
		frame.setSize(768,768);
		frame.add(tower);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		



	}



}