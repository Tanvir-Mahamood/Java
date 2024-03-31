package module6f;

import java.util.Scanner;


public class Topic5 {
    public static void main(String[] args) {
        String str1,str2,s1,s2,s3;
        int index,i,c;
        char ch;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first string:");
        str1=in.nextLine();
        System.out.println("Enter second string:");
        str2=in.nextLine();
        
        System.out.println("Enter an index for searching");
        index=in.nextInt();
        System.out.println("Character at "+index+" = "+str1.charAt(index)); //task1
        
        if(str1.compareTo(str2)==0) System.out.println("Strings are same."); //task2
        else System.out.println("Strings are not same.");
        
        System.out.println("Strings are equal on not?: "+str1.equals(str2)); //task4
        
        System.out.println("str1+str2="+str1.concat(str2)); //task3
        
        System.out.println("String2 is empty?: "+str2.isEmpty()); //task5
        
        System.out.println("String length of string1: "+str1.length()); //task6
        
        System.out.println("Enter a string"); //task7
        s1=in.nextLine();
        System.out.println("Substring should be changed: ");
        s2=in.nextLine();
        System.out.println("New substring for replacement: ");
        s3=in.nextLine();
        
        String newstring=str1.replaceAll(s2, s3);
        System.out.println(newstring);
        
        System.out.println("Substrings are:"); //task8
        for(c=0;c<str1.length();c++)
        {
            for(i=c+1;i<=str1.length();i++)
            {
                System.out.println(str1.substring(c,i));
            }
        }
        
        System.out.println("Lower case:"+str1.toLowerCase());
        System.out.println("Lower case:"+str1.toUpperCase());
        
        
    }
}
