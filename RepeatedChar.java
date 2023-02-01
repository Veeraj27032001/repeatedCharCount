import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedChar {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        System.out.println("enter string");
        String input= (new Scanner(System.in)).next();
       final long starttime=System.currentTimeMillis();
        for(char c : input.toCharArray())
        {
            if(map.get(c)!=null)
            {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            };
        }
        System.out.println(map.get(input.charAt(0)));
        final long endTime=System.currentTimeMillis();
        System.out.println("speed: "+(endTime-starttime));
    }
}
