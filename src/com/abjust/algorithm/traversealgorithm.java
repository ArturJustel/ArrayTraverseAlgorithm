package ArrayTraverseAlgorithm.src.com.abjust.algorithm;

/*
 *  The following class contains an recursive algorithm logic
 *  that is able to represent a 2d array input in the clockwise pattern.
 */
public class traversealgorithm {
    private static String ANSWER = "";
    /*
     *  The following method takes a 2d array and 4 parameters as an input
     *  and prints its values in the clockwise pattern.
     */
    public static void patternTraverser(int[][] a2dArray,int aSr, int aEr, int aSc, int aEc){

        if(aSr>=aEr || aSc>=aEc) //check if the values are not out of 2d array boundaries.
        {
            System.out.println(ANSWER.replaceAll(".$", "")); // remove last "," from the answer.
            return;
        }

        for(int i = 0;i<aEc;i++) //determine the top row and add it to the answer string.
        {
            ANSWER=ANSWER+a2dArray[aSr][i]+",";
        }
        aSr++;

        for(int i=aSr ;i<aEr;i++) //determine the right column and add it to the answer string.
        {
            ANSWER=ANSWER+a2dArray[i][aEc-1]+",";
        }
        aEc--;   

        if(aSr<aEr) //determine the bottom row and add it to the answer string.
        {
            for(int i=aEc-1;i>0;i--)
            {
                ANSWER=ANSWER+a2dArray[aEr-1][i]+",";
            }
            aEr--;
        }

        if(aSc<aEc) //determine the left column and add it to the answer string.
        {
        for(int i=aEr-1 ;i>aSr;i--)
        {
            ANSWER=ANSWER+a2dArray[i][aSc]+",";
        }
        aSc++;
        } 
        patternTraverser(a2dArray,aSr,aEr,aSc,aEc); //recursively call the method to finish uprocessed values.
    }
}
