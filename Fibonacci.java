public class Fibonacci {
	
	public static void Fibonacci.of(){
		
		double c1 = 1;
		double c2 = 1;//Fibonacci��һ���͵ڶ�����Ϊ1
		double c3;//�����µ�Fibonacci��
		
		System.out.printf("%15.0f %15.0f ",c1 ,c2);
		for(int i = 3; i <= 200; i++){//������ٸ����Լ���Ҫ
			c3 = c1 + c2;//�µ�Fibonacci��
			System.out.printf("%15.0f ", c3);//��ֹ��ֵλ��������%15.0f��С��15λ�ո��룬���ڻ����ԭ�����
			c1 = c2;//��i-1����
			c2 = c3;//��i����
			if(i % 10 == 0){//���10��������
			   System.out.println();
			}
		}
	}
 
	public static void main(String[] args) {
		Fibonacci.of();
	}
 
}