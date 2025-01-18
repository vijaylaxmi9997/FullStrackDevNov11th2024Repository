package com.gentech.Inheritances;
//  multilevel inheritaces constructor overloading 3
class Capitalcity
{
    Capitalcity(String cityname,int citynumbers)
    {
        System.out.println("the capital city name is:"+cityname);
        System.out.println(" the total numbers of city is:"+citynumbers);
    }
    Capitalcity(String dist, String villege)
    {
        System.out.println("the Dist name:"+dist);
        System.out.println("the village name :"+villege);
    }

}
class Metrocites extends Capitalcity
{
    int citynumbers;
    String biggestcity;
    Metrocites(String name, int numbers,int cno)
    {
        super(name,numbers);
        citynumbers=cno;
        System.out.println("numbers of cities names:"+citynumbers);

    }
    Metrocites(String dists, String villeges,String bigcity)
    {
        super(dists,villeges);
        biggestcity=bigcity;
        System.out.println("Biggest city name is:"+bigcity);
    }

}
class States extends  Metrocites
{
    String Statesname;
    States(String name, int numbers,int cno,String Sname)
    {
        super(name,numbers,cno);
        Statesname=Sname;
        System.out.println("State numbers is:"+Sname);
    }
    States(String dists, String villeges,String bigcity )
    {
        super(dists,villeges,bigcity);
    }
}
public class MultilevelConstructor {
    public static void main(String[] args) {
        States obj=new States("mysur",45,29,"kolar");
        States o1=new States("biadr","jalasangi","bengalur");


    }
}
