package J3.WithoutLambda;

// example without lambda (Java 7)
public class StateOwner {
    public void addStateListener(StateChangeListener listener) {

        //implementatin of addStateListener
        System.out.println("addStateListener was invoked!");
    }
}
