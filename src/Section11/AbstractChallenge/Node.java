package Section11.AbstractChallenge;
public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return super.rightLink;
    }

    @Override
    protected ListItem setNext(ListItem next) {
        super.rightLink = next;
        return rightLink;
    }

    @Override
    protected ListItem previous() {
        return super.leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem previous) {
        super.leftLink = previous;
        return leftLink;
    }

    @Override
    protected int compareTo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    
}
