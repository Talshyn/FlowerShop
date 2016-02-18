/**
 * Created by user on 14.02.2016.
 */
public abstract class Flower implements Comparable<Flower> {

    public enum Freshness {
        FullFresh,
        MiddleFresh,
        OldFresh }


    public int Cost;
    public Freshness Fresh;
    public int StalkLength;




    public Flower(Freshness fresh, int stalk) {

        this.Fresh = fresh;
        this.StalkLength =stalk;

    }


    public int getCost(){
        return Cost;
    }
    public void setCostByFresh(){}



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Flower other) {
        if(this.Fresh == other.Fresh)
        {return  1;}
        if(this.Fresh != other.Fresh)
        {return  -1;}
        else return 0;
    }
}
