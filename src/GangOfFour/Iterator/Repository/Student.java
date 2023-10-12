package GangOfFour.Iterator.Repository;

public class Student implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};
//    public String regno[] = {"fa-123", "fa-456", "fa-789", "fa-012"};
//    public String gender[] = {"male", "male", "female", "female"};
//    public String phone[] = {"03xx-xxxxxxx", "03xx-xxxxxxx", "03xx-xxxxxxx", "03xx-xxxxxxx"};

    @Override
    public Iterator getIterator() {
        return new infoIterator();
//        return new regIterator();
    }

    private class infoIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            if (index > 0) {
                return names[--index];
            }
            return null;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public void moveToLast() {
            index = names.length - 1;
        }

        @Override
        public void moveToFirst() {
            index = 0;
        }

        @Override
        public boolean hasPrevious() {
            if (index > 0) {
                return true;
            }
            return false;
        }
    }
}
