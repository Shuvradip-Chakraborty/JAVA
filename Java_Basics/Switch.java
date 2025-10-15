public class Switch {
    public static void main(String[] args) {
        /****************SWITCH STATEMENT********************/

 //old syntax..
        int days = 3;

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        
            default:
                System.out.println("Enter valid date.");
                break;
        }

/*******SWITCH STATEMENT NEW SYNTAX*************** */

//uses a arrow for each cases and doesn't use break statement..
        String day = "Monday";

        switch(day){
            case "Monday", "Sunday" -> System.out.println("6am");

            case "Tuesday" -> System.out.println("7am");

            default -> System.out.println("7am");
        }
        
    }
}
