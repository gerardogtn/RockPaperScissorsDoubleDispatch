/**
 * Created by gerardogtn on 2/20/16.
 */
public interface GameObject {
    boolean beats(GameObject o);
    boolean beatsScissors();
    boolean beatsRock();
    boolean beatsPaper();
}
