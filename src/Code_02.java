import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/29 11:26
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02 {
    public static String change(String str, int start, int len) {
        StringBuffer stringBuffer = new StringBuffer(str.substring(start,start + len));
        stringBuffer.reverse();
        return str + str.substring(0,start) + String.valueOf(stringBuffer) + str.substring(start + len);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int start = input.nextInt();
            int len = input.nextInt();
            str = change(str,start,len);
        }
        System.out.println(str);
    }
}
