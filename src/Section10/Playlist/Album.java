package Section10.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    //private String name;
    //private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        //this.name = name;
        //this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title){
        ListIterator<Song> iterator = songs.listIterator();
        while(iterator.hasNext()){
            Song song = iterator.next();
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;

    }    

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(index >= 0 && songs.size() > index){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if(song != null){
            ListIterator<Song> iterator = playlist.listIterator();
            while(iterator.hasNext()){
                Song playSong = iterator.next();
                if(song.getTitle().equals(title)){
                    playlist.add(playSong);
                    return true;
                }
            }
        }
        return false;
    }
}
