package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        String namesOutput = dataHandler.handleData(provider.getProductNames());
        getOutput("Products: " + namesOutput);

        String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    private static void getOutput(String output) {
        System.out.println(output);
        System.out.println("App version 1.0");
        System.out.println("01_7V_Initial");
    }
}