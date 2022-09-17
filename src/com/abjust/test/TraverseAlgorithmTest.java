package ArrayTraverseAlgorithm.src.com.abjust.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ArrayTraverseAlgorithm.src.com.abjust.algorithm.TraverseAlgorithm;

/*
 *  The follwing class contais tests for {@link TraverseAlgorithm}.
 */
public class TraverseAlgorithmTest {

    private int[][] TEST_INPUT = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    private String EXPECTED_RESULT = "1,2,3,4, 8,12,16, 15,14,13, 9,5, 6,7, 11,10";

    /*
     *  The following test verifies the correctness of the algorithm.
     */
    @Test public void testPatternTraverser() {
        //Arrange 
        int eR = TEST_INPUT.length;
        int eC = TEST_INPUT[0].length;
        //Act
        TraverseAlgorithm testAlgorithm = new TraverseAlgorithm();
        String testResult =testAlgorithm.patternTraverser(TEST_INPUT, 0, eR, 0, eC);
        //Assert
        assertEquals(4, eR);
        assertEquals(4, eC);
        assertEquals(EXPECTED_RESULT,testResult);
    }
}
