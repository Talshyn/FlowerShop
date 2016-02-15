/**
 * Created by user on 14.02.2016.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Flower flower1 = new Rose(500, Freshness.FullFresh, 20);
       Flower flower2 = new Rose(450, Freshness.OldFresh, 20);

        ArrayList<Flower> list = new ArrayList<Flower>();
        list.add(flower1);
        list.add(flower2);

       Collections.sort(list);
    for(Flower flowers: list){
        System.out.println(flowers.getCost());
}

    }
}
