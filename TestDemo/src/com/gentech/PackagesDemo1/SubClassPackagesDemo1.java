package com.gentech.PackagesDemo1;
import com.gentech.PackagesDemo.Protection;
public class SubClassPackagesDemo1 extends  Protection {
    public SubClassPackagesDemo1()
    {
        System.out.println(" In is SubClassPackages class constructor");
        //System.out.println("private_a:"+private_a);
       // System.out.println("default_b:"+default_b);
        System.out.println("protected_c:"+protected_c);
        System.out.println("public_d:"+public_d);
    }
}
