package string;

import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args){
	     char[][] arr=new char[32][7];
	     String s="������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";
	     for(int i=0;i<arr.length;i++){
	      for(int j=0;j<arr[i].length;j++){
	       arr[i][j]=s.charAt(i*7+j);
	      }
	     } 
	        for(int i =0; i <arr.length;i++){   //��������
	            for(int j = 0;j<arr[i].length; j++){  //��������
	                System.out.print(arr[i][j]);   //���ÿ��Ԫ�ص�ֵ
	                }
	            //�жϲ���������ţ��±�Ϊ0����2�����붺�ţ�����������
	            if(i%2==0){
	                System.out.println(',');   
	            }
	            else 
	             System.out.println('��');
	            }   
	      
	        System.out.println("�������ַ���");
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
	            System.out.println("��������");
	        }
	     
	     System.out.println(a+"���ֵĴ���Ϊ"+count+"��");
	   }
	    }
	 

