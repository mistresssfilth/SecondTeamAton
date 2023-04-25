package shared;

public class SharedObject {
    private int current;

    public SharedObject() {
        this.current = 0;
    }

    public int getCurrent() {
        return current;
    }

    public void inc(){
        current++;
    }
}
