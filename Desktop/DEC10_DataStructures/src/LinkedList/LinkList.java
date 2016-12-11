package LinkedList;
import java.util.LinkedList;

/**
 * Created by DAGR8DON on 12/10/16.
 */
public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("NY");
        list.add("N");
        list.add("IO");
        list.add("CA");
        list.remove("IO");
        for(String o:list)
            System.out.println(o);

    }

}
