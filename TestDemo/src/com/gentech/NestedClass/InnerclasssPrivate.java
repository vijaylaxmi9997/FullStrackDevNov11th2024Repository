package com.gentech.NestedClass;
class OuterClass
{
    String AccountHoldername;
    int Amount;
    InnerClassD inner = new InnerClassD();
    void Demos()
    {
        inner.BankName="SBI";
        inner.accountnumber=4577788;
        System.out.println("Bank name:"+ inner.BankName);
        System.out.println("Account Numbers:"+ inner.accountnumber);
    }

     class InnerClassD
    {
        private String BankName;
        private int accountnumber;

        public int getAccountnumber() {
            return accountnumber;
        }

        public void setAccountnumber(int accountnumber) {
            this.accountnumber = accountnumber;
        }

        public String getBankName() {
            return BankName;
        }

        public void setBankName(String bankName) {
            BankName = bankName;
        }

    }
}
public class InnerclasssPrivate {
    public static void main(String[] args) {
        OuterClass o1=new OuterClass();
        o1.AccountHoldername="Vijaylaxmi";
        o1.Amount=560000;
        o1.Demos();
        System.out.println("Account Holder name:"+o1.AccountHoldername);
        System.out.println("Amount :"+o1.Amount);


    }

}
