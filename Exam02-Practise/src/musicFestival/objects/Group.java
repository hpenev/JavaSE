package musicFestival.objects;

import java.util.Random;

public class Group {
    private String name;
    private Song[] songs;
    private Musician[] musicians;
    private boolean hasVocal;

    public Group(String name) {
	this.name = name;
	this.songs = CreateSongList();
	this.musicians = CreateMusiciantList();
    }

    Song[] getSongs() {
	return this.songs;
    }

    String getName() {
	return this.name;
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
	for (int i = 0; i < this.musicians.length; i++) {
	    groupInfo.append(this.musicians[i]);
	}
	groupInfo.append("\tGroup Songs:");
	groupInfo.append("\n");
	for (int i = 0; i < this.songs.length; i++) {
	    groupInfo.append(this.songs[i]);
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
	for (int i = 0; i < this.songs.length; i++) {
	    if (hasVocal) {
		System.out.println(this.songs[i].toString());
	    } else {
		System.out.println(this.songs[i].singKaraokeVersion());
	    }
	}
    }

    Musician[] getMusicians() {
	return this.musicians;
    }
}
