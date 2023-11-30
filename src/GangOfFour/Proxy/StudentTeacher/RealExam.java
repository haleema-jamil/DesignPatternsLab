package GangOfFour.Proxy.StudentTeacher;

import java.util.HashMap;
import java.util.Map;

public class RealExam implements Exam{
    private Map<String, String> results;
    
    public RealExam(){
        this.results = new HashMap<>();
    }
    
    public void addStudentResult(String studentName, String result){
        results.put(studentName, result);
    }

    @Override
    public void conductExam() {
        System.out.println("Exam Conducted");
    }
    
    public Map<String, String> getResults(){
        return results;
    }
}
