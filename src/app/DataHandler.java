package app;

import java.util.Map;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

   Map<Integer, String> map = new DataRepository().getData();

    // Метод формує виведення нумерованого переліку імен
    public String getAll() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n",
                        count.incrementAndGet(),id, name)
                ));
        return "\nALL NAMES:\n" + sb;
    }

    // Метод формує виведення імені за певним id
    public String getById(int id) {
        if (map.containsKey(id)) {
            return "\nNAME: id " + id + ", " +
                    map.get(id);
        } else return "No data!";
       }

    // Метод формує виведення нумерованого списку імен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        for (String name : list) {
            sb.append(String.format("%d) %s%n",
                    count.getAndIncrement(), name));
        }
        return "\nNames:\n" + sb.toString();
    }
}
