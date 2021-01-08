package J3.WithoutLambda;

import javax.swing.plaf.nimbus.State;

// example without lambda (Java 7)
public interface StateChangeListener {
    public void onStateChange(State oldState, State newState);
}
