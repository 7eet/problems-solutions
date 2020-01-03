public class BinarySearch{
	
	public int binarySearch(int[] array, int start, int end, int target){
		int startPoint = start;
		int endPoint = end;
		int mid = (end+start)/2;
		
		if(startPoint == endPoint ){
			return array[startPoint] == target ? startPoint : -1;	
		}else{
	
		 if(array[mid] == target)
			return mid;
		else if(array[mid] > target){
			if((mid-1) < 1){                    
				return array[0] == target ? 0 : -1;
			}
			return binarySearch(array,startPoint,mid-1,target);
		}
		else{
			if((mid+1) > array.length-1){
				return array[array.length-1] == target ? array.length-1 : -1;
			}else
			return binarySearch(array,mid+1,endPoint,target);
		}		
		}
	}
	
}
