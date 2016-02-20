/**
 * Created by gerardogtn on 2/20/16.
 */
public class Rock implements GameObject {

    public Rock() {

    }

    @Override
    public boolean beats(GameObject o) {
        return !o.beatsRock();
    }

    @Override
    public boolean beatsScissors() {
        return true;
    }

    @Override
    public boolean beatsRock() {
        return false;
    }

    @Override
    public boolean beatsPaper() {
        return false;
    }
}
