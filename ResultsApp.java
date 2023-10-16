/*
 * ResultsApp.java
 * @author: Ata Turkoglu
 * Date: 21/04/2023
 */

import javax.swing.JOptionPane;
public class ResultsApp {
    public static void main(String[] args) {
        //Declare variables 
        double[][] quizResults = new double[5][3];

        //Declare objects
        Results results = new Results();

        //Input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog(null, "Enter the result of Quiz " + (j + 1) + " for Student " + (i + 1) + ":");
                double result = Double.parseDouble(input);
                quizResults[i][j] = result;
            }
        }
        results.setResults(quizResults);
        
        //Process
        results.compute();

        //Output
        double[] bestResults = results.getBest();
        double[] worstResults = results.getWorst();
        double[] averageResults = results.getAverage();

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Student " + (i + 1) + "\n" +
                    "Best Result: " + bestResults[i] + "\n" +
                    "Worst Result: " + worstResults[i] + "\n" +
                    "Average Result: " + averageResults[i]);
        }        
    }
}
