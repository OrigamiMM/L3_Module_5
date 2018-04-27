package other;

import java.util.Random;

public class ThreadedNumberSorter {
	static final int TOTAL_NUMS = 10;
	static int[] nums = new int[TOTAL_NUMS];
	static int [] array1 = new int[TOTAL_NUMS/2];
	static int[] array2 = new int[TOTAL_NUMS/2];
	
	//Complete the method below so that it uses threads to sort the integer array.
	//Try to get the completion time as short as possible.
	//Use the printArray method to check sorting accuracy
	public static void parallelSort() {
		long startTime = System.nanoTime();
		//Complete this method starting at this point
		splitArray();
		Thread thread1 = new Thread(()->array1 = sortNums(array1));
	 	Thread thread2 = new Thread(()->array2 = sortNums(array2));
		
	 	thread1.start();
	 	thread2.start();
	 	
	 	try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	merge();
	 	System.out.println("");
		long totalTime = System.nanoTime() - startTime;
		double timeInSeconds = (double)totalTime / 1_000_000_000;
		System.out.println("The total computing time in seconds was: " + timeInSeconds);
	}

	public static void main(String[] args) {
		

		Random randGen = new Random();
		for (int i = 0; i < TOTAL_NUMS; i++) {
			nums[i] = randGen.nextInt(TOTAL_NUMS);
		}

//		printArray();
		parallelSort();
		printArray();
	}
	
	private static void printArray(){
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
		for(int i = 0; i < array2.length; i++){
			System.out.println(array2[i]);
		}
	}
	private static void splitArray() {
		for (int i = 0; i < nums.length/2; i++) {
			array1[i] = nums[i];
		}
		int j = 0;
		for (int i = nums.length/2; i < nums.length; i++) {
			array2[j] = nums[i];
			j++;
		}
	}
	private static int[] sortNums(int[] numbers) {
		int placeholder;
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i; j < numbers.length; j++){
				if (numbers[j]<numbers[i]) {
					placeholder = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = placeholder;
				}
			}
		}
		return numbers;
	}
	private static void merge() {
		int p1 = 0;
		int p2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (array1[p1]>array2[p2]) {
				nums[i]=array2[p2];
				p2++;
			}else {
				nums[i] = array1[p1];
				p1++;
			}
			if (p1==array1.length) {
				while (p2<array2.length) {
					nums[i] = array2[p2];
					p2++;
					i++;
				
				}
			}
			if (p2==array2.length) {
				while (p1<array1.length) {
					nums[i] = array1[p1];
					p1++;
					i++;
				
				}
			}
		}
	}
}
