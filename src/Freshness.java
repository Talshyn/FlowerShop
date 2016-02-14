/**
 * Created by user on 14.02.2016.
 */
public enum Freshness {
    FullFresh("fullFresh"),
    MiddleFresh("MiddleFresh"),
    OldFresh("OldFresh");

private  final String Freshness;
    Freshness(String freshness){
        this.Freshness = freshness;
    }

}
