package com.taven.app.javabase;

public class BaseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//基础说明

		/**
		 * 变量标识符
		 * 
		 * 必须以字母、下划线（_）、美元符号（$）开头，后面可跟任意数目的字母、数字、下划线和美元符号
		 * 
		 * 标识符中不能包含空格
		 * 标识符不能为Java关键字和保留字
		 * 
		 * 变量区分大小写
		 * 
		 * ----------------------------------------------------------------------
		 * Java是强类型语言
		 * 
		 * 数据类型分两种：
		 * 1、基本类型（值类型）
		 * 2、引用类型
		 * 
		 * null 为一个空类型，属于引用类型，因此不能把null赋值给基本类型的变量
		 * 
		 * 基本类型的长度：
		 * （boolean：1位、byte：1个字节、short：2个字节、int：4个字节、long：8个字节、char：2个字节、float：4个字节、double：8个字节）
		 * 
		 * 长度的说明：
		 * 1个字节(byte)=8位(bit)，也就是8位二进制数，即 11110000
		 * 
		 * 1byte=1字节 即 1byte=8bits,两者换算是1：8的关系
		 * 
		 * 与传输速度有关的b一般指的是bit，与容量有关的b一般指的是byte，1byte(字节)=8bit(位) 。
		 * 
		 * 
		 * 
		 * byte 可表数范围：-128~127 (即 -2的7次方 ~ 2的7次方减1)
		 * short 可表数范围：-32768~32767
		 * int 可表数范围：-2147483648~2147483648
		 * long 可表数范围：-9223372036854775808~9223372036854775807
		 * 
		 * 注意：
		 * 所有数字在计算机底层都是以二进制形式存在的，但是计算机是以补码形式保存整数。
		 * 
		 * 
		 * 补码转二进制数，再转十进制数过程：
		 * 
		 * 先将计算机中保存的一个补码先要转为反码，反码再转成原码，
		 * 这时原码就是二进制数，然后再把二进制转为十进制数，即可。
		 * 
		 * 补码计算规则：
		 * 1、正数的补码和原码完全相同。
		 * 2、负数的补码是其反码加1。
		 * 3、反码是对原码按位取反，只是最高位（符号位）保持不变。
		 * 4、最高位为符号位，当为1时，表明他是一个负数（二进制数默认占32位，其中第32位是符号位）。
		 * 
		 * 
		 * ----------------------------------------------------------------------
		 * 
		 * 
		 * //以0开头的整数常量是8进制的整数
		 * int octalValue = 013;
		 * 
		 * //以0x或0X开头的整数常量是16进制的整数
		 * int hexValue1 = 0x13;
		 * int hexValue2 = 0XaF;
		 * 
		 * 
		 * ----------------------------------------------------------------------
		 * 
		 * 字符型
		 * 
		 * 字符常量必须使用单引号（'）括起来。
		 * 
		 * 直接使用Unicode值来表示字符型常量，格式是 '\\uXXXX'，其中 XXXX 代表一个16进制的整数（注意格式中的反斜杠只有一个）
		 * 
		 * //直接指定单个字符作为字符常量
		 * char aChar = 'a';
		 * //使用转义字符来作为字符常量
		 * char enterChar = '\r';
		 * //使用Unicode编码值来指定字符常量
		 * char ch = '\u9999';
		 * // 定义一个'疯'字符常量
		 * char zhong = '疯';
		 * // 直接将一个char变量当成int类型变量使用
		 * int zhongValue = zhong;
		 * //直接把一个0～65535范围内的int整数赋给一个char变量
		 * char c = 97;
		 * 
		 * 
		 * ----------------------------------------------------------------------
		 * 
		 * 
		 * 浮点型
		 * 
		 * 常用的浮点型有两种：
		 * double 类型代表双精度浮点数。
		 * float 类型代表单精度浮点数。
		 * 
		 * 使用二进制数据的科学计数法来表示浮点数，因此可能不能精确表示一个浮点数，
		 * 如果开发者需要精确保存一个浮点数，可以考虑使用 BigDecimal 类。
		 * 
		 * 开发的过程中，你可以使用两种方式来表示浮点数：
		 * 十进制数形式：例如 5.12 、512.0 、.512
		 * 科学计数法形式：例如 5.12e2 或 5.12E2 (即 5.12乘以 10的二次方)
		 * 
		 * float af = 5.2345556f;
		 * //下面将看到af的值已经发生了改变
		 * System.out.println(af);
		 * double a = 0.0;
		 * double c = Double.NEGATIVE_INFINITY;
		 * float d = Float.NEGATIVE_INFINITY;
		 * //看到float和double的负无穷大是相等的。
		 * System.out.println(c == d);
		 * //0.0除以0.0将出现非数
		 * System.out.println(a / a);
		 * //两个非数之间是不相等的
		 * System.out.println(a / a == Float.NaN);
		 * //所有正无穷大都是相等的
		 * System.out.println(6.0 / 0 == 555.0/0);
		 * //负数除以0.0得到负无穷大
		 * System.out.println(-8 / a);
		 * //下面代码将抛出除以0的异常
		 * //System.out.println(0 / 0);
		 * 
		 * 
		 * ----------------------------------------------------------------------
		 * 
		 * 布尔型
		 * 
		 * boolean 类型的数值只能是 true 或 false
		 * (一般 0 为 true，其它为 false，但是在java中不能用数字来代表，其它类型的数据也不能直接转化成boolean类型)
		 * 
		 * 
		 * 
		 */

	}

}
