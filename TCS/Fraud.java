/*
Problem Statement

You are given N transaction records.
Each transaction contains:

Sender Name
Receiver Name
Amount
Transaction Type / ID
Timestamp

A transaction is considered fraudulent if:

Sender is the same
Receiver is the same
Amount is the same
Transaction Type / ID is the same
Difference between timestamps is less than or equal to 60 seconds

Your task is to identify and print all fraudulent transaction pairs.
input:
5
ANUJ JOHN 200 50 1000
ANUJ JOHN 200 50 1050
RAHUL AMIT 300 40 2000
ANUJ JOHN 200 50 1200
RAHUL AMIT 300 40 2055

output :[ANUJ, JOHN, 200, 50, 1000]
[ANUJ, JOHN, 200, 50, 1050]
[RAHUL, AMIT, 300, 40, 2000]
[RAHUL, AMIT, 300, 40, 2055]

*/

import java.util.*;

public class Fraud {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    String[][] t=new String[n][5];
    for(int i=0;i<n;i++){
        for(int j=0;j<5;j++){
            t[i][j]=sc.next();
        }
    }
    for(int i=0;i<t.length;i++){
        for(int j=i+1;j<t.length;j++){
            if(t[i][0].equals(t[j][0])){
                if(t[i][1].equals(t[j][1])){
                    if(t[i][2].equals(t[j][2])){
                        int time1=Integer.parseInt(t[i][4]);
                        int time2=Integer.parseInt(t[j][4]);
                        int diff=Math.abs(time1-time2);
                        if(diff<=60){
                            System.out.println("fraud");
                            System.out.println(Arrays.toString(t[i]));
                            System.out.println(Arrays.toString(t[j]));
                        }
                    }
                    
                }
            }
        }
    }
}
    
}
