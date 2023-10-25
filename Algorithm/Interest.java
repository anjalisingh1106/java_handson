package Algorithm;
import java.util .*;
class Interest
{
    public static void main (String argu[ ])
{
    double pr, rate, t, sim,com;
    Scanner sc=new Scanner (System. in);
    pr=sc.nextDouble();
    t=sc.nextDouble();
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    System.out.println("Simple Interest="+sim);
    System.out. println("Compound Interest="+com);
   }
}

