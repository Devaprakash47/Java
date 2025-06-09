import java.util.HashMap;
public class HashMapExample
{
    public static void main(String[] args)
    {
         HashMap<Integer,String> map=new HashMap<>();
         map.put(123,"Devaprakash");
         map.put(1234,"Nithyaprakash");
         System.out.println(map);
         map.replace(123, "Devaprakash");

                 System.out.println(map);

    }
}