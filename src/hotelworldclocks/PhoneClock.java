package hotelworldclocks;
public class PhoneClock extends Clock {
    private HotelWorldClockSystem hotelWorldClockSystem;
    public PhoneClock(int utcOffset)
    {
    	super.utcOffset=utcOffset;
    }
    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem)
    {
    	this.hotelWorldClockSystem=hotelWorldClockSystem;
    }
	@Override
	public void setLocalTime(int localTime) {
		super.localTime=localTime;
		hotelWorldClockSystem.setUtcTime(localTime-super.utcOffset);
	}

	@Override
	public void setLocalTimeFromUtcTime(int utcTime) {
		super.localTime=(utcTime+super.utcOffset+24)%24;
		hotelWorldClockSystem.setUtcTime(utcTime);
	}
    
}
