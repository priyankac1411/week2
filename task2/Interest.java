package task1;
/*program to calculate simple interest and compound interest*/

public class Interest {
   double simpleInterest(double p,double t,double r)
   {
	   double s = (p * t * r)/100;
	   return s;
   }
   double compoundInterest(double p,double t,double r)
   {
	   double c=p*Math.pow(1.0+r/100.0, t)-p;
	   return c;
   }
}
