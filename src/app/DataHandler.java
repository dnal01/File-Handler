package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    // Метод формує виведення імені за певним індексом
    public String formOutput(List<String> list, int index) {
        try {
            String name = list.add()
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    // Метод формує виведення нумерованого списку імен
    public String formListOutput(List list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        for (name : list) {
            sb.append(String.("%d) %s%n",
                    count.getAndIncrement(), name));
        }
        return "\nNames:\n" + sb;
    }
}