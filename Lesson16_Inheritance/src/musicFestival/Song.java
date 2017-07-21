package musicFestival;

public class Song {
    private String name;
    private String lyric;

    Song(String name, String lyric) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	}
	if (lyric != null && !lyric.isEmpty()) {
	    this.lyric = lyric;
	}
    }

    public String singKaraokeVersion() {
	StringBuilder songInfo = new StringBuilder();
	songInfo.append("\tName of the song: " + this.name);
	songInfo.append("\n");
	return songInfo.toString();
    }

    @Override
    public String toString() {
	StringBuilder songInfo = new StringBuilder();
	songInfo.append("\tName of the song: " + this.name);
	songInfo.append("\n");
	songInfo.append("\tLyric of the song: " + this.lyric);
	songInfo.append("\n");
	return songInfo.toString();
    }
}
