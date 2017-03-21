/**
 * Created by ml996 on 3/21/17.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        shuffle s = new shuffle(new File("class.txt"));
        s.shuffleClass();
        s.print();
    }
}
