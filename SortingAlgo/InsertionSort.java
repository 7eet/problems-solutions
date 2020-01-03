public class InsertionSort{
	
	int[] inputArray;
	
	public InsertionSort(int[] input){
		inputArray = input;
	}
	
	public void sort(){
		if( inputArray.length > 0 ){
			for(var i = 1; i<inputArray.length; i++){
				if(inputArray[i-1] > inputArray[i]){
					int swap = inputArray[i-1];
					inputArray[i-1] = inputArray[i];
					inputArray[i] = swap; 
					
					if(i > 0){
						againCheckForSort(i);
					}
				}	
			}
		}
	}
	
	private void againCheckForSort(int index){
		for(var j = index;j>0;j--){
			if(inputArray[j] < inputArray[j-1]){
					int swap = inputArray[j];
					inputArray[j] = inputArray[j-1];
					inputArray[j-1] = swap; 
					
			}
		}
	}
	
	public void printArray(){
		for(var i = 0 ; i<inputArray.length;i++){		
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}

}
