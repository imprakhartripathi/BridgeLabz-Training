public class PensDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        // Calculate pens per student using integer division
        int pensPerStudent = totalPens / totalStudents;
        // Get remaining pens using modulo operation
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
