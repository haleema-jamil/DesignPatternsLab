package GangOfFour.Iterator.Repository;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Student infoRepository = new Student();

        Iterator iter = infoRepository.getIterator();

        iter.moveToLast();
        System.out.println("Names Sarting from 'J': ");
        while (iter.hasPrevious()) {
            String name = (String) iter.next();
            if (name.startsWith("J")) {
                System.out.println("Name : " + name);
            }
        }
        
        iter.moveToFirst();
        System.out.println("Names: ");
        while (iter.hasNext()) {
            String name = (String) iter.next();
                System.out.println("Name : " + name);
        }

    }
}
