package musicFestival;

import java.util.Random;

public class Group {
    private String name;
    private Song[] songs;
    private Musician[] musicians;
    private boolean hasVocal;

    Group(String name) {
	this.name = name;
	this.songs = CreateSongList();
	this.musicians = CreateMusiciantList();
    }

    Song[] getSongs() {
	return songs;
    }

    String getName() {
	return name;
    }

    private Song[] CreateSongList() {
	Random random = new Random();
	int numberOfSongs = random.nextInt(2) + 1;
	Song[] songs = new Song[numberOfSongs];
	for (int i = 0; i < numberOfSongs; i++) {
	    songs[i] = new Song("Song" + (i + 1), "Lyric" + (i + 1));
	}
	return songs;
    }

    private Musician[] CreateMusiciantList() {
	Random random = new Random();
	int numberOfMusicians = random.nextInt(4) + 1;
	Musician[] musicians = new Musician[numberOfMusicians];
	for (int i = 0; i < numberOfMusicians; i++) {
	    boolean vocal = random.nextBoolean();
	    musicians[i] = new Musician("MusicianName" + (i + 1), "Instrument" + (i + 1), vocal);
	    if (vocal) {
		this.hasVocal = true;
	    }
	}
	return musicians;
    }

    @Override
    public String toString() {
	StringBuilder groupInfo = new StringBuilder();
	groupInfo.append("\tGroup name: " + this.name);
	groupInfo.append("\n");
	groupInfo.append("\tGroup musicians:");
	groupInfo.append("\n");
	boolean hasVocal = false;
	for (int i = 0; i < musicians.length; i++) {
	    groupInfo.append(musicians[i]);
	}
	groupInfo.append("\tGroup Songs:");
	groupInfo.append("\n");
	for (int i = 0; i < songs.length; i++) {
	    groupInfo.append(songs[i]);
	}
	return groupInfo.toString();
    }

    void greetAudience() {
	for (int i = 0; i < this.getMusicians().length; i++) {
	    this.getMusicians()[i].greetPeople();
	}
    }

    void singSongs() {
	System.out.println("Start singing:");
	for (int i = 0; i < songs.length; i++) {
	    if (hasVocal) {
		System.out.println(songs[i].toString());
	    } else {
		System.out.println(songs[i].singKaraokeVersion());
	    }
	}
    }

    Musician[] getMusicians() {
	return musicians;
    }
}
