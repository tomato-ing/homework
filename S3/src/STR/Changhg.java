package STR;
//import java.util.*;
public class Changhg {
	public static void main(String[] args) {
		String str=new String("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ�����������д仪ҡҡ�и�ֹ�������Ű����������������κ���ת��ü��ǰ������ί�������մ��̽�ȸ��ɦͷ��������Ȳ��ûؿ�Ѫ��������ư�ɢ����������ջ�����ǽ������ɽ������������޹���ɫ����ˮ����ɽ��ʥ������ĺĺ���й���������ɫҹ�����峦����������ת����Ԧ���˳������ȥ\r" );
		int x=0;
		int y=7;
		int z=7;
		int w=14;
		int t;
		int r;
		int o=0;
		String a[]=new String[52];
		for(int i=0;i<52;i=i+2) {
			a[i]=str.substring(x,y);
			t=i+1;
			a[t]=str.substring(z,w);
			System.out.print(a[i]+"��"+a[t]+"��\n");
			x=x+14;
			y=y+14;
			z=z+14;
			w=w+14;
			}
		for (int i=0;i<str.length();i++) {
			r=str.indexOf("5");
			if (r==-1)
				break;
			str=str.substring(r+1,str.length());
			o++;
		}
		System.out.println("ͳ�Ƶ��ֳ��ֵĸ���Ϊ��"+o);
		/*try {
			t.A();
				
		}
		catch(E e) {
			   System.err.println("�����쳣�� " + e.toString()); 
			   e.printStackTrace(); 

		}
}
}*/
	
	
			//System.out.println("ͳ�Ƶ��ֳ��ֵĸ���Ϊ��"+o);
	Try k=new Try(); 
	try {
		
		k.A();}
		//System.out.println();
			
	catch(Exception e) {
		   System.err.println("�����쳣�� " ); 
		   e.printStackTrace(); 

	}
}
}







	