package Snake;

public class SnakeImpl implements Snake {

    private String currentVector;

    public SnakeImpl(String currentVector) {
        this.currentVector = currentVector;
    }

    public String getCurrentVector() {
        return currentVector;
    }

    @Override
    public void move(String a) {

    }
}
