/**
 * Created by ml996 on 3/21/17.
 */
import java.io.*;
import java.util.*;

public class shuffle{
    ArrayList<String> C = new ArrayList<String>();
    Random r = new Random();
    public shuffle(File f) throws IOException{
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            C.add(sc.nextLine());
        }
    }
    public void shuffleClass(){
        for(int i = 0; i < C.size()-1; i++){
            int temp = r.nextInt(C.size()-i-1) + i + 1;
            swapCards(i, temp);
        }
    }
    public void swapCards(int a, int b){
        String x = C.get(a);
        C.remove(a);
        C.add(a, C.get(b-1));
        C.remove(b);
        C.add(b, x);
    }
    public void print(){
        for(String x : C){
            System.out.println(x);
        }
    }
}
