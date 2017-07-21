package musicFestival;

import java.util.Random;

public class Group {
    private String name;
    private Song[] songs;
    private Musician[] musicians;
    private String timeGoUpStage;
    private String timeGoDownStage;
    private boolean hasVocal;

    Group(String name, String timeGoUpStage, String timeGoDownStage) {
	this.name = name;
	this.songs = CreateSongList();
	this.musicians = CreateMusiciantList();
	this.timeGoUpStage = timeGoUpStage;
	this.timeGoDownStage = timeGoDownStage;
    }

    private Song[] CreateSongList() {
	Random random = new Random();
	int numberOfSongs = random.nextInt(7) + 3;
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
	    musicians[i] = new Musician("Name" + (i + 1), "Instrument" + (i + 1), vocal);
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
}
