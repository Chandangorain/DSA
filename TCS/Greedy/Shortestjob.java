/*
Input: bt[] = [4,3,7,1,2]
Output: 4
Sort
↓
[1,2,3,4,7]
waitingTime = 0
totalWaitingTime = 0
Job 1 → wait 0
Job 2 → wait 1
Job 3 → wait 3
Job 4 → wait 6
Job 7 → wait 10

Total = 20
Average = 20 / 5
       = 4
*/
package Greedy;
import java.util.Arrays;
public class Shortestjob {
   
    public static int solve(int bt[]) {

        // Number of processes
        int n = bt.length;

        // Sort jobs from shortest to longest
        Arrays.sort(bt);

        // Store total waiting time
        int Ttime = 0;

        // Store current waiting time
        int Wtime = 0;

        // Go through every job
        for(int i = 0; i < n; i++) {

            // Add current waiting time to total waiting time
            Ttime = Ttime + Wtime;

            // Add current job time to waiting time for next job
            Wtime = Wtime + bt[i];
        }

        // Calculate average waiting time
        int avg = Ttime / n;

        // Return average waiting time
        return avg;
    }
}
    

