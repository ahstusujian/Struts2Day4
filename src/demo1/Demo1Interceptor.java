package demo1;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 拦截器,三种方法
 * 1.实现Interceptor接口,重写destroy,init,intercept方法
 * 2.继承AbstractInterceptor
 */
public class Demo1Interceptor extends AbstractInterceptor {

    //重写父类方法
    @Override
    public void init() {
        System.out.println("demo1Interceptor拦截器对象创建了...");
    }

    //intercept拦截的方法,ActionInvocation接口有实现类,管理了所有的拦截器,让拦截器递归调用,放行让下一个拦截器执行
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("Action方法执行前:拦截器执行了...");
        //执行下一个拦截器的方法
        String invoke = actionInvocation.invoke();
        System.out.println("Action方法执行后:拦截器执行了...");
        return invoke;
    }
}
