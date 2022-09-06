package springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;


    
   public Student(){   }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentAddress=" + studentAddress + ", studentId=" + studentId + ", studentName=" + studentName
                + "]";
    }   

    
}
