class Hello {
    public static void main(String args[]){
    System.out.println("Hello World!!");

    int a = 5;
    int b = 6;
    System.out.println(a+b);


    /**************************/
     // "byte" datatype can only store from -128 to 127... so any value greater then 127 is considered as int.
        byte r = 127;
        int s = r;
        System.out.println(r);
        System.out.println(s);

        int c = 16;
        byte k = (byte)c;       //explicit typeconversion
        System.out.println(k);


        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);

        ///type promotion
        byte p = 10;
        byte q = 30;
        int result = p * q;//though p and q are byte datatype, but their result is out of the range of the byte,so we can store the result into the integer, its type promotion..

        System.out.println(result);



    /******************************/
        int x = 6;
        int y = 8;
    
        System.out.println(x<y); //relational operator

 

    }
}