import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理主要是来对目标对象进行增强的
 */
public class MyNumPoxy implements InvocationHandler {

    private Object object;
    //得到代理对象，返回为空，并不影响他调用方法
    public  Object getInstance(Object object)
    {
        this.object=object;
        Class cls = object.getClass();
        /**
         * 如果被代理的类实现了多个接口，第二个接口参数可以传多个接口，所以你可以强转为各个接口的类型，来调用各个方法
         */
        return (Object) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(System.currentTimeMillis());
        return method.invoke(object,args);

        //如果这里写return null，回报空指针异常
        //return null
    }
}
