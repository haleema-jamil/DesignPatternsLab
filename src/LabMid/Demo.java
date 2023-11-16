package LabMid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Haleema", "005", "Computer Science", 3),
                new Student("Marwa", "006", "Electrical Engineering", 4),
                new Student("Fatima", "004", "English", 5),
                new Student("Maryum", "008", "Civil Engineering", 4),
                new Student("Ali", "003", "Computer Engineering", 2),
                new Student("Hamza", "002", "Electrical Engineering", 4),
                new Student("Umar", "001", "Artificial Intelligence", 7),
                new Student("Tooba", "007", "Computer Science", 4),
                new Student("Hafsa", "009", "Psychology", 7)
        );

        Map<String, Computer> computers = new HashMap<>();
        computers.put("Linux", new Computer(1, "Linux", Arrays.asList("gcc", "vim", "python")));
        computers.put("Windows", new Computer(2, "Windows", Arrays.asList("Visual Studio", "Notepad++")));
        computers.put("Windows", new Computer(3, "Windows", Arrays.asList("Visual Studio", "Notepad++")));
        computers.put("Linux", new Computer(4, "Linux", Arrays.asList("gcc", "vim", "python")));
        computers.put("Linux", new Computer(5, "Linux", Arrays.asList("gcc", "vim", "python")));
        computers.put("Linux", new Computer(6, "Linux", Arrays.asList("gcc", "vim", "python")));
        computers.put("Windows", new Computer(7, "Windows", Arrays.asList("Visual Studio", "Notepad++")));
        computers.put("Linux", new Computer(8, "Linux", Arrays.asList("gcc", "vim", "python")));
        computers.put("Windows", new Computer(9, "Windows", Arrays.asList("Visual Studio", "Notepad++")));

        ComputerAllocationTemplate allocationStrategy = new OddEvenComputerAllocation();
        allocationStrategy.allocateComputers(students, computers);

        Set<Integer> assignedComputerNumbers = new HashSet<>();
        List<String> linuxList = new ArrayList<>();
        List<String> windowsList = new ArrayList<>();

        for (Student student : students) {
            Computer computer = allocateComputer(student, computers, assignedComputerNumbers);
            if (computer != null) {
                String allocationInfo = student.name + " (" + student.registrationNo + "): " + computer;
                if (computer.OS.equals("Linux")) {
                    linuxList.add(allocationInfo);
                } else {
                    windowsList.add(allocationInfo);
                }
            }
        }
    }

    private static Computer allocateComputer(Student student, Map<String, Computer> computers, Set<Integer> assignedComputerNumbers) {
        int registrationNoLastDigit = Integer.parseInt(String.valueOf(student.registrationNo.charAt(student.registrationNo.length() - 1)));
        Computer computer = (registrationNoLastDigit % 2 == 1) ? computers.get("Linux") : computers.get("Windows");
        if(computer != null && assignedComputerNumbers.add(computer.computerNo)){
            return computer;
        } else {
            return null;
        }
    }

    private static void printAllocationList(String header, List<String> list) {
        System.out.println(header);
        ComputerListIterator iterator = new ComputerListIterator(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
