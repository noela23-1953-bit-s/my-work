public class furniture {
    public static void main(String[] args) {
        double book=1000;
        long book_long=(long) book;
        System.out.println("double to long is " + book);

        double chair=78;
        int chair_int=(int)chair;
        System.out.println("double to integer is " + " "+ chair);

        byte pot=87;
        int pot_int=(int)pot;
        System.out.println("byte to integer is " + " "+ pot);

        int cat=243;
        String cat_String= Integer.toString(cat);
        System.out.println("Integer to String is " + cat);

        double me=600;
        String me_String=Double.toString(me);
        System.out.println("Double to String is " + me);

        long com=75;
        String com_String=Long.toString(com);
        System.out.println("long to String is " + com);

        float pink=709;
        String pink_String=Float.toString(pink);
        System.out.println("Float to String is " + pink);

        String yam="100";
        int co_int= Integer.parseInt(String.copyValueOf(yam.toCharArray()));
        System.out.println("String to Integer is "+ " " + yam);

        String re="300";
        double re_double= Double.parseDouble(String.copyValueOf(re.toCharArray()));
        System.out.println("String to Double is "+ " " +re);

        String kim="638";
        long kim_long= Long.parseLong(String.copyValueOf(kim.toCharArray()));
        System.out.println("String to Long is " + kim);

        String hike="66";
        float hike_float= Float.parseFloat(String.copyValueOf(hike.toCharArray()));
        System.out.println("String to float is " + hike);










    }
}
