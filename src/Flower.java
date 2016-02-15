/**
 * Created by user on 14.02.2016.
 */
public  class Flower implements Comparable<Flower> {
    public int Cost;
    public Freshness Fresh;
    public int StalkLength;

    public Flower(int cost, Freshness fresh, int stalk) {
        this.Cost = cost;
        this.Fresh = fresh;
        this.StalkLength =stalk;

    }



    public int getCost() {
        return Cost;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Flower other) {
        if(this.Cost > other.Cost)
        {return  1;}
        if(this.Cost <other.Cost)
        {return  -1;}
        else return 0;
    }
}
