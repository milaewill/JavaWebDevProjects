import java.util.ArrayList;

public class Course {

        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;

        public Course(String topic, Teacher instructor) {
            this.topic = topic;
            this.instructor = instructor;
            this.enrolledStudents = new ArrayList<>();
        }

        public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        }

    }


