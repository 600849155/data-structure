package simgleton_pattern;

public class Minister {
    public static void main(String[] args) {
        for(int i=0 ;i<3;i++) {
            DlcLazyEmperor emperor = DlcLazyEmperor.getDlcLazyEmperor();
            emperor.say();
        }
        //三天见的皇帝都是同一个人
    }
}
