import java.lang.String;

public class SearchCharInString {
  static void main() {
    String str = new String("Sarthak");
    char ch = 't';
    if (searchCharForEach(str, ch) && searchCharForReg(str, ch)) {
      System.out.println("element found");
    } else{
      System.out.println("element not found");
    }
  }

  static boolean searchCharForReg(String str, char ch) {
    for (int i = 0; i < str.length(); i++) {
      if (ch == str.charAt(i))
        return true;
    }
    return false;
  }

  static boolean searchCharForEach(String str, char ch) {
    for (char elem : str.toCharArray()) {
      if (ch == elem)
        return true;
    }
    return false;
  }
}
