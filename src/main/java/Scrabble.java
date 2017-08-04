import java.util.Arrays;
import java.util.List;

public class Scrabble {
    List<String> valueOne = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
    List<String> valueTwo = Arrays.asList("D", "G");
    List<String> valueThree = Arrays.asList("B", "C", "M", "P");
    List<String> valueFour = Arrays.asList("F", "H", "Y", "W", "V");
    List<String> valueEight = Arrays.asList("J", "X");
    List<String> valueTen = Arrays.asList("Z", "Q");
    int sum = 0;

    public Integer calculateScore(String letter) {
        
        String[] newWord = letter.split("");
        for (Integer i = 0; i < newWord.length; i++) {

            if (valueOne.contains(newWord[i])) {
                sum+= 1;
            } else if (valueTwo.contains(newWord[i])) {
                sum += 2;
            } else if (valueThree.contains(newWord[i])) {
                sum += 3;
            } else if (valueFour.contains(newWord[i])) {
                sum += 4;
            } else if (newWord[i].equals("K")) {
                sum += 5;
            } else if (valueEight.contains(newWord[i])) {
                sum += 8;
            } else if (valueTen.contains(newWord[i])) {
                sum += 10;
            }
        }
        return sum;
    }
}