/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author gyw33188
 * @version $Id: test.java, v0.1 2017/6/16 gyw33188 Exp $$
 */
public class test {
    public static void main(String[] args){
        List<String> list = new ArrayList();
        List<String> list1 = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        for (String a:list) {
            list1.add(a);
        }
        System.out.println(1<<4);
    }
}