package GangOfFour.Iterator.Repository;

public interface Iterator {

    public boolean hasNext();

    public Object next();

    public Object previous();

    public void moveToLast();

    public void moveToFirst();

    public boolean hasPrevious();
}
