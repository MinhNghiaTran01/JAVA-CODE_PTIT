import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

class Point
{
	double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    static Point nextPoint(Scanner sc)
    {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point p = new Point(x,y);
        return p;
    }
}
class Triangle
{
    Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean valid()
    {
    	double kc_ab = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
    	double kc_ac = Math.sqrt((a.x-c.x)*(a.x-c.x) + (a.y-c.y)*(a.y-c.y));
    	double kc_bc = Math.sqrt((c.x-b.x)*(c.x-b.x) + (c.y-b.y)*(c.y-b.y));
    	if((kc_ab+kc_ac<=kc_bc)||(kc_ab+kc_bc<=kc_ac)||(kc_ac+kc_bc<=kc_ab)) return false;
    	return true;
    }
    String getPerimeter()
    {
    	double kc_ab = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
    	double kc_ac = Math.sqrt((a.x-c.x)*(a.x-c.x) + (a.y-c.y)*(a.y-c.y));
    	double kc_bc = Math.sqrt((c.x-b.x)*(c.x-b.x) + (c.y-b.y)*(c.y-b.y));
    	DecimalFormat f = new DecimalFormat("#.000");
    	kc_ab +=kc_ac + kc_bc;
    	return f.format(kc_ab);
    }
}
public class J04019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
	
}
