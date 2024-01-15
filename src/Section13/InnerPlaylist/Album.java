package Section13.InnerPlaylist;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    //private String name;
    //private String artist;
    private SongList songs = new SongList();


    public Album(String name, String artist) {
        //this.name = name;
        //this.artist = artist;

    }

    public boolean addSong(String title, double duration){
        return songs.add(new Song(title, duration));

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;        
        }

        private Song findSong(String title){
            for (Song checkedSong : songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }    

        private Song findSong(int songNumber){      
            int index = songNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
        

    }


}
