package test_hm01;

public class Manage {
	public String Output(int i)//aΪ������Ǯ����֪��1��50,1��20,1��10,2��5��3��1
	{
		int a = 0;//�ó�50������
		int b = 0;//�ó�20������
		int c = 0;//�ó�10������
		int d = 0;//�ó�5������
		int e = 0;//�ó�1������
		boolean k = true;
		String str = "";
		if(i <= 0)
		{
			k = false;
		}
		while(i > 3)
		{
			if(i >= 50)
			{
				i = i-50;
				a++;
			}
			else if(i >= 20)
			{
				i = i -20;
				b++;
			}
			else if(i >= 10)
			{
				i = i -10;
				c++;
			}
			else if(i >= 5)
			{
				i = i-5;
				d++;
			}
			else
			{
				k = false;
				break;
			}
		}
		e = i;
		
		
		if(k == false) 
		{
			str = "������ҵ�֪ʶ��Χ������";
		}
		else
		{
			str = "�ó�" + a + " ��50," + b + " ��20��" + c + " ��10��" + d + " ��5�� " + e + " ��1"; 
		}
		return str;
	}
}
