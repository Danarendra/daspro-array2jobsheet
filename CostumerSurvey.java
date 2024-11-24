import java.util.Scanner;
public class CostumerSurvey {

    public static void main(String[] args) {
        int numRespondents = 10;
        int numQuestions = 5;
        int[][] surveyResults = new int[numRespondents][numQuestions];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the survey results (1-5 scale):");
        
        for (int i=0; i<numRespondents; i++) {
            System.out.println("Respondent " + (i + 1) + ":");
            for (int j = 0; j < numQuestions; j++) {
                System.out.print("Question " + (j + 1) + ": ");
                surveyResults[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nSurvey Results:");
        for (int i=0; i<numRespondents; i++) {
            System.out.print("Respondent " + (i + 1) + ": ");
            for (int j = 0; j < numQuestions; j++) {
                System.out.print(surveyResults[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAverage for each Respondent:");
        for (int i=0; i<numRespondents; i++) {
            int sum = 0;
            for (int j = 0; j < numQuestions; j++) {
                sum += surveyResults[i][j];
            }
            double average = sum / (double) numQuestions;
            System.out.println("Respondent " + (i + 1) + " average: " + average);
        }

        System.out.println("\nAverage for each Question:");
        for (int j=0; j<numQuestions; j++) {
            int sum = 0;
            for (int i = 0; i < numRespondents; i++) {
                sum += surveyResults[i][j];
            }
            double average = sum / (double) numRespondents;
            System.out.println("Question " + (j + 1) + " average: " + average);
        }
        int totalSum = 0;
        for (int i=0; i<numRespondents; i++) {
            for (int j = 0; j < numQuestions; j++) {
                totalSum += surveyResults[i][j];
            }
        }
        double overallAverage = totalSum / (double) (numRespondents * numQuestions);
        System.out.println("\nOverall average: " + overallAverage);

        scanner.close();
    }
    
}