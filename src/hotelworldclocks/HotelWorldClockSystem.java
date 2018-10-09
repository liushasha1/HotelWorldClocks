package hotelworldclocks;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class HotelWorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<>();
    private int utcTime;
    final Logger logger = Logger.getLogger("hotelworldclocks.HotelWorldClockSystem");

    public HotelWorldClockSystem()
    {
    	utcTime=0;
    }
    public void setUtcTime(int utcTime)
    {
    	this.utcTime=utcTime;
    	this.updateClocksUtcTime();
    }
    public int getUtcTime()
    {
    	return this.utcTime;
    }
    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }
    public List<CityClock> getClocks() {
        return this.cityClocks;
    }
    public void updateClocksUtcTime()
    {
    	for(CityClock cityClock : this.getClocks())
    	{
    		cityClock.setLocalTimeFromUtcTime(this.utcTime);
    	}
    }
    public void printClocksLocalTime()
    {
    	for(CityClock cityClock : this.getClocks())
    	{
    		logger.info(cityClock.getCityName() +":"+ cityClock.getLocalTime());
    	}
    }
}
