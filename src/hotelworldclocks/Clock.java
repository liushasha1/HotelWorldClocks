package hotelworldclocks;
public abstract class Clock {
    protected int utcOffset;//保存和utc时间的时差
    protected int localTime=0;//保存当地时间
    public void setUtcOffset(int utcOffset)
    {
       this.utcOffset=utcOffset;	
    }
    public abstract void setLocalTime(int localTime);
    public int getLocalTime() {
    	return localTime;
    }
    public abstract void setLocalTimeFromUtcTime(int utcTime);

}
