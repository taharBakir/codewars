import java.lang.StringBuilder;

public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
    if(!(toRepeat instanceof String))
      return "Not a string";
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;i++){
      sb.append(toRepeat);
    }

    return sb.toString();
  }

}
