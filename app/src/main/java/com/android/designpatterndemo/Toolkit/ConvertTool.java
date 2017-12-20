package com.android.designpatterndemo.Toolkit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class ConvertTool {

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+"); //[0-9]*
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    public static int String2Int(String numString) throws Exception{
        int ret = 0;

        if(isNumeric(numString) == false){
            throw new Exception("String include not number char");
        }
        else{
            ret = Integer.parseInt(numString, 10);
        }

        return ret;
    }
}
