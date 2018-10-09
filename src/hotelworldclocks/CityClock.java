package hotelworldclocks;

public class CityClock extends Clock{
    private int utcTime;//存utc时间
    private String cityName;//存城市名
    public CityClock(String name,int utcOffset)
    {
    	this.cityName=name;
    	super.utcOffset=utcOffset;
    }
    public void setUtcTime(int utcTime)
    {
    	this.utcTime=utcTime;
    }
    public int getUtcTime()
    {
    	return this.utcTime;
    }
    public void setCityName(String cityName)
    {
    	this.cityName=cityName;
    }
    public String getCityName()
    {
    	return this.cityName;
    }
	@Override
	public void setLocalTime(int localTime) {
		super.localTime=localTime;
		
	}
	@Override
	public void setLocalTimeFromUtcTime(int utcTime) {
	    	super.localTime=(utcTime+super.utcOffset+24)%24;
	    }
		
	}
    

