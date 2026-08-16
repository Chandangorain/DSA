/*
Alex has N hours available for reading. He has a collection of books, where each book requires a certain number of hours to read.

An integer array A representing the reading time required for each book.
An integer N representing the total number of hours available.
An integer size representing the number of books.

Your task is to find the maximum number of books Alex can read without exceeding N hours.

Input
A = {4, 2, 3, 1}   time taken to read
N = 5        alloted hours
size = 4
output =2
*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Cognizant {

    public static int maxbooks(int[]arr,int allotedhours,int n){
        int total=0;
        int count=0;
        for(int i=0;i<n;i++){
             Arrays.sort(arr);
             if((total+arr[i])<=n){
                total+=arr[i];
                count++;
             }else{
                break;
             }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A = {4, 2, 3, 1};
        int N = 5;
        int size = 4;

        System.out.println(maxbooks(A, N, size));
        

    }
    
}
