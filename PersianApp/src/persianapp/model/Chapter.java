package persianapp.model;

public class Chapter {
	private final String id;
	private String title;
	
	public Chapter(String id,String title) {
		this.id=id;
		this.title=title;
		
	}
	public String get_id() {
		return id;
	}
	public String get_title() {
		return title;
	}
	public void set_title(String title) {
		this.title=title;
	}

}
