package 실습문제;

public class Person_11 {
	String name,juso,phonenum;
	Person_11(){this("이름미상","주소미상","번호미상");}
	Person_11(String name){
		this(name,"주소미상","번호미상");
	}
	Person_11(String juso,String phonenum){
		this(juso,"주소미상",phonenum);
	}
	Person_11(String name ,String juso,String phonenum){
		this.name=name;
		this.juso=juso;
		this.phonenum=phonenum;
		System.out.println(this.name);
	}
	public void settel(String tel){
		phonenum=tel;
	}
	public String gettel(){
		return phonenum;
	}

}
class customer extends Person_11{
	String cus_num;
	int mile;
	public customer(){}
	public customer(String name){super(name);}
}
class test{
	public static void main(String[] args){
		customer[] cus = new customer[2];
		cus[0] = new customer();
		cus[1] = new customer("benny");
	}
}