package CodecademyProjects;
import java.util.ArrayList;

class Playlist {

    // this code creates a playlist using ArrayList methods

    /*
    can add on:
    Create a method that shuffles the song order
    Reverse the song order
     */

    public static void main(String[] args) {
        // create ArrayList called desertIslandPlaylist that can hold String values
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        // add > 6 songs to list
        desertIslandPlaylist.add("Popular Monster - Falling in Reverse");
        desertIslandPlaylist.add("In The End - Linkin Park");
        desertIslandPlaylist.add("I Miss You - Blink-182");
        desertIslandPlaylist.add("Breaking Down - I Prevail");
        desertIslandPlaylist.add("Hurricane - I Prevail");
        desertIslandPlaylist.add("Angel in the Night - Basshunter");

        System.out.println(desertIslandPlaylist);

        // check the number of items in playlist
        System.out.println(desertIslandPlaylist.size());

        // remove the song at index 2
        desertIslandPlaylist.remove(2);

        // print playlist now that song has been removed
        System.out.println(desertIslandPlaylist.size());

        /* swap the order of two songs in the playlist by adding each song to the index
        of the other song you want to swap it with */
        int indexA = desertIslandPlaylist.indexOf("Hurricane - I Prevail");
        int indexB = desertIslandPlaylist.indexOf("Breaking Down - I Prevail");

        desertIslandPlaylist.set(indexA, "Breaking Down - I Prevail");
        desertIslandPlaylist.set(indexB, "Hurricane - I Prevail");

        System.out.println(desertIslandPlaylist);

    }
}