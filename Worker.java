package task1_1;

public class Worker {
    private final OnTaskDoneListener<Integer> callback;
    private final OnTaskErrorListener<Integer> errorCallback;

    public Worker(OnTaskDoneListener<Integer> callback, OnTaskErrorListener<Integer> errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 50; i++) {
            callback.onDone(i);
            errorCallback.onError(i);
        }
    }
}
