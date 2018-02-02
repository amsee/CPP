// **********************************************************
// Assignment0:
// UTORID: Amy Wong
// UT Student #: 
// Author: 
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences. In this semester
// we will select any three of your assignments from total of 5 and run it
// for plagiarism check.
// *********************************************************
package a0;

// import DecimalFormat
import java.text.DecimalFormat;
// import Arrays
import java.util.Arrays;

public class Cfiltering {
  // this is a 2d matrix i.e. user*movie
  private int userMovieMatrix[][];
  // this is a 2d matrix i.e. user*movie
  private float userUserMatrix[][];

  /**
   * Default Constructor.
   */
  public Cfiltering() {
    // this is 2d matrix of size 1*1
    userMovieMatrix = new int[1][1];
    // this is 2d matrix of size 1*1
    userUserMatrix = new float[1][1];
  }

  /*
   * TODO:COMPLETE THIS I.E. APPROPRIATELY CREATE THE userMovieMatrix AND
   * userUserMatrix WITH CORRECT DIMENSIONS.
   */
  /**
   * Constructs an object which contains two 2d matrices, one of size
   * users*movies which will store integer movie ratings and one of size
   * users*users which will store float similarity scores between pairs of
   * users.
   * 
   * @param numberOfUsers Determines size of matrix variables.
   * @param numberOfMovies Determines size of matrix variables.
   */
  public Cfiltering(int numberOfUsers, int numberOfMovies) {
    // the rows of userMovieMatrix is the number of Users
    // the columns of userMovieMatrix is the number of Movies
    userMovieMatrix = new int[numberOfUsers][numberOfMovies];
    // the rows of userUserMatrix is the number of Users
    // the columns of userUserMatrix is the number of Users
    userUserMatrix = new float[numberOfUsers][numberOfUsers];
  }

  /**
   * The purpose of this method is to populate the UserMovieMatrix. As input
   * parameters it takes in a rowNumber, columnNumber and a rating value. The
   * rating value is then inserted in the UserMovieMatrix at the specified
   * rowNumber and the columnNumber.
   * 
   * @param rowNumber The row number of the userMovieMatrix.
   * @param columnNumber The column number of the userMovieMatrix.
   * @param ratingValue The ratingValue to be inserted in the userMovieMatrix
   */
  public void populateUserMovieMatrix(int rowNumber, int columnNumber,
      int ratingValue) {

    userMovieMatrix[rowNumber][columnNumber] = ratingValue;
  }

  public int[][] getUserMovieMatrix() {
    // returns the userMovieMatrix
    return userMovieMatrix;
  }


  /*
   * TODO:COMPLETE THIS YOU ARE FREE TO CHANGE THE FUNCTION SIGNATURE BUT DO NOT
   * CHANGE THE FUNCTION NAME AND DO NOT MAKE THIS FUNCTION STATIC. Add/remove
   * 
   * @param AND
   * 
   * @return as required below.
   */
  /**
   * Determines how similar each pair of users is based on their ratings. This
   * similarity value is represented with with a float value between 0 and 1,
   * where 1 is perfect/identical similarity. Stores these values in the
   * userUserMatrix.
   * 
   * @param COMPLETE THIS IF NEEDED
   * @param COMPLETE THIS IF NEEDED
   * @return COMPLETE THIS IF NEEDED
   */
  public float calculateSimilarityScore(int[] user1, int[] user2) {
    // initialize integer variable for difference between two users' ratings
    float totalDifference = 0;
    // for every user get the difference and square the difference
    // add the result to the final totalDifference
    for (int r = 0; r < user1.length; r++) {
      int difference = user2[r] - user1[r];
      totalDifference += (float) Math.pow(difference, 2);
    }
    // apply the Euclidean Distance formula by taking the square root
    float euclideanDistance = (float) Math.sqrt(totalDifference);
    // round all answers to 4 decimal places
    DecimalFormat df = new DecimalFormat("0.0000");
    // get the string value of the similarity score given the formula
    String stringSimilarityScore = df.format(1 / (1 + euclideanDistance));
    // get the float value of the string to populate the userUserMatrix
    float similarityScore = Float.valueOf(stringSimilarityScore);
    return similarityScore;
  }

