

public class StringBuffers {
    public static void main(String[] args) {
        
        //StringBuffer is used for mutable string, we can manipulate string with stringBuffer..
        StringBuffer sb = new StringBuffer("shuvo");

        ///below we are performing various operations on String.
        sb.append("presentable.");

        sb.insert(6, "is looking handsome and ");

        sb.setLength(50);

        System.out.println(sb);
}
}
