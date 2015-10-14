import java.util.ArrayList;

public class UniqueArray {

  public static int[] unique(int[] integers) {
  if(integers.length<2) return integers;
  ArrayList<Integer> list = new ArrayList<Integer>();

  for(Integer i:integers)
    if(!list.contains(i))
      list.add(i);

   int[] ints = new int[list.size()];
   int i = 0;

   for (Integer n : list)
       ints[i++] = n;

    return ints;
  }
}
