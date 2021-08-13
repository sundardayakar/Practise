package methodslearning;

public class Prifex {
    public static void main(String[] args) {
        String[] input = new String[]{"sundar", "sunder", "sundar"};
        System.out.println(prefix(input));
    }

    public static String prefix(String[] words) {
        if (words.length == 0) {
            return "";

        }

        int imax = findMinOfStringLengths(words);
        for (int i = 0; i < imax; i++) {
            char ref = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (words[j].charAt(i) != ref) {
                    if (i == 0) {
                        return "";
                    }
                    return words[j].substring(0, i);
                }
            }
        }
        return words[0].

                substring(0, imax);


    }

    public static int findMinOfStringLengths(String[] strings) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minimum) {
                minimum = strings[i].length();
            }
        }
        return minimum;
    }

}
