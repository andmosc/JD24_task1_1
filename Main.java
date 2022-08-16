package task1_1;

public class Main {

    static final int ERROR_NUMBER = 33;

    public static void main(String[] args) {

        OnTaskDoneListener<Integer> listener = result -> {
            if (result != ERROR_NUMBER) {
                System.out.println("Task "+result+" is done");
            }
        };

        OnTaskErrorListener<Integer> listerError = result -> {
            if (result == ERROR_NUMBER) {
                System.out.println("Task "+result+" ERROR!!!");
            }
        };

        Worker worker = new Worker(listener, listerError);

        worker.start();
    }
}
