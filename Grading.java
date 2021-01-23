import java.util.Scanner;

public class Grading {

    private double qoPoints, qtPoints, mtPoints, fPoints, gPoints, getScore;
    private boolean active;
    Scanner sc = new Scanner(System.in);

    // /Input integer grade score to return current letter Grade/
    private void ScoreGrade(double getGrade) {
        gPoints = getGrade;

        if (gPoints >= 90) {
            System.out.println("A");
        } else if (gPoints >= 80) {
            System.out.println("B");
        } else if (gPoints >= 70) {
            System.out.println("C");
        } else if (gPoints >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    // Rating of first quiz will receive integer value of max 10 points.
    // A letter grade will be returned of current quiz./
    private void QuizOne() {
        active = true;
        System.out.println("Input the first quiz points." + "\n[Points are out of 10]");
        qoPoints = sc.nextInt();
        do {
            if (qoPoints > 10) {
                System.out.println("Points can't exceed 10 points");
                System.out.println("Input the first quiz points." + "\n[Points are out of 10]");
                qoPoints = sc.nextInt();
            } else {
                active = false;
            }
        } while (active);

        getScore = (qoPoints / 10) * 100;
        System.out.println("Final grade for first quiz is:");
        ScoreGrade(getScore);
        System.out.println("");
    }

    // Rating of second quiz will receive integer value of max 10 points.
    // A letter grade will be returned of current quiz./
    private void QuizTwo() {
        active = true;
        System.out.println("Input the second quiz points." + "\n[Points are out of 10]");
        qtPoints = sc.nextInt();
        do {
            if (qtPoints > 10) {
                System.out.println("Points can't exceed 10 points");
                System.out.println("Input the second quiz points." + "\n[Points are out of 10]");
            } else {
                active = false;
            }
        } while (active);

        getScore = (qtPoints / 10) * 100;
        System.out.println("Final grade for second quiz is:");
        ScoreGrade(getScore);
        System.out.println("");
    }

    // Rating of midterm quiz will receive integer value of max 100 points.
    // A letter grade will be returned of current quiz./
    private void MidTerm() {
        active = true;
        System.out.println("Input the midterm points." + "\n[Points are out of 100]");
        mtPoints = sc.nextInt();
        do {
            if (mtPoints > 100) {
                System.out.println("Points can't exceed 100 points");
                System.out.println("Input the midterm points." + "\n[Points are out of 100]");
            } else {
                active = false;
            }
        } while (active);

        getScore = (mtPoints / 100) * 100;
        System.out.println("Final grade for midterm quiz is:");
        ScoreGrade(getScore);
        System.out.println("");
    }

    // Rating of final quiz will receive integer value of max 100 points.
    // A letter grade will be returned of current quiz./
    private void Final() {
        active = true;
        System.out.println("Input the final points." + "\n[Points are out of 100]");
        fPoints = sc.nextInt();
        do {
            if (fPoints > 100) {
                System.out.println("Points can't exceed 100 points");
                System.out.println("Input the final points." + "\n[Points are out of 100]");
            } else {
                active = false;
            }
        } while (active);

        getScore = (fPoints / 100) * 100;
        System.out.println("Final grade for final quiz is:");
        ScoreGrade(getScore);
        System.out.println("");
    }

    // This method will run all other methods, get all their value
    // and return the final score in a letter grade.
    public void setScore() {
        QuizOne();
        QuizTwo();
        MidTerm();
        Final();

        double qFinal = (((qoPoints + qtPoints) / 20) * 100) / 4;
        double mtFinal = ((mtPoints / 100) * 100) / 4;
        double fFinal = ((fPoints / 100) * 100) / 2;
        double finalScore = qFinal + mtFinal + fFinal;
        System.out.println("Final grade for final quiz is:");
        ScoreGrade(finalScore);
    }
}