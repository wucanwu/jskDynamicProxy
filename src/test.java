public class test {
    public static void main(String[] args) {
        MyNumImple myNum = new MyNumImple();
        MyNum poxy = (MyNum) new MyNumPoxy().getInstance(myNum);
        int a = (Integer)poxy.add(1,2);
        System.out.println(a);
    }
}
