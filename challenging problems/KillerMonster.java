import java.util.ArrayList;
import java.util.Collections;

public class KillerMonster {

    public static void main(String[] args) {
        //int minSize = minLenOfGrp("PPPPPP@PPP@PP$PP");

        int minSize = minLenOfGrp("PPP$PPPP@PPP@PPPP$PPPP");

       // int minSize = minLenOfGrp("PPPPPP@PPP@PP$PP");

       // int minSize = minLenOfGrp("PPPPPP@PPP@PP$PP");
        System.out.println(minSize);
    }

    public static int minLenOfGrp(String input){

        String[] groups = input.split("@");
        ArrayList<Integer> finalGroupList = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            String currentGrpString = groups[i];
            String[] tempGroups = currentGrpString.split("\\$");
            for (int j = 0; j < tempGroups.length; j++) {
                String currTempGrp = tempGroups[j];
                int lenOfGrp = currTempGrp.length();
                finalGroupList.add(lenOfGrp);

            }
        }

        return Collections.min(finalGroupList);
    }
}
