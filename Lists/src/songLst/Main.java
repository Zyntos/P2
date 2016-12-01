package songLst;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	
	public static void main(String[] args) {
		
	ArrayList<Song> songList = new ArrayList<>();
	
	Song bla = new Song("Ahahaha", 210);
	Song blub = new Song("uhuhuhu", 420);
	Song blablub = new Song("NOPE NOPE NOPE", 520);
	Song blabluba = new Song("Last Christmas", 200);
	Song blablau = new Song("NOPE", 300);
	
	songList.add(bla);
	songList.add(blub);
	songList.add(blablub);
	songList.add(blabluba);
	songList.add(blablau);
	
	Collections.sort(songList);
	
	for (Song song : songList) {
		System.out.println(song.getTitle());
		System.out.println(song.getLength());
	}
	
	
		

	}

}
