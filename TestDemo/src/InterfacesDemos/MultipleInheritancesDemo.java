package InterfacesDemos;
// 6
interface  University
{
    abstract void showUniversityname(String name);
}
interface colleges
{
    void showcousrse(String courses[]);
}
class Demossa implements University, colleges
{
    public void showUniversityname(String name)
    {
        System.out.println("University name is:"+name);
    }
    public void showcousrse(String courses[])
    {
        for(int i=0; i<courses.length; i++)
        {
            System.out.println("course name:"+courses[i]);
        }
    }
    public  void ShowAddress(String address)
    {
        System.out.println("Address of college :"+address);
    }
}
class Aaaa extends Demossa
{
    public  void Showcollgrs(String cname)
    {
        System.out.println("Address of college :"+cname);
    }
}
public class MultipleInheritancesDemo {
    public static void main(String[] args) {
        Aaaa o=new Aaaa();
        o.Showcollgrs("gfgc clg bidar");
        o.ShowAddress("9th main viajaynagar");
        o.showcousrse(new String[] {"mac","bca","mcom","ect.."});
        o.showUniversityname("akkamahadevi university");

    }
}
