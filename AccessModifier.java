public class AccessModifier {
    public static void main(String args[]){
        Bank myAcc = new Bank();
        myAcc.username = "Namandeep";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefgh");
        myAcc.setPassword("nnmnmn");
    }
}
class Bank{
    public String username;
    private String password;
    public void setPassword(String newPass){
        password = newPass;
        System.out.println(password);
    }
}