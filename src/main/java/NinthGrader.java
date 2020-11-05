public class NinthGrader extends Student {

    //private int classYear;

    public NinthGrader() {
        super("jim", "john", 2024);
        //java will automatically call the super with no parameters from parent class
    }

     public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }
    
    @Override
    public void doSomething() {
        System.out.println("I'm preparing for a harkness discussion");
    }

    @Override
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (ninth grader)";
        return str;
    }

    
}