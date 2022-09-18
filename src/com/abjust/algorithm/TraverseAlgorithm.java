package ArrayTraverseAlgorithm.src.com.abjust.algorithm;

/*
 *  The following class contains an recursive algorithm logic
 *  that is able to represent a 2d array input in the clockwise pattern.
 */
public class TraverseAlgorithm {
    private static String ANSWER = "";
    /*
     *  The following method takes a 2d array and 4 parameters as an input
     *  and prints its values in the clockwise pattern.
     */
    public String patternTraverser(int[][] a2dArray,int aSr, int aEr, int aSc, int aEc){

        if(aSr>=aEr || aSc>=aEc) //check if the values are not out of 2d array boundaries.
        {   
            String answer = ANSWER.substring(0, ANSWER.length()-2); // remove last ", " from the answer.
            ANSWER = ""; // clean the global answer string.
            return answer; 
        }

            for(int i = aSr;i<aEc;i++) //determine the top row and add it to the answer string.
            {
                ANSWER=ANSWER+a2dArray[aSr][i]+",";
            }
            ANSWER=ANSWER+" ";
            aSr++;

            if(aSr<aEr-1)
            {
                for(int i=aSr ;i<aEr;i++) //determine the right column and add it to the answer string.
                {
                    ANSWER=ANSWER+a2dArray[i][aEc-1]+",";
                }
                ANSWER=ANSWER+" ";
                aEc--;   
            }

            if(aEr-1>aSc) //determine the left column and add it to the answer string.
            {
                for(int i=aEc-1;i>=aSc;i--) //determine the bottom row and add it to the answer string.
                {
                    ANSWER=ANSWER+a2dArray[aEr-1][i]+",";
                }
                ANSWER=ANSWER+" ";
                aEr--;
            }

            if(aEr-1>aSc) //determine the left column and add it to the answer string.
            {
                for(int i=aEr-1 ;i>=aSr;i--)
                {
                    ANSWER=ANSWER+a2dArray[i][aSc]+",";
                }
                ANSWER=ANSWER+" ";
                aSc++;
            } 
            return patternTraverser(a2dArray,aSr,aEr,aSc,aEc);
        }
}
