package app;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));

        }
    }