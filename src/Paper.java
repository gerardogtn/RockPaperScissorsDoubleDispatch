/**
 * Created by gerardogtn on 2/20/16.
 */
public class Paper implements GameObject {

    public Paper() {

    }

    @Override
    public boolean beats(GameObject o) {
        return !o.beatsPaper();
    }

    @Override
    public boolean beatsScissors() {
        return false;
    }

    @Override
    public boolean beatsRock() {
        return true;
    }

    @Override
    public boolean beatsPaper() {
        return false;
    }
}
