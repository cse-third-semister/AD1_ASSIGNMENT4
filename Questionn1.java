
public class Questionn1 {
	public static int [] sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		return arr;
	}
	public static void reduction(int arr[]) {
		int s = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				s = arr[i];
				break;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] - s;
		}
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>0) {
				System.out.print(arr[k] +" ");
			}
		}
	}
	


	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,3,4};
		
		arr = sort(arr);
		
		
		int c = 0;
		while(arr[arr.length-1]>0) {
			reduction(arr);
			++c;
			System.out.println();
		}
		System.out.println("Total number of  reduction is "+ c);
		

	}

}




