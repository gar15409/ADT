
public class SelectionSort {
	
	public String[] selectionSort(Comparable[] list){   
		for (int i=0;i<list.length;i++){
		        for (int si=i;si<list.length;si++){
		            if (list[si].compareTo(list[i])<0){
		                Comparable temp=list[i];
		                list[i]=list[si];
		                list[si]=temp;
		                
		                
		            }
		        }
		       }
		return (String[]) list;
		    }

}
