package sec2;
// User+Guest = Mix
// 자바에서는 가급적 다중 상속을 사용하지 않는다.
public interface Mix extends User, Guest {
	public String method5();
	public int method6();

}