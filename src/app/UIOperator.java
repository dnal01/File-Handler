package app;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class UIOperator {

    public void getOutput(String output) {
        System.out.println(output);
    }
}