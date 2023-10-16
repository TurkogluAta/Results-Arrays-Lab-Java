/*
 * Results.java
 * @author: Ata Turkoglu
 * Date: 21/04/2023
 */

public class Results {
    //Declare data memebers
    private double[][] quizResults;
    private double[] bestResults;
    private double[] worstResults;
    private double[] averageResults;

    //Constructor
    public Results() {
        this.quizResults = new double[5][3];
        this.bestResults = new double[5];
        this.worstResults = new double[5];
        this.averageResults = new double[5];
    }

    //Setters
    public void setResults(double[][] quizResults) {
        this.quizResults = quizResults;
    }

    //Compute method
    public void compute() {
        for (int i = 0; i < quizResults.length; i++) {
            double min = quizResults[i][0];
            double max = quizResults[i][0];
            double sum = 0;

            for (int j = 0; j < quizResults[i].length; j++) {
                double result = quizResults[i][j];
                if (result < min) {
                    min = result;
                }
                if (result > max) {
                    max = result;
                }
                sum += result;
            }

            bestResults[i] = max;
            worstResults[i] = min;
            averageResults[i] = sum / quizResults[i].length;
        }
    }

    //Getters
    public double[] getBest() {
        return bestResults;
    }
    public double[] getWorst() {
        return worstResults;
    }
    public double[] getAverage() {
        return averageResults;
    }
}