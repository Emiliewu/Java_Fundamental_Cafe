import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Puzzling {

//   getTenRolls
// Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
  public ArrayList<Integer> getTenRolls() {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      result.add(r.nextInt(20) + 1);
    }
    return result;
  }

// getRandomLetter
// Write a method that will:
// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
// Generate a random index between 0-25, and use it to pull a random letter out of the array.
// Return the random letter.
  public char getRandomLetter() {
    char ch = 'a';
    char[] charArray = new char[26];
    int idx = 0;
    while(ch <= 'z') {
      charArray[idx] = ch;
      ch++;
      idx++;
    }
      Random r = new Random();
      ch = charArray[r.nextInt(26)];
    return ch;
  }  

// generatePassword
// Write a method that uses the previous method to create a random string of eight characters, and return that string.
  public String generatePassword() {
    String password = "";
    for(int i = 0; i < 8; i++) {
      password += getRandomLetter();
    }
    return password;
  }

// getNewPasswordSet

// Write a method that takes an int length as an argument and creates an array of random eight character words. 
// The array should be the length passed in as an int.
  public ArrayList<String> getNewPasswordSet(int length) {
    
    ArrayList<String> result = new ArrayList<String>();
    if(length <= 0) {
      System.out.println("length should be greater than 0");
      return result;
    }
    for(int i = 0; i < length; i++) {
      result.add(generatePassword());
    }
    return result;
  }


// SENSEI BONUS:
// shuffleArray
// Write a method that takes an array and and mixes up all the values in a pseudo-random way. 
//Hint: use random indexes within the array, and swap values repeatedly. 
  public void shuffleArray(int[] takenArray) {
    for(int i = 0; i < takenArray.length; i++) {
      Random r = new Random();
      int randidx1 = r.nextInt(takenArray.length);
      int randidx2 = r.nextInt(takenArray.length);
      int temp = takenArray[randidx1];
      takenArray[randidx1] = takenArray[randidx2];
      takenArray[randidx2] = temp;
    }
  }
}
