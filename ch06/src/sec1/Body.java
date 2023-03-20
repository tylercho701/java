package sec1;

public class Body {
	String style = "RV";
	String bumper;
	String frendar;
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getBumper() {
		return bumper;
	}
	public void setBumper(String bumper) {
		this.bumper = bumper;
	}
	public String getFrendar() {
		return frendar;
	}
	public void setFrendar(String frendar) {
		this.frendar = frendar;
	}
	@Override
	public String toString() {
		return "Body [style=" + style + ", bumper=" + bumper + ", frendar="
				+ frendar + "]";
	}
	
	

}
