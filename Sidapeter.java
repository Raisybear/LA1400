package E.Spycher;
import robocode.*;

public class Sidapeter extends JuniorRobot
{

	public void run() 
	{

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		while(true) 
		{
			turnGunRight(5);
			ahead(25);
		}
	}
	
	public void onScannedRobot() 
	{
		int myscannedDistance = scannedDistance;
		out.println(scannedVelocity);
		out.println(scannedAngle);
		int angle = scannedAngle + scannedVelocity;
		//Calculation of angle to scanned robot
	}

	public void turnTo(int angle)
	{
		ahead(150);
		
		if(hitRobotAngle > 0)
		{
			fire(3);
			//Shoot if robot is been hit
		}
	}	
			
	public void onHitWall() 
	{
		back(40);
	}	
}
