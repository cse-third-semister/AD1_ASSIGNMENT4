import java.util.Arrays;

public class Questionn2 {

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr1[] = {1,5,9,10,15,20};
		int arr2[] = {2,3,8,13};
		int k = arr1.length-1;
		for(int i=0,j=0;i<k && j<arr2.length;) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				int temp  = arr2[j];
				arr2[j] = arr1[k];
				arr1[k] = temp;
				k--;
				j++;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int h:arr1) {
			System.out.print(h + " ");
		}
		System.out.println();
		for(int h:arr2) {
			System.out.print(h + " ");
		}
	}

}
