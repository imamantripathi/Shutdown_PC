import java.io.*;
import java.util.*;
public class Shutdown {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time that you want to shutdown after some amount of time: ");
        Double timeInSeconds = sc.nextDouble();
        Runtime runtime =  Runtime.getRuntime();
        Process p = runtime.exec("shutdown -s -t"+timeInSeconds);
        System.exit(1);
    }
}