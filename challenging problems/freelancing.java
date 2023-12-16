import java.util.*;

public class freelancing {


    public static void main(String[] args) {
        int numprojects = 3;
//        List<Integer> projectId = new ArrayList<>();
//        List<Integer> bid = new ArrayList<>();
//        projectId.add(0);
//        projectId.add(1);
//        projectId.add(0);
//        projectId.add(1);
//        projectId.add(1);
//
//        bid.add(4);
//        bid.add(74);
//        bid.add(47);
//        bid.add(744);
//        bid.add(7);
        Integer [] projectIds = {2,0,1,2};
        Integer [] bids = {8,7,6,9};
        List<Integer> projectId = Arrays.asList(projectIds);
       List<Integer> bid = Arrays.asList(bids);



       long result  =  minCost(numprojects,projectId,bid);
        System.out.println("Result is: " + result);
    }


    public static long minCost(int numProjects, List<Integer>projectId, List<Integer>bid) {
        long outputCost = 0;

        HashMap<Integer, String> projectAndBidsMapping = new HashMap<>();

        for (int i = 0; i < projectId.size(); i++) {
            if (projectAndBidsMapping.containsKey(projectId.get(i))) {
                String bidValue = projectAndBidsMapping.get(projectId.get(i));
                String multipleBidValues = bidValue + "_" + bid.get(i);
                projectAndBidsMapping.put(projectId.get(i), multipleBidValues);
            } else {
                projectAndBidsMapping.put(projectId.get(i), String.valueOf(bid.get(i)));
            }

        }
        System.out.println(projectAndBidsMapping);
        if (projectAndBidsMapping.size() == numProjects) {
            for (Map.Entry<Integer, String> entry : projectAndBidsMapping.entrySet()) {
                String bids = entry.getValue();
                String[] multipleBids = bids.split("_");
                int minBid = Integer.parseInt(multipleBids[0]);
                for (int i = 0; i < multipleBids.length; i++) {
                    int currentBid = Integer.parseInt(multipleBids[i]);
                    if (currentBid < minBid) {
                        minBid = currentBid;
                    }

                }
                outputCost += minBid;
            }
        } else {
            return -1;
        }

        System.out.println(outputCost);

        return outputCost;
    }

}
