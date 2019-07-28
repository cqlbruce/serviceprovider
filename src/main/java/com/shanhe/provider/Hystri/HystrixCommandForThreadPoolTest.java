package com.shanhe.provider.Hystri;

import com.netflix.hystrix.*;

import java.util.concurrent.TimeUnit;

public class HystrixCommandForThreadPoolTest extends HystrixCommand<String> {

    private final  String name ;

    public HystrixCommandForThreadPoolTest(String name){
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ThreadPool"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("testCommandKey"))
                .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("ThreadPoolTest"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(5000))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(3))
        );
        this.name = name ;
    }


    @Override
    protected String run() throws Exception {
        //模拟耗时操作
        TimeUnit.MICROSECONDS.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ": " + name);
        return name;
    }

    protected String getFallback(){
        return "----------fallback-------------" + name ;
    }

    public static void main(String[] args) {

    }
}
