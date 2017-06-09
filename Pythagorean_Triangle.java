import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pythagorean_Triangle {

    static BigInteger[] pythagoreanTriple(BigInteger a){
        BigInteger[] triple=new BigInteger[3];
        BigInteger x=new BigInteger("2");        
        triple[0]=a;
        if(a.mod(x)!=BigInteger.ZERO) 
        {
        	triple[1]=((a.multiply(a)).subtract(BigInteger.ONE)).divide(x);//(Math.pow(a,2)-1)/2;
            triple[2]=triple[1].add(BigInteger.ONE);
        }
        else
        {
        	triple[1]=(a.divide(x).multiply(a.divide(x))).subtract(BigInteger.ONE);
        	triple[2]=triple[1].add(x);
        }
        
        return triple;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        a= in.nextBigInteger();
        BigInteger[] triple = pythagoreanTriple(a);
        for (int i = 0; i < triple.length; i++) {
            System.out.print(triple[i] + (i != triple.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
