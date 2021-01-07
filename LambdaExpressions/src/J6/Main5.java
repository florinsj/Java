package J6;

public class Main5 {

    // anonymous implementation
    //lambda is stateless == in lambda expression we cannot have fields !!!!

    MyEventConsumer consumer = new MyEventConsumer() {

        //we can have/add an internal state(field)
        private int eventCount = 0;

        @Override
        public void consume(Object event) {
            System.out.println(event.toString() + " consumed");
        }
    };
}
