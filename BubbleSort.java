public class BubbleSort{

	private int count =0;
	private int[] intArray;
	
	public BubbleSort(int[] ary){
		intArray = ary;
	}
	
	public void display(){
		for(var loop=0;loop<intArray.length;loop++){
			System.out.print(intArray[loop]+" ");
		}
	}
	
	public void bubbleSort(){
		boolean flag = true;
		while(flag){
		 flag = false;
			for(var i=1;i<intArray.length;i++){
				if(intArray[i-1] > intArray[i]){
					count++;	
					int swap = intArray[i-1];
					intArray[i-1] = intArray[i];							      intArray[i] = swap;
					flag = true;
					break;
				}
			}	
		}
	}
	
	public void getComparison(){
		System.out.println("Total swaps done by bubble sort is: "+count);
	}
	
}
