//can place flowers
/*
lc 605
LeetCode 605 — Can Place Flowers

Given an array `flowerbed` (`0` = empty, `1` = flower planted) and an integer `n`, determine whether you can plant `n`
 new flowers without planting flowers in adjacent positions.
 Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


*/
/**
 * Flowers
 */
public class Flowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean leftempty=(i==0 || flowerbed[i-1]==0);
                boolean rightempty=(i==flowerbed.length-1 || flowerbed[i+1]==0);

                if(leftempty && rightempty){
                    flowerbed[i]=1;
                    n--;
                }
            }
            if(n<=0){
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can place " + n1 + " flowers: " + canPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Can place " + n2 + " flowers: " + canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}