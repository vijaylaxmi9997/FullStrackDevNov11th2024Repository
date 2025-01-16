package com.gentach.ConstructorOverloading;
class  Insurance {
    Insurance(String custustomername, int InsuranceNumber, String startDate) {
        System.out.println("Insurancenumber:" + InsuranceNumber + "startDate:" + startDate + "CustomerName:" + custustomername);
    }
    Insurance(String enddate)
    {
        System.out.println("Enddate:"+enddate);
    }

    Insurance(String loc, int policynumber)
    {
        System.out.println("InsuranceLocation:"+loc+  "policynumber:"+policynumber);
    }
}
public class InsuranceDemo {
    public static void main(String[] args) {
        Insurance I1=new Insurance("ashu",345267,"12/03/2009");
        Insurance I2=new Insurance("12/09/2019");
        Insurance I3=new Insurance("mysur", 123456);
    }
}
