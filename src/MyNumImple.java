public class MyNumImple implements MyNum {

    @Override
    public int add(int x, int y) {
        System.out.println("进来了");
        return x+y;
    }


    @Override
    public int sub(int x, int y) {
        return x-y;
    }
}
