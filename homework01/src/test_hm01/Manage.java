package test_hm01;

public class Manage {
	public String Output(int i)//a为给出的钱，已知有1个50,1个20,1个10,2个5，3个1
	{
		int a = 0;//拿出50的数量
		int b = 0;//拿出20的数量
		int c = 0;//拿出10的数量
		int d = 0;//拿出5的数量
		int e = 0;//拿出1的数量
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
			str = "这就在我的知识范围以外了";
		}
		else
		{
			str = "拿出" + a + " 个50," + b + " 个20，" + c + " 个10，" + d + " 个5， " + e + " 个1"; 
		}
		return str;
	}
}
