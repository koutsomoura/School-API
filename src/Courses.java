



public class Courses {
    int id;
    String name;
    char exam;
    int grade;

    Courses(int id, String name, char exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
        this.grade=0;
    }
    
    public String toString() {
       return id+" "+name+" "+exam;
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getExam() {
        return exam;
    }

    public int getGrade() {
        return grade;
    }
   
    
    
}
