package fom;

/**
 * 需求： 一个银行账户5000块，两夫妻一个拿着 存折，一个拿着卡，开始取钱比赛，每次只能取一千块，要求不准出现线程安全问题。
 */
class BankThread extends java.lang.Thread{
    static int count=5000;
    public BankThread(String name){
        super(name);
    }



    @Override
    public void run() {
        while (true){
            synchronized ("锁") {
                if (count > 0) {
                    System.out.println(java.lang.Thread.currentThread().getName() + "取走了100元，余额" + (count - 100));
                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count=count-100;
                } else {
                    System.out.println("账户已无钱");
                    break;
                }
            }
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        BankThread thread1=new BankThread("丈夫");
        BankThread thread2=new BankThread("妻子");
        thread1.start();
        thread2.start();

    }
}
