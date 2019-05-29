import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/28 21:53
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static BigDecimal multi(BigDecimal bigDecimal) {
        if (bigDecimal.equals(new BigDecimal(1))) {
            return new BigDecimal(1);
        }
        return bigDecimal.multiply(multi(bigDecimal.subtract(new BigDecimal(1))));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = multi(new BigDecimal(n)).toString();
        System.out.println(str);
        int sum = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == '0') {
                sum++;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
