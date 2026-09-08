class Song {
    String name, artist;
    Song next;

    Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
}

class Playlist {
    Song head;

    void addSong(String name, String artist) {
        Song newSong = new Song(name, artist);
        if (head == null) {
            head = newSong;
            return;
        }
        Song temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newSong;
    }

    void deleteSong(String name) {
        if (head == null) return;
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Song temp = head;
        while (temp.next != null &&
               !temp.next.name.equals(name))
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void display() {
        Song temp = head;
        while (temp != null) {
            System.out.println(temp.name + " - " + temp.artist);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Playlist pl=new playlist();
        pl.addSong("vava","raj");
        pl.addSong("hara","thillai");
        pl.display();
    }
}

