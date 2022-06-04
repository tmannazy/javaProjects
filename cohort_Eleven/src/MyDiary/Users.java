package MyDiary;


import java.util.ArrayList;

public class Users {
    private ArrayList<Diary> diaries = new ArrayList<>();

    Users(Diary diaries) {
        this.diaries.add(diaries);
    }


    ArrayList<Diary> getDiaries(){
         return diaries;
    }

//    @Override
//    public String toString() {
//        return "\nFrom Users Class:" +
//               "diaries=" + diaries +
//               '}';
//    }
}
