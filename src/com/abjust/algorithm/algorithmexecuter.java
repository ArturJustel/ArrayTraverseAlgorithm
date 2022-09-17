package ArrayTraverseAlgorithm.src.com.abjust.algorithm;

/*
 *  The following class executes the algorithm.
 */
public class algorithmexecuter {
    public static void main(String[] args) {
        final int[][] inputArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        traversealgorithm.patternTraverser(inputArray, 0, inputArray.length, 0, inputArray[0].length);
    }
}
