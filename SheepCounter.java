import java.util.Arrays;

public class SheepCounter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
   return Arrays.stream(arrayOfSheeps).filter(x -> x==Boolean.TRUE).toArray().length;
  }
}
