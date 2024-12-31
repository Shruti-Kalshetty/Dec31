 
public class Test4 {
 
	public static void main(String[] args) {

		int[]arr= {10,20,8,6,5,4};

		int max=arr[0];//20

		for(int i=0;i<arr.length;i++) {

			if(arr[i]>max) {

				max=arr[i];

			}

		}

		System.out.println("largest element:"+max);

		int min=arr[0];//4

		for(int i=0;i<arr.length;i++) {

			if(arr[i]<min) {

				min=arr[i];

			}

		}

		System.out.println("minimum element:"+min);

	}
 
}

 