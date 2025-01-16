package com.gentech.AbstractclassDemo;
// instancs bolck
abstract  class DemoPrimenumber
{

    {
        int x=10;
        int y=20;
        System.out.println("Additon result:"+(x+y));
    }
    void CountDemo() {
        int a = 100;
        int b = 200;
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            int check = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    check++;
                }
            }
            if (check == 2) {
                count = count + 1;
            }
        }
        System.out.println("The count of prime number is:" + count);
    }

}
class Demos extends DemoPrimenumber
{

    void Substraction(int a, int b)
    {
        System.out.println("Substraction result:"+(a-b));
    }
}
public class AbstractDemoInstances {
    public static void main(String[] args) {
        Demos o=new  Demos();
        o.Substraction(20,10);
        o.CountDemo();

    }
}
