package task1_1;

@FunctionalInterface
public interface OnTaskDoneListener<T> {
    void onDone(T result);
}
