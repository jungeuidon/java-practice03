package prob04;

import prob01.StringUtil;

// concat 문제 
public class StringUtilTest {
	//
	public static void main(String[] args) {
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        
        String resultStr = StringUtil.concatenate( strArr );

        System.out.println( "결과 문자열 : " + resultStr ); 
	}

}
