import java.util.Scanner;


public class reaptingfirstelement {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enetr the elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
			}
		for(int j=0;j<arr.length-1;j++){
			if(arr[j]==arr[j+1]){
				System.out.println("first repeat="+arr[j]);
				break;
			}
		}
		}
	}


