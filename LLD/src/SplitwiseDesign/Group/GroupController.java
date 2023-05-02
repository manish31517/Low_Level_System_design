package SplitwiseDesign.Group;

import SplitwiseDesign.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    public  GroupController(){
        groupList = new ArrayList<>();
    }

    public void createNewGroup(String groupid, String groupName, User createdByUser){

        Group group = new Group();
        group.setGroupId(groupid);
        group.setGroupName(groupName);
        group.addMember(createdByUser);
        groupList.add(group);
    }

    public  Group getGroup(String groupId){
        for(Group group : groupList){
            if(group.getGroupId().equals(groupId)){
                return group;
            }
        }
        return null;
    }
}
