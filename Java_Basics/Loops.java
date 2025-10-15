public class Loops {
    public static void main(String args[])
    {
/**************WHILE LOOP********************/
        int i = 0;

        while (i < 5) {
            System.out.println(i);
            int j=0;
            while(j<4){
                System.out.println("HI");
                j++;
            }
            i++;
        }

/****************DO-WHILE LOOP**************** */
        int k=1;
        do{
            System.out.println("Shuvo");
            k++;
        }while(k<=4);

/**************FOR LOOP******************* */
        for(int a=0; a<5; a++){
            System.out.println("Doing some easy staff in for loop.");
        }




    }
}
