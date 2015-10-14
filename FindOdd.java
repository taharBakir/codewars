import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindOdd {

	public static int findIt(int[] A) {
		int found=0;
		for(int i=0;i<A.length;i++){
      found=0;
        for(int j=0;j<A.length;j++){
          if(A[j]==A[i]){
            found++;
          }
        }
        if(found%2!=0)
          return A[i];
    }

  	return -1;
  }

	public static void main (String[] args){
			System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
	}
}
