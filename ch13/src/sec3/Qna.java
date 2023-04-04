package sec3;

public class Qna {
	private int qno;
	private String qtitle;
	private String qcontent;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQtitle() {
		return qtitle;
	}
	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}
	public String getQcontent() {
		return qcontent;
	}
	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}
	
	@Override
	public String toString() {
		return "Qna [qno=" + qno + ", qtitle=" + qtitle + ", qcontent="
				+ qcontent + "]";
	}	
}