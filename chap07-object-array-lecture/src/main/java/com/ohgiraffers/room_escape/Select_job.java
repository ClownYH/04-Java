package main.java.com.ohgiraffers.room_escape;

public class Select_job {

    Player_data_frame[] jobs = new Player_data_frame[5];

//    Player_data_frame(int hp, int str, int dex, int wis)
    public void student(){
        jobs[0] = new Player_data_frame(3, 3, 3, 4);

        jobs[2] = new Player_data_frame(3, 3, 3, 4);
        jobs[3] = new Player_data_frame(3, 3, 3, 4);
        jobs[4] = new Player_data_frame(3, 3, 3, 4);
    }

    public void soldier(){
        jobs[1] = new Player_data_frame(3, 3, 3, 4);
    }
}
