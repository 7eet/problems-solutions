// implementation of stack using array object.
public class Stack{

	private Object[] dataType;
	private Object node = null;
	private int index = -1;
	
	public Stack() {
		dataType = new Object[10];
	}
	
	public Object push(Object object){
		if( dataType[0] == null){
			dataType[0] = object;
			index = 0;
			return object;
		}else {
			/*
			* if statement checks last index of array is 
			* empty or not, if yes then jump to else and 
			* double the array size and then assign object 
			* to it.
			*/
			if (dataType[(dataType.length -1)] == null){
			dataType[++index] = object;
			}else {		
				this.dataType = doubleArray(dataType);
				dataType[++index] = object;						return object;
			}
		}
		return dataType[index];
	}
	
	public Object pop(){ 
		Object result = null;
		/*
		*	it first check the index value is it less than 
		* 	zero? if yes , than it is empty
		*	else print the object. 
		*/
		
		if(index < 0){
			System.out.println("Stack is empty");
		}else {
			result = dataType[index];
			dataType[index] = null;
			--index;
		}
		return result;
	}

	/*
	*	this method first doubles the size of array and the
	*       copies element to it and return it.
	*/	
	
	private Object[] doubleArray (Object[] obj) {
		Object doubledArray[] = new Object[obj.length*2];
		for(var i=0;i<obj.length;i++) {
			doubledArray[i] = obj[i];
		}
		return doubledArray;
	}
}
