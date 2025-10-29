public class Grievance {
    private static int nextId = 1;
    private int grievanceId;
    private String studentSR;
    private String title;
    private String category;
    private String description;
    private String status;
    private String feedback;


    public Grievance(String studentSR, String title, String category, String description) {
        this.studentSR = studentSR;
        this.title = title;
        this.category = category;
        this.description = description;
        this.status = "Submitted";
        this.feedback = "None";
        this.grievanceId = nextId++;
    }


    public int getId() {
        return grievanceId;
    }


    public String getStudentSR() {
        return studentSR;
    }


    public void setStatus(String newStatus) {
        this.status = newStatus;
    }


    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


    public void display() {
        System.out.println("\nGrievance ID: " + grievanceId);
        System.out.println("Student SR-CODE: " + studentSR);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Feedback: " + feedback);
    }
}