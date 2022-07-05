package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void method(){
        int[] arr = {0,4,5,2,6,9,3,1,7,8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8,9},arr);
    }

    @Test
    public void method1(){
        System.out.println("我是测试用例1");
        Assert.assertEquals("断言表达式",1,2);
    }

    @Test
    public void method2(){
        System.out.println("我是测试用例2");
    }

}

