public class Fibonacci {
	
	public static void Fibonacci.of(){
		
		double c1 = 1;
		double c2 = 1;//Fibonacci第一个和第二个数为1
		double c3;//接收新的Fibonacci数
		
		System.out.printf("%15.0f %15.0f ",c1 ,c2);
		for(int i = 3; i <= 200; i++){//输出多少个看自己需要
			c3 = c1 + c2;//新的Fibonacci数
			System.out.printf("%15.0f ", c3);//防止数值位数过大，用%15.0f，小于15位空格补齐，大于或等于原样输出
			c1 = c2;//第i-1个数
			c2 = c3;//第i个数
			if(i % 10 == 0){//输出10个数后换行
			   System.out.println();
			}
		}
	}
 
	public static void main(String[] args) {
		Fibonacci.of();
	}
 
}