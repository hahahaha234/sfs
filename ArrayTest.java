package string;

import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args){
	     char[][] arr=new char[32][7];
	     String s="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
	     for(int i=0;i<arr.length;i++){
	      for(int j=0;j<arr[i].length;j++){
	       arr[i][j]=s.charAt(i*7+j);
	      }
	     } 
	        for(int i =0; i <arr.length;i++){   //控制行数
	            for(int j = 0;j<arr[i].length; j++){  //控制列数
	                System.out.print(arr[i][j]);   //输出每个元素的值
	                }
	            //判断并输出标点符号，下标为0或者2的输入逗号，其他输出句号
	            if(i%2==0){
	                System.out.println(',');   
	            }
	            else 
	             System.out.println('。');
	            }   
	      
	        System.out.println("请输入字符：");
	        Scanner input=new Scanner(System.in);
	        String b=input.next();
	              countString(s,b);
	             }
	private static void countString(String s,String a) {
	     int length=s.length();
	     int count = 0;
	     int k = 0;
	     try {
	     for(int i= 0; i<=length; i++){
	         if(s.indexOf(a) == (i-k)){
	             s = s.substring(i-k+1,s.length());
	             count++;
	             k = i+1;
	         }
	     }}
	     catch(Exception e)
	        {
	            e.printStackTrace();
	            System.out.println("输入有误！");
	        }
	     
	     System.out.println(a+"出现的次数为"+count+"次");
	   }
	    }
	 

