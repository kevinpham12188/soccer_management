package com.example.soccermanagementpage.utils;

import java.util.List;
import java.util.Objects;

public class Utils {


    public  static  Boolean isListNull (List<Object> objects){
        if (objects == null || objects.isEmpty()) {
            return true;
        }
            return false;
    }

    public  static  Boolean isStringNull (String content){
        if (content == null || content.isEmpty()) {
            return true;
        }
        return false;
    }
}
