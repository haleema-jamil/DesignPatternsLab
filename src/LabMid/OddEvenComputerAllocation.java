package LabMid;

import java.util.List;
import java.util.Map;

class OddEvenComputerAllocation extends ComputerAllocationTemplate {

    @Override
    protected Computer allocateComputer(Student student, Map<String, Computer> computers) {
        int registrationNoLastDigit = Integer.parseInt(String.valueOf(student.registrationNo.charAt(student.registrationNo.length() - 1)));
        return (registrationNoLastDigit % 2 == 1) ? computers.get("Linux") : computers.get("Windows");
    }

    @Override
    protected void printAllocationLists(List<String> linuxList, List<String> windowsList) {
        System.out.println("Linux List:");
        for (String studentInfo : linuxList) {
            System.out.println(studentInfo);
        }

        System.out.println("\nWindows List:");
        for (String studentInfo : windowsList) {
            System.out.println(studentInfo);
        }
    }
}
