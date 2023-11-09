
public class questionn3 {
	public static void reverse (int arr[],int k,int l) {
		int i=k,j=l;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,4,5,3};
		boolean check = true;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int l = i,r = j;
				reverse(arr,l,r);
				check = true;
				for(int k=1;k<arr.length;k++) {
					if(arr[k]<arr[k-1]) {
						check = false;
						break;
					}
				}
				
			}
			
		}
		if(check) {
			System.out.println("array is sorted");
			
		}
		else {
			System.out.println("array is not sorted");
		}

	}

}
