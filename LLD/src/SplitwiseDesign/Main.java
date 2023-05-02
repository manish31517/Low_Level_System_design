package SplitwiseDesign;

public class Main {
    public static void main(String[] args) {
        Splitwise splitwise = new Splitwise();
        try{
            splitwise.demo();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
