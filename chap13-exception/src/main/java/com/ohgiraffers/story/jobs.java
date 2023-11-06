package main.java.com.ohgiraffers.story;

public class jobs {

    private int num;
    private String jobName;

    public jobs(int num, String jobName) {
        this.num = num;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "jobs{" +
                "num=" + num +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
