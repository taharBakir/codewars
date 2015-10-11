import java.util.ArrayList;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
  ArrayList<Integer> r = new ArrayList<Integer>();
  for(int n:numbers){
    if(n%divider==0)
      r.add(n);
  }
    int[] res = new int[r.size()];
    for(int i=0;i<r.size();i++){
        res[i]=r.get(i);
    }
    return res;
  }
}
