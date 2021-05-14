import java.util.*;
import java.io.*;
public class Parallel implements Runnable {
  public static void main(String[] args) {
    Parallel obj = new Parallel();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}