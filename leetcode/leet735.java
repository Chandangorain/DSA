/*
leetcode 735 : 
input : [5,10,-5]
output : [5,10]
explanation : The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.
*/



import java.util.*;
class Solution{
public static int[]asteroidscollision(int[]asteroids) {
	ArrayList<Integer>list=new ArrayList<>();
	
	for(int i=0;i<asteroids.length;i++){
		list.add(asteroids[i]);
		
		}
	Boolean changed =true;
    while(changed){
	changed=false;
	for(int i=0;i<list.size()-1;i++){
		int first=list.get(i);
		int second=list.get(i+1);
		if(first>0 && second<0){        // condition for collision . if both are same sign then they will never collide and dont come to this loop and just push 
			if(Math.abs(first)<Math.abs(second)){
			    list.remove(i);
			    changed=true;
			    break;
			}
			else if(Math.abs(first)>Math.abs(second)){  // 10,-5 10 is greater than 5 so -5 will be removed and 10 will be there in
			   list.remove(i+1);        // -5 will be removed
			   changed=true;
			    break;
			}
			else{
			   list.remove(i);
			   list.remove(i+1);
			   changed=true;
			    break;
			}
		}

	}
	
  }

int []result=new int[list.size()];
for(int i=0;i<list.size();i++){
result[i]=list.get(i);
}
return result;
 }

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]nums=new int[n];
for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
}
int[] answer=asteroidscollision(nums);
for(int i = 0; i < answer.length; i++){
        System.out.print(answer[i] + " ");
    }
}

}