package J3;

import javax.swing.plaf.nimbus.State;

// example without lambda (Java 7)
public class Main1 {
    public static void main(String[] args) {

        StateOwner stateOwner = new StateOwner();

        //anonymous interface implementation
        stateOwner.addStateListener(new StateChangeListener() {
            @Override
            public void onStateChange(State oldState, State newState) {

                //do something

            }
        });


    }
}
