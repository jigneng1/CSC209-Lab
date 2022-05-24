import java.io.RandomAccessFile;

public class RandomAccessFileLab {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("song.dat","rw");
            Song s1 = new Song(101,"Last friday night","Pop",3.0,"Karry Perry");
            Song s2 = new Song(102,"The black Hawk War","Rap",4.52,"Sufjan Stevans");

            raf.writeInt(s1.getId());

            byte[] title = new byte[20];
            title = s1.getTitle().concat("                    ").getBytes();
            raf.write(title,0,20);

            byte[] genre = new byte[10];
            genre = s1.getGenre().concat("          ").getBytes();
            raf.write(genre,0,10);

            raf.writeDouble(s1.getDuration());

            byte[] artist = new byte[20];
            artist = s1.getArtist().concat("          ").getBytes();
            raf.write(artist,0,10);

            String title1 = new String(title);
            System.out.println(title1);

            String artist1 = new String(artist);
            System.out.println(artist1);

            raf.seek(34);
            Double duration  = raf.readDouble();
            System.out.println(duration);

            raf.writeInt(s2.getId());

            title =s2.getTitle().concat("                    ").getBytes();
            raf.write(title,0,20);


            genre = s2.getGenre().concat("          ").getBytes();
            raf.write(genre,0,10);

            raf.writeDouble(s2.getDuration());


            artist = s2.getArtist().concat("          ").getBytes();
            raf.write(artist,0,20);
            artist1 = new String(artist);
            System.out.println(artist1);

            raf.close();
        }
        catch (Exception s){
            System.out.println("ERROR");
        }
    }
}
