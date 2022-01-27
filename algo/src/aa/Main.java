package aa;


import java.util.Scanner;

public class Main {
//레벨-0 버거는 패티만으로 이루어져 있다.
//	레벨-L 버거는 B, 레벨-(L-1) 버거, P, 레벨-(L-1)버거,B으로 이루어져 있다. (L ≥ 1)
//	예를 들어, 레벨-1 버거는 'B P P P B', 레벨-2 버거는 'B BPPPB P BPPPB B'와 같이 생겼다. (B는 햄버거번, P는 패티)
//
//	상도가 상근날드에 방문해서 레벨-N 버거를 시켰다. 상도가 햄버거의 아래 X장을 먹었을 때, 먹은 패티는 몇 장일까? 한 장은 햄버거번 또는 패티 한 장이다.

	private static long[] total;
	private static long[] patty;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		
		total = new long[N+1];
		patty = new long[N+1];
		
		total[0] = 1 ; patty[0] = 1; // 총재료수랑 패티갯수 구하기 위해 처음 패티한장있는걸 초기화 해줌  
		
		for(int i = 1 ; i <= N ; i++) {
			total[i] = 1+total[i-1]+1+total[i-1]+1;//N이 1, 2, 3,...일 경우를 차례로 배열에 갯수를 저장해줌
			patty[i] = patty[i-1]+1+patty[i-1];//빵말고 패티만 갯수 추가 
		}
		
		System.out.println(CountPatty(N, X));
		
	}
	//1 p
	//5 BPPPB
	//  BBPPPB P BPPPBB
	public static long CountPatty(int N, long X) {
		if(N==0) {
			if(X==0) return 0; //레벨도 0이고 한장도 안먹었을 경우
			else return 1; //레벨 0인데 한장 먹었을 경우
		} 
		//N->0이 아닐때 x장 먹었을때 먹은 패티 수 구하기 
		if(X==1) return 0;//일단 한장 먹으면 맨밑에 빵이라 패티 0개 먹음 ㅋㅋ
		else if(X <= 1+total[N-1] ) { //중앙 패티 P보다 작은 경우 -> 현재의 반은 이전레벨에 빵하나만 더한것이기 때문에 이전 호출 +1(빵)을 해준것
			return CountPatty(N-1, X-1);//이전 빵보다 작기 때문에 이전빵으로 다시비교하기 위해 + x-1은 맨앞의빵은 셀 필요가 없어서
		}else if(X == 1+total[N-1]+1 ) {//반 + 1(중앙패티) == X값이 중앙값과 같을 때
			return patty[N-1]+1;//이전거 패티에 +1(패티)만 해주면 됨
		}else if(X < total[N]) {//반 +1(중앙패티) <= X값이 중앙값보다 클때
			return patty[N-1]+1+CountPatty(N-1, X-(1+total[N-1]+1)); //반보다 크면 반만큼의 패티수 보단 크단거임 반까진 이전레벨패티갯수로 세고 나머지는 위에서 먹은갯수를 이전레벨 총 재료만큼 줄인다음에 재귀하면 된다.
		}else {//X가 total 이랑 같을때 
			return patty[N];
		}
 		
		
		//N = 4, x = 5 // N=2 x=4
	}

}
