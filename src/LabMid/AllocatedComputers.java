package LabMid;

import java.util.List;

class AllocatedComputers implements ComputerList {
    List<String> computerList;

    public AllocatedComputers(List<String> computerList) {
        this.computerList = computerList;
    }

    @Override
    public ComputerIterator createIterator() {
        return new ComputerListIterator(computerList);
    }
}