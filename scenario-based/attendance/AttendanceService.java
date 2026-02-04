package attendance;

import java.util.*;

public class AttendanceService {

    private final Map<String, Set<String>> sessionAttendance = new HashMap<>();

    public void markAttendance(String sessionId, String studentId)
            throws DuplicateAttendanceException {

        sessionAttendance.putIfAbsent(sessionId, new HashSet<>());

        Set<String> students = sessionAttendance.get(sessionId);
        if (!students.add(studentId)) {
            throw new DuplicateAttendanceException(
                    "Attendance already marked for student " + studentId);
        }
    }

    public void removeAttendance(String sessionId, String studentId) {
        Set<String> students = sessionAttendance.get(sessionId);
        if (students != null) {
            students.remove(studentId);
        }
    }

    public void displayAttendance(String sessionId) {
        System.out.println("Session: " + sessionId);
        System.out.println(sessionAttendance.getOrDefault(sessionId, Set.of()));
    }
}
