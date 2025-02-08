public class Staff {
    private static int name=25;
    private int uniqueId;
    private int telNum;
    {
        uniqueId=++name;
    }

    public Staff(int telNum) {

        this.telNum = telNum;
    }

    public int getUniqueId() {

        return uniqueId;
    }

    public int getTelNum() {

        return telNum;
    }
}
