import java.util.ArrayList;
import java.util.List;

public class MatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int index = 0;
        for (List l: items)
        {
            switch (ruleKey)
            {
                case "type": index = 0; break;
                case "color": index = 1; break;
                case "name": index = 2; break;
                default: index = -1;
            }
            if(l.get(index).equals(ruleValue))
                result += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> subList1 = new ArrayList<String>();
        subList1.add("phone");
        subList1.add("blue");
        subList1.add("pixel");

        List<String> subList2 = new ArrayList<String>();
        subList2.add("computer");
        subList2.add("silver");
        subList2.add("lenovo");

        List<String> subList3 = new ArrayList<String>();
        subList3.add("phone");
        subList3.add("gold");
        subList3.add("iphone");

        List<List<String>> items = new ArrayList<List<String>>();
        items.add(subList1);
        items.add(subList2);
        items.add(subList3);

        System.out.println(items);
        int output = countMatches(items,"color", "silver");
        System.out.println("Output: " + output);
    }
}
