package LabMid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

abstract class ComputerAllocationTemplate {

    public void allocateComputers(List<Student> students, Map<String, Computer> computers) {
        List<String> linuxList = new ArrayList<>();
        List<String> windowsList = new ArrayList<>();

        for (Student student : students) {
            Computer computer = allocateComputer(student, computers);
            if (computer.OS.equals("Linux")) {
                linuxList.add(student.name + " (" + student.registrationNo + "): " + computer);
            } else {
                windowsList.add(student.name + " (" + student.registrationNo + "): " + computer);
            }
        }

        printAllocationLists(linuxList, windowsList);
    }

    protected abstract Computer allocateComputer(Student student, Map<String, Computer> computers);

    protected abstract void printAllocationLists(List<String> linuxList, List<String> windowsList);
}
