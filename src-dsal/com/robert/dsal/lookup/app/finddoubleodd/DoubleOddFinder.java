package com.robert.dsal.lookup.app.finddoubleodd;

// TODO ��û��ȫʵ�� �ο���http://blog.csdn.net/zzran/article/details/8108787
/**
 * 
 * 1. һ�������������һ��Ԫ������������Ԫ�ض��ǳ���ż���εġ�
 * ����������Ԫ�����ʣ�µ�ֵ�����Ǹ�����һ�ε�Ԫ�ء�
 * 
 * 2. һ�����������������Ԫ������������Ԫ�ض��ǳ���ż���εġ�
 * ����������Ԫ�����Ȼ���ҵ�һλΪ1�ģ��ֳ����飬����һ�ε�����Ԫ�����һ�飬Ȼ��ʹ��ǰһ����ķ�����ÿ����⡣
 * 
 * 3. һ�����������������Ԫ������������Ԫ�ض��ǳ���ż���εġ�
 * ������
 * 1. ��������Ԫ�����һ����һλΪ1��������λΪ1�ģ��ֳ�0��һ���1��һ�顣�����⣺���֤���أ���
 * 2. �ο�����Ŀ����ԣ���λ�����һ��ĳλ���Ϊ1����4�����, efgh, ����e��ʾ�����������ܵ�һ�飬��fgh��ʾһ��ȥһ�飬��������ȥ����һ��
 * a.000 = 0
 * b.011 = 0
 * c.101 = 0
 * d.110 = 0
 * 
 * e.111 = 1
 * f.001 = 1
 * g.010 = 1
 * h.100 = 1
 * 3.����������ܵ�һ���ˣ���ô����һ��Ͷ����ظ������֣������Ӧ��Ϊ0������Ԫ���������Ϊ0��
 * 4.�����fgh��һ����һ����һԪ�أ�����һ����������Ԫ�أ���ô���������Ϊ0���Ϳ��Ժ͵�3�������ˣ�Ȼ����һ����Ԫ��������������������������Ԫ������������ż�����������ֿ�������������1������2�ķ�����⡣
 * 3.1 ��������3����ô�����ظ��������־�����������Ԫ�������Ǳ߼����ݹ�ʹ�ò���3��4�������4���ҵ��⣬���������������ڵ�3��ʣ��3��Ԫ���ˣ�Ҳ���ǽ��ˡ�
 */
public interface DoubleOddFinder {
	public int[] findDoubleOdd(int[] seq);
}