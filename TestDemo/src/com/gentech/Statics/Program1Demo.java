package com.gentech.Statics;
//Arrays Asssign
class Dem1
{
    static byte s[][] = {{1, 2, 3}, {3, 2, 1}, {2, 3, 2}};
    static byte arr[][] = new byte[s.length][s[0].length];
    static  void Prog1() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                arr[i][j] = s[i][j];
            }
        }

        System.out.print("Arrays of first row: ");
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();
    }

}
public class Program1Demo {
    public static void main(String[] args) {
        Dem1.Prog1();


    }
}
