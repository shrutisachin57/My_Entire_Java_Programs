package MathClass;

public class AreaofCircleUsingMathRandom {

	public static void main(String[] args) {
		double pi=Math.PI;
		double area;
		for(int i=0;i<10;i++)
		{
			double radius=Math.random();
			System.out.println("Radius of the circle is"+ " "+ radius);
			area=pi*radius*radius;
			
			System.out.println("Area of the circle is"+ " "+ area);
		}
	}

}
