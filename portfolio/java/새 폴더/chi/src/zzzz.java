import java.util.Scanner;

public class zzzz {
	public static void main(String[] args) {//
		Scanner key = new Scanner(System.in);
		String id, pw;
		char u;
		int count = 0;
		System.out.println("가입하실 아이디를 입력하세요.(quit 입력시 종료)");
		id = key.next();
		while (true) {
			if (id.equals("quit")) {
				break;
			}
			System.out.println("영문자와 숫자 조합으로 8자리 이상의 비밀번호만 사용가능합니다.");
			System.out.println("원하시는 비밀번호를 입력하세요.");
			pw = key.next();
			if (pw.equals("quit")) {
				break;
			}
			if (pw.length() >= 8) {
				for (int a = 0; a < pw.length(); a++) {
					char s = pw.charAt(a);
					if (s >= 'A' || s > 'z' && s > '0' || s < '9') {

						System.out.println(id + "님의 입력하신 비밀번호는 " + pw + "입니다.");
						break;
					} // if (영문,숫자의 조건)

					else {
						System.out.println("조건이 틀렷습니다.");
						break;
					}
				} // for문
			} // if 문
			else {
				System.out.println("pw 가 8자리 미만 ");
			}
		} // while 종료

	}// main 메소드 종료
}// class 종료
// System.out.println(id+"님의 입력하신 비밀번호는 " +pw+ "입니다.");