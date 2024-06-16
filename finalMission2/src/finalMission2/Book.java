package finalMission2;

public class Book {
	
	private int id;
	private String title;
	
	public Book(int id, String title) // Book 클래스 생성자
	{
		this.id = id;
		this.title = title;
	}
	
	public int GetId() 
	{
		return id;
	}
	
	public String GetTitle()
	{
		return title;
	}
	
	public String toString() 
	{
		return "{id: "+ id + ", title: " + title + "}";
	}

}
