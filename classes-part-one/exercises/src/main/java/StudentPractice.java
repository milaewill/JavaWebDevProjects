public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student student = new Student("Mila", 62894, 1, 4.0);
        Teacher teacher = new Teacher("Gerard", "Darris", "LC101",5);
        Course javaCourse = new Course("Java Programming", teacher);

        javaCourse.enrollStudent(student);

    }
}
