/**
 * Created by gerardogtn on 2/20/16.
 */
public class Scissors implements GameObject{

    public Scissors() {

    }

    @Override
    public boolean beats(GameObject o) {
        return !o.beatsScissors();
    }

    @Override
    public boolean beatsScissors() {
        return false;
    }

    @Override
    public boolean beatsRock() {
        return false;
    }

    @Override
    public boolean beatsPaper() {
        return true;
    }
}
