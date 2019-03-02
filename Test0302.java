/*
 * �������ְ������������ַ��� I�� V�� X�� L��C��D �� M��
�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��

ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������

I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

ʾ�� 1:
����: 3
���: "III"

ʾ�� 2:
����: 4
���: "IV"

ʾ�� 3:
����: 9
���: "IX"

ʾ�� 4:
����: 58
���: "LVIII"
����: L = 50, V = 5, III = 3.

ʾ�� 5:
����: 1994
���: "MCMXCIV"
����: M = 1000, CM = 900, XC = 90, IV = 4.
*/
package lianxi0302;

public class Test0302 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int num = 973;
		String s = S.intToRoman(num);
		System.out.println(s);
	}
}

class Solution {
    public String intToRoman(int num) {
          String res = "";
        if(num >= 1000){
            int cnt = num / 1000;
            for(int i = 0; i < cnt; ++i){
                res += "M";
            }
            num -= cnt * 1000;
        }
        if(num >= 900){
            res += "CM";
            num -= 900;
        }
        if(num >= 500){
            res += "D";
            num -= 500;
        }
        if(num >= 400){
            res += "CD";
            num -= 400;
        }
        if(num >= 100){
            int cnt = num / 100;
            for(int i = 0; i < cnt; ++i) {
                res += "C";
            }
            num -= cnt * 100;
        }
        if(num >= 90){
            res += "XC";
            num -= 90;
        }
        if(num >= 50){
            res += "L";
            num -= 50;
        }
        if(num >= 40){
            res += "XL";
            num -= 40;
        }
        if(num >= 10){
            int cnt = num / 10;
            for(int i = 0; i < cnt; ++i){
                res += "X";
            }
            num -= cnt * 10;
        }
        if(num >= 9){
            res += "IX";
            num -= 9;
        }
        if(num >= 5){
            res += "V";
            num -= 5;
        }
        if(num >= 4){
            res += "IV";
            num -= 4;
        }
        if(num >= 1){
            int cnt = num / 1;
            for(int i = 0; i < cnt; ++i){ 
            res += "I";
            }
        }
        return res;
    
    }
}