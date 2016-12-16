package Jarvis92;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Singleton {
    public static void main(String[] args)
    {
        SingletonDemo.getInstance();


    }

}
//饿汉式1
 class SingletonDemo
 {
     private SingletonDemo(){}
     private static SingletonDemo s=new SingletonDemo();
     public static SingletonDemo getInstance()
     {
         return s;
     }

 }
//饿汉式2
class SingletonDemo2
{
    private SingletonDemo2(){}
    public static final SingletonDemo2 s=new SingletonDemo2();
    public static SingletonDemo2 getInstance()
    {
        return s;
    }

}





 //懒汉式
class lazyLoad
 {
     private lazyLoad(){}
     private static lazyLoad ll=null;
     public static lazyLoad getInstance()
     {
         if(ll==null)
            ll=new lazyLoad();

         return ll;
     }


 }