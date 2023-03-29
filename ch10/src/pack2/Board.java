package pack2;

public class Board {
	private int boardnumber;
	private String title;
	private String content;
	private String author;
	private String resdate;
	
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	
	@Override
	public String toString() {
		return "Board [boardnumber=" + boardnumber + ", title=" + title
				+ ", content=" + content + ", author=" + author + ", resdate="
				+ resdate + "]";
	}
	
}