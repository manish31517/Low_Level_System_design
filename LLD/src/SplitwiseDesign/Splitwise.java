package SplitwiseDesign;

import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.Expense.SplitType;
import SplitwiseDesign.Group.Group;
import SplitwiseDesign.Group.GroupController;
import SplitwiseDesign.User.User;
import SplitwiseDesign.User.UserController;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Splitwise {
    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;
    Splitwise(){
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo() throws  Exception{
        setUpUserAndGroup();

        //Step1: add members to the group
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U1002"));
        group.addMember(userController.getUser("U1003"));

        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"),300);
        Split split2 = new Split(userController.getUser("U1002"),300);
        Split split3 = new Split(userController.getUser("U1003"),300);

        splits.add(split1);
        splits.add(split2);
        splits.add(split3);

        group.createExpense("Exp1001","BreakFast", 900,splits, SplitType.EQAUL,userController.getUser("U1001"));

        for(User user : userController.getAllUsers()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    public void setUpUserAndGroup(){
        addUserToSplitwiseApp();
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001","Outing With Friend",user1);

    }

    public void addUserToSplitwiseApp(){
        User user1 = new User("U1001", "User1");
        User user2 = new User("U1002", "User2");
        User user3 = new User("U1003", "User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
