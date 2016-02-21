/**
 * Created by gerardogtn on 2/20/16.
 */
public class Paper extends GameObject {

    public Paper() {

    }

    @Override
    public boolean beats(GameObject o) {
        return !o.beatsPaper();
    }

    @Override
    public boolean beatsRock() {
        return true;
    }

}
