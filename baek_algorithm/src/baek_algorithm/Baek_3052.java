package baek_algorithm;
import java.util.*;
public class Baek_3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=0;
		int n;
		boolean[] arr = new boolean[42];//true, false�迭
		for(int i=0;i<10;i++) {
			n=sc.nextInt()%42;
			if(!arr[n]) {//arr[n]�� �����̸� �� -> ���̸� ����
				answer++;
				arr[n]=true; //arr[n]�� ���� ������ true�� �ٲ��༭ �ߺ�����
			}
		}
		System.out.println(answer);
		
	}
}
