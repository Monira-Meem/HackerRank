package implementation.easyBasic;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        for (int grade : grades) {
            if (grade >= 38 && (grade + 5 - grade % 5) - grade < 3)
                list.add(grade + 5 - grade % 5);
            else
                list.add(grade);
        }
        return list;
    }
}
