package InterfacesDemos;
abstract class GeomatricFigure
{
    abstract void Area();
}
class Square extends GeomatricFigure
{
    void Area()
    {
        int side=5;
        System.out.println("Area of Squae:"+(side*side));
    }
}
class ractangle extends GeomatricFigure
{
    void Area()
    {
        int l=3; int b=5;
        System.out.println("Arae of reactangle is :"+(l*b));
    }
}
class Circle extends GeomatricFigure
{
    void Area()
    {
        double r=2.5; double pi=3.143;
        System.out.println("area of a circle:"+(pi*r*r));
    }
}
public class PolymarphismDemo {
    public static void main(String[] args) {
        GeomatricFigure figure=null;
        Square square=new  Square();
        ractangle R=new  ractangle();
        Circle c=new Circle();
        figure=square;
        figure.Area();
        figure=R;
        figure.Area();
        figure=c;
        figure.Area();

    }
}
