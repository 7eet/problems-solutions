public class BubbleSort{

	private int count =0;
	
	private int[] intArray;
	private int index = -1;
	
	public BubbleSort(int size){
		intArray = new int[size];
	}
	
	public void addElement(int i){
		if(index >= intArray.length){
			System.out.println("Array is Full");
			return;
		}
		index++;
		intArray[index]=i;
		return;
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
			for(var i=0;i<intArray.length;i++){
				for(var j=i+1;j<intArray.length;j++){
					if(intArray[i] > intArray[j]){
						count++;	
						int swap = intArray[i];
						intArray[i] = intArray[j];							intArray[j] = swap;
						flag = true;
						break;
					}
					break;
				}	
			}
		}
	}
	
	public void getComparison(){
		System.out.println("Total swaps done by bubble sort is: "+count);
	}
	
}
