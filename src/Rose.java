/**
 * Created by user on 14.02.2016.
 */
public class Rose extends Flower {
    private int roseCost;
    public Rose(int cost, Freshness fresh, int stalk) {
        super(cost, fresh, stalk);
        Cost= cost;
    }

    public int getRoseCost() {
        return roseCost;
    }

    public void setRoseCost(){
        switch (this.Fresh){
            case FullFresh: roseCost= Cost;
                break;
            case MiddleFresh: roseCost= Cost-2;
                break;
            case OldFresh: roseCost= Cost-4;
                break;
        }
    }


}