  /*
   * TODO:COMPLETE THIS YOU ARE FREE TO CHANGE THE FUNCTION SIGNATURE BUT DO NOT
   * CHANGE THE FUNCTION NAME AND DO NOT MAKE THIS FUNCTION STATIC
   */
  public void populateUserUserMatrix() {
    // for every row
    for (int r = 0; r < getUserUserMatrixSize(); r++) {
      // for every element in the array
      for (int c = 0; c < getUserUserMatrixSize(); c++)
        // populate the userUserMatrix with the similarity score
        userUserMatrix[r][c] = calculateSimilarityScore(getUserMovieMatrix()[r],
            getUserMovieMatrix()[c]);
    }
  }

  public float[][] getUserUserMatrix() {
    // returns the userUserMatrix
    return userUserMatrix;
  }

  public int getUserUserMatrixSize() {
    // returns the length of the userUserMatrix
    return userUserMatrix.length;
  }

  /**
   * Prints out the similarity scores of the userUserMatrix, with each row and
   * column representing each/single user and the cell position (i,j)
   * representing the similarity score between user i and user j.
   * 
   * @param COMPLETE THIS IF NEEDED
   * @param COMPLETE THIS IF NEEDED
   * @return COMPLETE THIS IF NEEDED
   */

  public void printUserUserMatrix() {
    // for each row of the userUserMatrix
    for (int r = 0; r < getUserUserMatrixSize(); r++) {
      // start the line with a left parenthesis
      System.out.print("[");
      // for every element in the array up to the last element
      for (int c = 0; c < getUserUserMatrixSize() - 1; c++)
        // print the element to 4 decimal places with a comma and a space
        System.out.printf("%.4f, ", userUserMatrix[r][c]);
      // print the last element
      System.out.printf("%.4f", userUserMatrix[r][getUserUserMatrixSize() - 1]);
      // end the line with a right parenthesis
      System.out.print("]");
      // start a new line
      System.out.println("");
    }
  }

  /*
   * TODO:COMPLETE THIS YOU ARE FREE TO CHANGE THE FUNCTION SIGNATURE BUT DO NOT
   * CHANGE THE FUNCTION NAME AND DO NOT MAKE THIS FUNCTION STATIC
   */
  /**
   * This function finds and prints the most similar pair of users in the
   * userUserMatrix.
   * 
   * @param COMPLETE THIS IF NEEDED
   * @param COMPLETE THIS IF NEEDED
   * @return COMPLETE THIS IF NEEDED
   */

  public String[] getAboveLowerTriangularMatrix(float[][] matrix) {
    // get the size of the UserUserMatrix
    int userUserMatrixSize = getUserUserMatrixSize();
    // find the summation of N of the UserUserMatrix of N size
    // this represents the size of the lower triangular matrix
    int summationOfN = ((1 + userUserMatrixSize) * userUserMatrixSize) / 2;
    // find the number of elements in UserUserMatrix and subtract the
    // size of the lower triangular matrix to get the remaining elements
    int size = (int) Math.pow(userUserMatrixSize, 2) - summationOfN;
    // initialize an array to store the unique similarity scores
    String[] lowerTriangle = new String[size];
    // initialize the index at 0
    int index = 0;
    // for every row in UserUserMatrix
    for (int r = 0; r < matrix.length; r++) {
      // for every element in the unique area above the lower triangular
      // matrix
      for (int c = r + 1; c < matrix.length; c++) {
        // add the similarity score to the array and which users correspond
        // to the similarity scores
        lowerTriangle[index++] = String.format("%.4f", matrix[r][c]) + " User"
            + String.valueOf(r + 1) + " and " + "User" + String.valueOf(c + 1);
      }
    }
    return lowerTriangle;
  }

