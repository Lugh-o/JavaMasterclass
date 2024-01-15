package Section11.AbstractChallenge;
public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    protected abstract ListItem next();
    protected abstract ListItem setNext(ListItem next);
    protected abstract ListItem previous();
    protected abstract ListItem setPrevious(ListItem previous);
    protected abstract int compareTo();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}