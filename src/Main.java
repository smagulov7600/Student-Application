public class Main {
    public static void main(String[] args) {
        int NumberOfStudents = 10;
        Students[] student = new Students[NumberOfStudents];

        student[0] = new Students(1,"John","Smith","Mathematics","A");
        student[1] = new Students(2,"Katie","Bobs","Economics","C");
        student[2] = new Students(3,"Robert","Dufenshmertz","Information","B");
        student[3] = new Students(4,"Alikhan","Smagulov","Technology","D");
        student[4] = new Students(5,"Madiyar","Erkezhanov","Mathematics","A");
        student[5] = new Students(6,"Daniyar","Smagulov","Information","B");
        student[6] = new Students(7,"Daria","Golubkova","Economics","C");
        student[7] = new Students(8,"Dasha","Strekozina","Technology","D");
        student[8] = new Students(9,"Bob","Brown","Mathematics","A");
        student[9] = new Students(10,"Leonard","Lefas'on","Information","B");

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);


    }
}