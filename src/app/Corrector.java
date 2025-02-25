package app;

public class Corrector {
    public String handleData(String[] strings) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (String string : strings) {
            string = string.replace("b", "o");
            counter++;
            builder.append(counter).append(") ").append(string).append("%n");
        }
        return builder.toString();
    }
}
