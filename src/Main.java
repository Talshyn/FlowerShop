/**
 * Created by user on 14.02.2016.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       //Flower flower1 = new Rose(300, Flower.Freshness.MiddleFresh, 20);
      // Flower flower2 = new Rose(450, Flower.Freshness.OldFresh, 20);

        ArrayList<Flower> list = new ArrayList <Flower>();
        list.add(new Rose(300, Flower.Freshness.MiddleFresh, 20));
        list.add(new Rose(450, Flower.Freshness.OldFresh, 20));


       Collections.sort(list);
    for(Flower flowers: list){
        flowers.setCost();
        System.out.println(flowers.getCost());
}
    }
}
