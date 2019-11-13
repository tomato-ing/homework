package STR;
//import java.util.*;
public class Changhg {
	public static void main(String[] args) {
		String str=new String("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去\r" );
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
			System.out.print(a[i]+"，"+a[t]+"。\n");
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
		System.out.println("统计的字出现的个数为："+o);
		/*try {
			t.A();
				
		}
		catch(E e) {
			   System.err.println("发生异常： " + e.toString()); 
			   e.printStackTrace(); 

		}
}
}*/
	
	
			//System.out.println("统计的字出现的个数为："+o);
	Try k=new Try(); 
	try {
		
		k.A();}
		//System.out.println();
			
	catch(Exception e) {
		   System.err.println("发生异常： " ); 
		   e.printStackTrace(); 

	}
}
}







	