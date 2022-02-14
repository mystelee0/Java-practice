class Point{
	int x;
	int y;

	Point(){ this(0,0); }
	Point(int x , int y){ this.x=x; this.y=y; }
	
	public String toString(){ return "[ "+x+" , "+y+" ]";}
}
abstract class Shape{
	Point p;
	
	Shape(){this(new Point(0,0));}

	Shape(Point p){this.p=p;}
	
	abstract double calcArea();

	Point getPosition(){return p;}
	void setPosition(Point p){this.p=p;}
}
class Circle extends Shape{
	double r;
	Circle(){ super(); r=1;}
	Circle( Point p,double r){ super.p=p; this.r=r; }
	Circle(int x,int y,double r){ this(new Point(x,y),r); }
	double calcArea(){return r*r*3.14;}
}
public class Exercise7_22{
	public static void main(String[] args){
		Circle c1=new Circle();
		Circle c2=new Circle(new Point(2,3),3);
		Circle c3=new Circle(5,5,2);
		System.out.println(c1.getPosition() +" r= "+ c1.r +" 넓이 : " +c1.calcArea());
		System.out.println(c2.getPosition() +" r= "+ c2.r +" 넓이 : " +c2.calcArea());	
		System.out.println(c3.getPosition() +" r= "+ c3.r +" 넓이 : " +c3.calcArea());	
	}
}