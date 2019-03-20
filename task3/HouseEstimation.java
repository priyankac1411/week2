package task1;

public class HouseEstimation {
/*estimate house construction cost based on material standard,area and automation*/
	public int estimate(String s,int area,String a)
	{
		int c =0;
		if(s.equals("standard"))
		{
			c=1200*area;
		}
		else if(s.equals("abovestandard"))
		{
			c=1500*area;
		}
		else if(s.equals("highstandard"))
		{
			c=1800*area;
		}
		else if(s.equals("highstandard")&& a.equals("automation"))
		{
			c=2500*area;
		}
		return c ;
	}
}
