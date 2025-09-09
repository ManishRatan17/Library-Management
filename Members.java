package Library;


import java.util.LinkedHashMap;
import java.util.Map;

public class Members {
    int i=0;
    Map<String, String> members = new LinkedHashMap<>();

    public void registerMember(String name) {
        String id = "M" + members.size();
        members.put(id, name);
        System.out.println("Member "+ name+" registered "+"ID: "+id);
    }

    public void printMembers() {
        for (Map.Entry<String, String> entry : members.entrySet()) {
            i++;
            System.out.printf("%d. %s  -  %s%n",i,entry.getKey(),entry.getValue());
        }
    }


}
