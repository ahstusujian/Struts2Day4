package demo1;

import com.opensymphony.xwork2.ActionSupport;

//测试拦截器
public class Demo1Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Action的方法执行了");
        return NONE;
    }
}
