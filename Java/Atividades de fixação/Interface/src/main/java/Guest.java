public class Guest implements User {

    public static void main(String[] args) {

        Guest guest = new Guest();

        if(guest.isAuthorized("We are Atos")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Try again");
        }
    }


    @Override
    public boolean isAuthorized(String word) {
        boolean status = false;
        if(word.equals("We are Atos")) {
            status = true;
        }
        return status;
    }
}
