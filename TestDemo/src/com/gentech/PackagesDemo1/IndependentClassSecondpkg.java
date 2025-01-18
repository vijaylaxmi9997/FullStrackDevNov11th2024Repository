package com.gentech.PackagesDemo1;

import com.gentech.PackagesDemo.Protection;

public class IndependentClassSecondpkg {
    Protection o=new Protection();
    public IndependentClassSecondpkg()
    {
        System.out.println(" In is SubClassPackages class constructor");
        // System.out.println("private_a:" + o.private_a);
        //System.out.println("default_b:" +o.default_b);
        //System.out.println("protected_c:" +o.protected_c);
        System.out.println("public_d:" +o.public_d);
    }
}
