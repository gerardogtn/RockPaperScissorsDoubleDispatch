/**
 * Created by gerardogtn on 2/20/16.
 */
public abstract class GameObject {

    public abstract boolean beats(GameObject o);

    public boolean beatsScissors() {
        return false;
    }

    boolean beatsRock() {
        return false;
    }

    boolean beatsPaper() {
        return false;
    }
}
