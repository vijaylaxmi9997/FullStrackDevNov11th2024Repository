package InterfacesDemos;
//9 abstact class
interface Universitys
{
    abstract void showUniversityname(String name);
    abstract  void ShowCollegesstartdate(String date);

}
class RgmCollege implements   Universitys
{
    public void showUniversityname(String name)
    {
        System.out.println("University name is :"+name);
    }
    public void ShowCollegesstartdate(String date)
    {
        System.out.println("Strart date:"+date);
    }
    public void ShowAdrress(String address)
    {
        System.out.println("Adress :"+address);
    }

}
class Collegesname extends RgmCollege
{
    public void Showsthecollegename(String College)
    {
        System.out.println("college names:"+College);
    }
}
public class MultilevelInterface {
    public static void main(String[] args) {
        Collegesname o=new Collegesname();
        o.Showsthecollegename("Kps college ");
        o.ShowAdrress("9 th main vijaynagar");
        o.showUniversityname("Rani chanamma university");
        o.ShowCollegesstartdate("10/09/2002");
    }
}
