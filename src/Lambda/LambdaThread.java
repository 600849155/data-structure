package Lambda;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-3-17 14:55:09
 * @Modified by:
 */
public class LambdaThread {
    //1.1匿名内部类
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda!");
            }
        });


        //1.2 lambda expression
        new Thread(()->  System.out.println("hello lambda!")).start();

        //2.1匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello race1!");
            }
        };

        //2.2使用lambda expression
        Runnable race2 = ()-> System.out.println("hello race2");

        //直接调用run
        race1.run();
        race2.run();


    }




}
