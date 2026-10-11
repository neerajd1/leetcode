
import java.util.AbstractList;
class Solution {
    public List<String> fizzBuzz(int n) {

        return new AbstractList<String>() {
      @Override
      public String get(int index) {
        index++;
        if (index % 3 == 0 && index % 5 == 0) return "FizzBuzz";
        else if (index % 3 == 0) return "Fizz";
        else if (index % 5 == 0) return "Buzz";
        return String.valueOf(index);
      }

      @Override
      public int size() {
        return n;
      }
    };
    }
}