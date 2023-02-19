package interviewQuestions;

public class FindLargestSmallestAndAverage {
	
	
	// max,  min,  sum,  avg,   second largest
	
	
	public static int findLargestValue(int [] nums) {
		

		int largest = nums[0];
		for(int i = 0; i < nums.length; i ++) {
			if (largest < nums[i]) {
				largest = nums [i];
			}
		}
		
		
		
		return  largest;
	}
	
	public static int findSmallestValue(int [] nums) {
		int smallest = nums[0];
		for (int i = 0; i <nums.length; i ++) {
		if(nums[i] < smallest) {
			smallest = nums[i];
		}
		}
		return smallest;
	}
	
	public static int findSumValue(int [] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	
	public static double findAverage(int [] nums) {
		double avg = 0;
		double sum =0;
		for (int i = 0; i < nums.length; i++) {
			avg = ((sum += nums[i]) / (nums.length));
		}
		
		
		return avg;
	}
	

	public static int findSecondLargestValue(int [] nums) {
		

		int secondLargest = nums[0];
		int largest = findLargestValue(nums);
		for(int i = 0; i < nums.length; i ++) {
			if (nums[i] > secondLargest && nums[i] < largest ) {
				secondLargest = nums[i];
			}
		}
		
		
		
		return  secondLargest;
	}
	
	
public static int findSecondSmallestValue(int [] nums) {
		

		int secondSmallest = nums[0];
		int smallest = findSmallestValue(nums);
		for(int i = 0; i < nums.length; i ++) {
			if (nums[i] < secondSmallest && nums[i] > smallest ) {
				secondSmallest = nums[i];
			}
		}
		
		
		
		return  secondSmallest;
	}
	
	
	public static void main (String [] args) {
		
		int [] nums = { 10,121,321,3,11,5,12,15,1,21,5,21,113,5,111,20,1};

		System.out.println("Largest: " +findLargestValue(nums));
		System.out.println("Smallest: " + findSmallestValue(nums));
		System.out.println("Sum of Array is: " + findSumValue(nums));
		System.out.println("Average of Array is: " + findAverage(nums));
		
		
		System.out.println("second largest: " + findSecondLargestValue(nums));
		System.out.println("Second Smallest: " + findSecondSmallestValue(nums));
	}
	
	

}
