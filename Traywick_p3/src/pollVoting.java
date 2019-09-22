import java.util.Scanner;

public class pollVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String topics[] = new String[5];
		int responses[][] = new int[5][10];
		int moreUser, foodRating, trafficRating, cellServiceRating, tempRating, waterRating;
		int totals[] = new int[5];
		int averages[] = new int[5];
		int highIssue, lowIssue, highIssueCounter, lowIssueCounter;
		
		
		Scanner in = new Scanner(System.in);
		
		moreUser = 1;
		highIssueCounter = 0;
		lowIssueCounter = 0;
		
		topics[0] = "Food Variety";
		topics[1] = "Traffic";
		topics[2] = "Cell Service";
		topics[3] = "Temperature";
		topics[4] = "Water Quality";
			
		
		
		while(moreUser != 0) {
			System.out.print("How would you rate the food variety in your city? (1 - 10)");
			foodRating = in.nextInt() - 1;
			if(foodRating == 0) {
				responses[0][0] += 1;
			}
			if(foodRating == 1) {
				responses[0][1] += 1;
			}
			if(foodRating == 2) {
				responses[0][2] += 1;
			}
			if(foodRating == 3) {
				responses[0][3] += 1;
			}
			if(foodRating == 4) {
				responses[0][4] += 1;
			}
			if(foodRating == 5) {
				responses[0][5] += 1;
			}
			if(foodRating == 6) {
				responses[0][6] += 1;
			}
			if(foodRating == 7) {
				responses[0][7] += 1;
			}
			if(foodRating == 8) {
				responses[0][8] += 1;
			}
			if(foodRating == 9) {
				responses[0][9] += 1;
			}
			
			System.out.print("How would you rate the amount of traffic in your city? (1 - 10)");
			trafficRating = in.nextInt() - 1;
			if(trafficRating == 0) {
				responses[1][0] += 1;
			}
			if(trafficRating == 1) {
				responses[1][1] += 1;
			}
			if(trafficRating == 2) {
				responses[1][2] += 1;
			}
			if(trafficRating == 3) {
				responses[1][3] += 1;
			}
			if(trafficRating == 4) {
				responses[1][4] += 1;
			}
			if(trafficRating == 5) {
				responses[1][5] += 1;
			}
			if(trafficRating == 6) {
				responses[1][6] += 1;
			}
			if(trafficRating == 7) {
				responses[1][7] += 1;
			}
			if(trafficRating == 8) {
				responses[1][8] += 1;
			}
			if(trafficRating == 9) {
				responses[1][9] += 1;
			}
			
			System.out.print("How would you rate the cell service in your city? (1 - 10)");
			cellServiceRating = in.nextInt() - 1;
			if(cellServiceRating == 0) {
				responses[2][0] += 1;
			}
			if(cellServiceRating == 1) {
				responses[2][1] += 1;
			}
			if(cellServiceRating == 2) {
				responses[2][2] += 1;
			}
			if(cellServiceRating == 3) {
				responses[2][3] += 1;
			}
			if(cellServiceRating == 4) {
				responses[2][4] += 1;
			}
			if(cellServiceRating == 5) {
				responses[2][5] += 1;
			}
			if(cellServiceRating == 6) {
				responses[2][6] += 1;
			}
			if(cellServiceRating == 7) {
				responses[2][7] += 1;
			}
			if(cellServiceRating == 8) {
				responses[2][8] += 1;
			}
			if(cellServiceRating == 9) {
				responses[2][9] += 1;
			}
			
			System.out.print("How would you rate the temperature in your city? (1 - 10)");
			tempRating = in.nextInt() - 1;
			if(tempRating == 0) {
				responses[3][0] += 1;
			}
			if(tempRating == 1) {
				responses[3][1] += 1;
			}
			if(tempRating == 2) {
				responses[3][2] += 1;
			}
			if(tempRating == 3) {
				responses[3][3] += 1;
			}
			if(tempRating == 4) {
				responses[3][4] += 1;
			}
			if(tempRating == 5) {
				responses[3][5] += 1;
			}
			if(tempRating == 6) {
				responses[3][6] += 1;
			}
			if(tempRating == 7) {
				responses[3][7] += 1;
			}
			if(tempRating == 8) {
				responses[3][8] += 1;
			}
			if(tempRating == 9) {
				responses[3][9] += 1;
			}
			
			System.out.print("How would you rate the water quality in your town? (1 - 10)");
			waterRating = in.nextInt() - 1;
			if(waterRating == 0) {
				responses[4][0] += 1;
			}
			if(waterRating == 1) {
				responses[4][1] += 1;
			}
			if(waterRating == 2) {
				responses[4][2] += 1;
			}
			if(waterRating == 3) {
				responses[4][3] += 1;
			}
			if(waterRating == 4) {
				responses[4][4] += 1;
			}
			if(waterRating == 5) {
				responses[4][5] += 1;
			}
			if(waterRating == 6) {
				responses[4][6] += 1;
			}
			if(waterRating == 7) {
				responses[4][7] += 1;
			}
			if(waterRating == 8) {
				responses[4][8] += 1;
			}
			if(waterRating == 9) {
				responses[4][9] += 1;
			}
			
			System.out.print("Would you like to input more responses? (1 - yes / 0 - no)");
			moreUser = in.nextInt();
		}
		
		
		
		
		
		totals[0] = (responses[0][0] * 1) + (responses[0][1] * 2) + (responses[0][2] * 3) + (responses[0][3] * 4) + (responses[0][4] * 5) + (responses[0][5] * 6) + (responses[0][6] * 7) + (responses[0][7] * 8) + (responses[0][8] * 9) + (responses[0][9] * 10);
		totals[1] = (responses[1][0] * 1) + (responses[1][1] * 2) + (responses[1][2] * 3) + (responses[1][3] * 4) + (responses[1][4] * 5) + (responses[1][5] * 6) + (responses[1][6] * 7) + (responses[1][7] * 8) + (responses[1][8] * 9) + (responses[1][9] * 10);
		totals[2] = (responses[2][0] * 1) + (responses[2][1] * 2) + (responses[2][2] * 3) + (responses[2][3] * 4) + (responses[2][4] * 5) + (responses[2][5] * 6) + (responses[2][6] * 7) + (responses[2][7] * 8) + (responses[2][8] * 9) + (responses[2][9] * 10);
		totals[3] = (responses[3][0] * 1) + (responses[3][1] * 2) + (responses[3][2] * 3) + (responses[3][3] * 4) + (responses[3][4] * 5) + (responses[3][5] * 6) + (responses[3][6] * 7) + (responses[3][7] * 8) + (responses[3][8] * 9) + (responses[3][9] * 10);
		totals[4] = (responses[4][0] * 1) + (responses[4][1] * 2) + (responses[4][2] * 3) + (responses[4][3] * 4) + (responses[4][4] * 5) + (responses[4][5] * 6) + (responses[4][6] * 7) + (responses[4][7] * 8) + (responses[4][8] * 9) + (responses[4][9] * 10);

		averages[0] = totals[0] / (responses[0][0] + responses[0][1] + responses[0][2] + responses[0][3] + responses[0][4] + responses[0][5] + responses[0][6] + responses[0][7] + responses[0][8] + responses[0][9]);
		averages[1] = totals[1] / (responses[1][0] + responses[1][1] + responses[1][2] + responses[1][3] + responses[1][4] + responses[1][5] + responses[1][6] + responses[1][7] + responses[1][8] + responses[1][9]);
		averages[2] = totals[2] / (responses[2][0] + responses[2][1] + responses[2][2] + responses[2][3] + responses[2][4] + responses[2][5] + responses[2][6] + responses[2][7] + responses[2][8] + responses[2][9]);
		averages[3] = totals[3] / (responses[3][0] + responses[3][1] + responses[3][2] + responses[3][3] + responses[3][4] + responses[3][5] + responses[3][6] + responses[3][7] + responses[3][8] + responses[3][9]);
		averages[4] = totals[4] / (responses[4][0] + responses[4][1] + responses[4][2] + responses[4][3] + responses[4][4] + responses[4][5] + responses[4][6] + responses[4][7] + responses[4][8] + responses[4][9]);
		

		
		
System.out.printf("%16s%3d%3d%3d%3d%3d%3d%3d%3d%3d%4d%8s\n", "        ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Average");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%-16s", topics[i]);
			for(int j = 0; j < 10; j++) {
				System.out.printf("%3s", responses[i][j]);
				
				
			}
			
			
			System.out.printf("%8d\n", averages[i]);
			
			
		}
		highIssue = totals[0];
		for(int x = 1; x < 5; x++) {
			if(totals[x] > highIssue){
				highIssue = totals[x];
				highIssueCounter++;
			}
			
		}
		lowIssue = totals[0];
		for(int y = 1; y < 5; y++) {
			if(totals[y] < lowIssue){
				lowIssue = totals[y];
				lowIssueCounter++;
			}
			
		}
		
		System.out.printf("The issue with the highest point total is %s (%d).\n", topics[highIssueCounter], highIssue);
		System.out.printf("The issue with the lowest point total is %s (%d).", topics[lowIssueCounter], lowIssue);
	}
		
	
	
}
