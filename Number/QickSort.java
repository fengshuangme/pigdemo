package Number;
public class QickSort {
	public void quicksort(int []arr,int left, int right) {
		int partitionIndex;
		if(left < right) {
			partitionIndex = partition(arr, left, right);
			quicksort(arr, left, partitionIndex-1);
			quicksort(arr, partitionIndex+1, right);
		}
	}
	private int partition(int[]arr, int left,int right) {
		int pivot=left;
		int index=pivot+1;
		for(int i=index;i<=right;i++) {
			if (arr[i]<arr[pivot]) {
				swap(arr,i,index);
				index++;
			}
		}
		swap(arr,pivot,index-1);
		return index-1;
	}
	private void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QickSort t =new QickSort();
		int[] a = {3,2,7,10,1,9,0,5,100,88,66,99};
		t.quicksort(a,0,a.length-1);
		for(int i : a)
			System.out.print(+i+" ");
	}

}
