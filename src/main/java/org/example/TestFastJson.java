package org.example;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestFastJson {
    /**
     * java对象转 json字符串
     */
    @Test
//    @Ignore
    public void objectTOJson() {
        DocumentQueryBaseRequestVO requestVO = new DocumentQueryBaseRequestVO();
        requestVO.setDocumentId("7508408027929236571");
        requestVO.setRequestType(0);
        requestVO.setRootDocumentId("81866456977844095");
        requestVO.setBizLineId("1");

        String paramJson = JSON.toJSONString(requestVO);
        System.out.println("ApiMetaSnapshotQueryParam转json:" + paramJson);
    }

//        //简单java类转json字符串
//        User user = new User("dmego", "123456");
//        String UserJson = JSON.toJSONString(user);
//        System.out.println("简单java类转json字符串:"+UserJson);
//
//        //List<Object>转json字符串
//        User user1 = new User("zhangsan", "123123");
//        User user2 = new User("lisi", "321321");
//        List<User> users = new ArrayList<User>();
//        users.add(user1);
//        users.add(user2);
//        String ListUserJson = JSON.toJSONString(users);
//        System.out.println("List<Object>转json字符串:"+ListUserJson);
//
//        //复杂java类转json字符串
//        UserGroup userGroup = new UserGroup("userGroup", users);
//        String userGroupJson = JSON.toJSONString(userGroup);
//        System.out.println("复杂java类转json字符串:"+userGroupJson);

    @Test
    public void learnStream() {
//      初始化一个list
        List<Integer> nums = Arrays.asList(1,2,3);
//      打印list
//        System.out.println(nums);
//        System.out.println(nums.toString());
//      如果对变量没操作直接打印，不需要写参数
//        nums.forEach(System.out::println);
//      带参数打印
//        nums.forEach(s -> System.out.println(s+1));

        List<Integer> res = nums.stream().filter(num -> num.equals(2)).collect(Collectors.toList());
        System.out.println(res);

    }

    @Test
    public void testCodeExecutionTime() {
        Long singleBeginTime = System.nanoTime();
        int a[] = IntStream.range(0,1_000_000).filter(num -> num % 2 == 0).toArray();
        Long singleEndTime = System.nanoTime();
        Long mutipleBeginTime = System.nanoTime();
        int b[] = IntStream.range(0,1_000_000).parallel().filter(num -> num % 2 == 0).toArray();
        Long mutipleEndTime = System.nanoTime();
        Long singleTime = singleEndTime - singleBeginTime;
        Long mutipleTime = mutipleEndTime - mutipleBeginTime;
        double gap = (double) mutipleTime / singleTime;
        System.out.println("singleTime = " + singleTime);
        System.out.println("mutipleTime = " + mutipleTime);
        System.out.println("gap = " + gap);




    }

}
