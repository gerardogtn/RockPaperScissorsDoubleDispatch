/**
 * Created by gerardogtn on 2/20/16.
 */
public class Scissors extends GameObject{

    public Scissors() {

    }

    @Override
    public boolean beats(GameObject o) {
        return !o.beatsScissors();
    }

    @Override
    public boolean beatsPaper() {
        return true;
    }
}
