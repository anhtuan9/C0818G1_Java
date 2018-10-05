package ex.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public int start(){
        startTime = new Date();
        return startTime.getSeconds();
    }
    public int end(){
        endTime = new Date();
        return endTime.getSeconds();
    }
    public int getElapsedTime(int end, int stat){
        return end - stat;
    }
}
