import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Bogdan");
        list.add("Maria");
        list.add("Petre");
        list.add("Bogdan");
        list.add("Petre");
        list.add("Bogdan");
        HashMap<String,Integer > res=new HashMap<>();
        for(String x:list){
            if(res.get(x)==null){
                res.put(x,1);
            }else{
                int existingCount=res.get(x);
                existingCount++;
                res.put(x,existingCount);
            }
        }
        System.out.println(res);


    }
}