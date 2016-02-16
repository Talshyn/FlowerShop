/**
 * Created by user on 14.02.2016.
 */

public class Rose extends Flower {
    private int roseCost;

    public Rose(int cost, Freshness fresh, int stalk) {
        super(cost, fresh, stalk);
        Cost= cost;
    }


    @Override
    public void setCost(){
        switch (this.Fresh) {
            case FullFresh:
                roseCost = Cost;
                break;
            case MiddleFresh:
                roseCost = Cost - 50;
                break;
            case OldFresh:
                roseCost = Cost - 100;
                break;
        }
        }

    @Override
        public int getCost() {
            return roseCost;
        }


}
