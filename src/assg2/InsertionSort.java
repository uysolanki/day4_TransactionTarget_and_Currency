package assg2;

public class InsertionSort {

	public void sort(int[] arr) {
		int temp,j;
		for(int k=1;k<arr.length;k++)
		{
			temp=arr[k];
			j=k-1;
				while(j>=0 && temp>=arr[j])
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=temp;
		}
		
	}

}
