package ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
     static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Song(String typeList, String name, String time){
            setTypeList(typeList);
            setName(name);
            setTime(time);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for(int i = 0; i < numOfSongs; i++){
            //String data = scanner.nextLine();
            String[] dataArray = scanner.nextLine().split("_");

            String type = dataArray[0];
            String name = dataArray[1];
            String time = dataArray[2];

            Song song = new Song(type,name,time);
            songs.add(song);
        }

        String command = scanner.nextLine();
        if(command.equals("all")){
            for (Song item : songs) {
                System.out.println(item.getName());
            }
        } else {
            for(Song item : songs){
                if(item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
     }
}
