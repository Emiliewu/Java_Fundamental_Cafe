import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzling {
  public static void main(String[] args) {
    Puzzling generator = new Puzzling();
    ArrayList<Integer> randomRolls = generator.getTenRolls();
    System.out.println(randomRolls);
    
    char ch = generator.getRandomLetter();
    System.out.println(ch);
  
    String password = generator.generatePassword();
    System.out.println(password);

    ArrayList<String> passwordSet = generator.getNewPasswordSet(10);
    passwordSet.forEach(s->System.out.println(s));

    int[] theArray = {1,3,5,7,9,11,13,15,17};
    generator.shuffleArray(theArray);
    System.out.println(Arrays.toString(theArray));
  }
}
