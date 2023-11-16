package LabMid;

import java.util.List;

class ComputerListIterator implements ComputerIterator {
    List<String> computerList;
    int index = 0;

    public ComputerListIterator(List<String> computerList) {
        this.computerList = computerList;
    }

    @Override
    public boolean hasNext() {
        return index < computerList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return computerList.get(index++);
        }
        return null;
    }
}