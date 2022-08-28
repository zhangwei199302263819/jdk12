package com.新工程;

/**
 * @author 张伟
 * @create 2022/8/18
 * 创建者按照心情创造世界，时间=信息=金钱
 */
public interface JDK11Interface {
/**
 *
 *
 * */
void  add();
//接口中设置普通方法来设置方法体了
//默认和静态方法
default void get(){
    System.out.println("滚");
}
static void staticDel(){
    System.out.println("staticDel");
}

}
