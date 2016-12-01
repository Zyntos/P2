package songLst;

public class Song implements Comparable<Song>{

	
	private String title;
	
	private int length;
	
	public Song(String title, int length) {
		this.title = title;
		this.length = length;
	}

	@Override
	public int compareTo(Song o) {
		if (this.title.compareTo(o.title) > 0)
		{
		 return 1;
		}
		else if (this.title.compareTo(o.title)< 0) {
			return -1;
		}
		else
		{
			if (this.length > o.length) {
				return 1;
			}
			else if (this.length < o.length) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return length;
	}

	
}
