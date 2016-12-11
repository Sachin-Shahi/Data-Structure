package Mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by DAGR8DON on 12/10/16.
 */
public class Mapping {
    public static void main(String[] args) {
        Map<String, String> list=new LinkedHashMap<String, String>();
        list.put("USA","NY");
        list.put("Nepal","Kathamndu");
        list.put("Bangladesh","Dhaka");
        for (Map.Entry map:list.entrySet()){
            System.out.println(map.getKey()+"\t\t\t"+map.getValue());


        }
    }
}
