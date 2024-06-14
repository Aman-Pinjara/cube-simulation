import java.util.*;

public class Generator {
    public static String rotate(String alg, String side) {
        StringBuilder rAlg = new StringBuilder();
        switch (side) {
          case "y":
            for (var element: alg.toCharArray()) {
              if (element == 'F') {
                rAlg.append('L');
              } else if (element == 'R') {
                rAlg.append('F');
              } else if (element == 'B') {
                rAlg.append('R');
              } else if (element == 'L') {
                rAlg.append('B');
              } else {
                
                rAlg.append(String.valueOf(element));
              }
            }
            return rAlg.toString();
          case "y'":
            for (var element: alg.toCharArray()) {
              if (element == 'F') {
                rAlg.append('R');
              } else if (element == 'R') {
                rAlg.append('B');
              } else if (element == 'B') {
                rAlg.append('L');
              } else if (element == 'L') {
                rAlg.append('F');
              } else {
                rAlg.append(String.valueOf(element));
              }
            }
            return rAlg.toString();
          default:
            for (var element : alg.toCharArray()) {
              if (element == 'F') {
                rAlg.append('B');
              } else if (element == 'R') {
                rAlg.append('L');
              } else if (element == 'B') {
                rAlg.append('F');
              } else if (element == 'L') {
                rAlg.append('R');
              } else {
                rAlg.append(String.valueOf(element));
              }
            }
            return rAlg.toString();
        }
      }
    
      public static String inverse(String alg) {
        String[] temp = alg.split(" ");
        List<String> tempR = Arrays.asList(temp);
        Collections.reverse(tempR);
        StringBuilder iAlg = new StringBuilder();
        for (String element : tempR) {
          if (element.contains("'")) {
            iAlg.append(element.substring(0, 1));
          } else if (element.contains("2")) {
            iAlg.append(element);
          } else {
            iAlg.append(element+"'");
          }
          iAlg.append(" ");
        }
        return iAlg.toString().trim();
      }
}
