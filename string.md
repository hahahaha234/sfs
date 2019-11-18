马海 大181 2018310986
实验四 字符串实验
一、实验目的
  掌握字符串String及其方法的使用
  掌握异常处理结构
二、业务要求
  内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

  1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
  2.	允许提供输入参数，统计古诗中某个字或词出现的次数
  3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
三、调试过程
  建立string类，利用char[][]=new char[32][7]在内存中开辟一个空间存储32行7列的数组对象，用int i =0; i <arr.length;i++来控制行数，int j = 0;j<arr[i].length; j++来控制列数，再System.out.print(arr[i][j]);来输出每个元素的值，利用if(i%2==0){System.out.println(','); } else System.out.println('。');}   判断并输出标点符号，下标为0或者2的输入逗号，其他输出句号。在统计词频时，利用count来计数，最后输出，并判断输入的字符串是否在已知的字符串里。
四、核心代码
char[][] arr=new char[32][7];
String s = ''
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

五、编程感想
    在这次的字符串实验中，初步学会了一些字符串的基本常用使用方法，如length()等，了解了2维数组的基本应用，学会了如何控制数组的容量。学会了如何利用循环控制来控制行数，控制列数，并在特定的位置添加标点符号，学会了如何使用try catch 来捕获异常。让我对字符串的初步运用有了更深的了解。













