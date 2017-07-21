package musicFestival;

public class Song {
    private String name;
    private String lyric;

    /**
     * Create a Song
     * 
     * @param name
     *            - Name of the Song
     * @param lyric
     *            - Lyric of the song
     */
    Song(String name, String lyric) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	}
	if (lyric != null && !lyric.isEmpty()) {
	    this.lyric = lyric;
	}
    }

    @Override
    public String toString() {
	StringBuilder songInfo = new StringBuilder();
	songInfo.append("\t\tName of the song: " + this.name);
	songInfo.append("\n");
	songInfo.append("\t\tLyric of the song: " + this.lyric);
	songInfo.append("\n");
	return songInfo.toString();
    }

}