  public void findAndprintMostSimilarPairOfUsers() {
    // get the unique array of similarity scores
    String[] similarityScores = getAboveLowerTriangularMatrix(userUserMatrix);
    // sort the unique array
    Arrays.sort(similarityScores);
    // get the largest similarity score and the users corresponding to the
    // scores
    String mostSimilar = similarityScores[similarityScores.length - 1];
    // get only the largest similarity score
    String mostSimilarScore =
        mostSimilar.substring(0, mostSimilar.indexOf(' '));
    // get the second largest similarity score and the users corresponding to
    // the scores
    String secondMostSimilar = similarityScores[similarityScores.length - 2];
    // get only the second largest similarity score
    String secondMostSimilarScore =
        secondMostSimilar.substring(0, secondMostSimilar.indexOf(' '));
    // check if the largest and second largest similarity scores are the same
    if (mostSimilarScore.equalsIgnoreCase(secondMostSimilarScore)) {
      // if they are the same initialize a string to store all the users that
      // have the same similarity scores
      String users = "";
      // check all the strings in the unique array
      for (String string : similarityScores) {
        // check if the similarity scores are the same
        if (string.contains(mostSimilarScore)) {
          // if the scores are the same add the users to the users string
          // start a new line
          users += string.substring(string.indexOf(' ') + 1) + ",\n";
        }
      }
      // remove the last comma
      String allUsers = users.substring(0, users.length() - 2);
      // print the opening statement
      System.out.println("The most similar pairs of users from above "
          + "userUserMatrix are: ");
      // print the users with the most similar scores
      System.out.println(allUsers);
      // print the most similar score
      System.out.println("with similarity score of " + mostSimilarScore);
    } else {
      // print the opening statement
      System.out.println("The most similar pairs of users from above"
          + " userUserMatrix are: ");
      // print the users with the most similar score
      System.out.println(mostSimilar.substring(mostSimilar.indexOf(' ') + 1));
      // print the most similar score
      System.out.println("with similarity score of " + mostSimilarScore);
    }
  }


  /*
   * TODO:COMPLETE THIS YOU ARE FREE TO CHANGE THE FUNCTION SIGNATURE BUT DO NOT
   * CHANGE THE FUNCTION NAME AND DO NOT MAKE THIS FUNCTION STATIC
   */
  /**
   * This function finds and prints the most dissimilar pair of users in the
   * userUserMatrix.
   * 
   * @param COMPLETE THIS IF NEEDED
   * @param COMPLETE THIS IF NEEDED
   * @return COMPLETE THIS IF NEEDED
   */
  public void findAndprintMostDissimilarPairOfUsers() {
    // get the unique array of similarity scores
    String[] similarityScores = getAboveLowerTriangularMatrix(userUserMatrix);
    // sort the array
    Arrays.sort(similarityScores);
    // find the least similar score and the users corresponding to the scores
    String leastSimilar = similarityScores[0];
    // find just the least similar score
    String leastSimilarScore =
        leastSimilar.substring(0, leastSimilar.indexOf(' '));
    // find the second least similar score and the users corresponding to the
    // scores
    String secondleastSimilar = similarityScores[1];
    // find just the second least similar score
    String secondleastSimilarScore =
        secondleastSimilar.substring(0, secondleastSimilar.indexOf(' '));
    // check if the least and second least similar scores are the same
    if (leastSimilarScore.equalsIgnoreCase(secondleastSimilarScore)) {
      // if they are the same initialize a string to store all the users that
      // have the same similarity scores
      String users = "";
      // check all the strings in the unique array
      for (String string : similarityScores) {
        // check if the similarity scores are the same
        if (string.contains(leastSimilarScore)) {
          // if the scores are the same add the users to the users string
          // start a new line
          users += string.substring(string.indexOf(' ') + 1) + ",\n";
        }
      }
      // remove the last comma
      String allUsers = users.substring(0, users.length() - 2);
      // print the opening statement
      System.out.println("The most dissimilar pairs of users from above "
          + "userUserMatrix are: ");
      // print the users with the least similar scores
      System.out.println(allUsers);
      // print the least similar score
      System.out.println("with similarity score of " + leastSimilarScore);
    } else {
      // print the opening statement
      System.out.println("The most dissimilar pairs of users from above"
          + " userUserMatrix are: ");
      // print the users with the least similar score
      System.out.println(leastSimilar.substring(leastSimilar.indexOf(' ') + 1));
      // print the least similar score
      System.out.println("with similarity score of " + leastSimilarScore);
    }
  }
}