package J4;

// example with lambda expression
public class Main2 {
    public static void main(String[] args) {

        StateOwner stateOwner = new StateOwner();

//        //anonymous interface implementation
//        stateOwner.addStateListener(new StateChangeListener() {
//            @Override
//            public void onStateChange(State oldState, State newState) {
//
//                //do something
//
//            }
//        });

        stateOwner.addStateListener(
                (oldState, newState) -> {
                    System.out.println("State changed!");
                }
        );

    }
}
