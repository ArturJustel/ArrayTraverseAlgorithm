package ArrayTraverseAlgorithm.src.com.abjust.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ArrayTraverseAlgorithm.src.com.abjust.algorithm.TraverseAlgorithm;

/*
 *  The follwing class contais tests for {@link TraverseAlgorithm}.
 */
public class TraverseAlgorithmTest {

    /*
     *  The following test verifies the correctness of the algorithm
     *  with 4x4 matrix size.
     */
    @Test public void testPatternTraverserFor4x4Matrix() {
        //Arrange 
        int[][] testInput = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        String expectedResult = "1,2,3,4, 8,12,16, 15,14,13, 9,5, 6,7, 11,10";
        int eR = testInput.length;
        int eC = testInput[0].length;
        //Act
        TraverseAlgorithm testAlgorithm = new TraverseAlgorithm();
        String testResult =testAlgorithm.patternTraverser(testInput, 0, eR, 0, eC);
        //Assert
        assertEquals(4, eR);
        assertEquals(4, eC);
        assertEquals(expectedResult,testResult);
    }

    /*
     *  The following test verifies the correctness of the algorithm
     *  with 4x5 matrix size.
     */
    @Test public void testPatternTraverserFor4x5Matrix() {
        //Arrange 
        int[][] testInput = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        String expectedResult = "1,2,3,4, 8,12,16,20, 19,18,17, 13,9,5, 6,7, 11,15, 14, 10";
        int eR = testInput.length;
        int eC = testInput[0].length;
        //Act
        TraverseAlgorithm testAlgorithm = new TraverseAlgorithm();
        String testResult =testAlgorithm.patternTraverser(testInput, 0, eR, 0, eC);
        //Assert
        assertEquals(5, eR);
        assertEquals(4, eC);
        assertEquals(expectedResult,testResult);
    }

        /*
     *  The following test verifies the correctness of the algorithm
     *  with 5x4 matrix size.
     */
    @Test public void testPatternTraverserFor5x4Matrix() {
        //Arrange 
        int[][] testInput = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        String expectedResult = "1,2,3,4,5, 10,15,20, 19,18,17,16, 11,6, 7,8,9, 14,13,12";
        int eR = testInput.length;
        int eC = testInput[0].length;
        //Act
        TraverseAlgorithm testAlgorithm = new TraverseAlgorithm();
        String testResult =testAlgorithm.patternTraverser(testInput, 0, eR, 0, eC);
        //Assert
        assertEquals(4, eR);
        assertEquals(5, eC);
        assertEquals(expectedResult,testResult);
    }

    @Test public void testPatternTraverserFor5x5Matrix() {
        //Arrange 
        int[][] testInput = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        String expectedResult = "1,2,3,4,5, 10,15,20,25, 24,23,22,21, 16,11,6, 7,8,9, 14,19, 18,17, 12, 13";
        int eR = testInput.length;
        int eC = testInput[0].length;
        //Act
        TraverseAlgorithm testAlgorithm = new TraverseAlgorithm();
        String testResult =testAlgorithm.patternTraverser(testInput, 0, eR, 0, eC);
        //Assert
        assertEquals(5, eR);
        assertEquals(5, eC);
        assertEquals(expectedResult,testResult);
    }
}
