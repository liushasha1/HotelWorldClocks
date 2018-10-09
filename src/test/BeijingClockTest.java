package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import hotelworldclocks.CityClock;
import hotelworldclocks.HotelWorldClockSystem;
import hotelworldclocks.PhoneClock;
import org.junit.Test;
import org.junit.Before;
public class BeijingClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
    @Before
    public void setUp()
    {
    	hotelWorldClockSystem=new HotelWorldClockSystem();
    	phoneClock=new PhoneClock(8);
    }
    @Test
	public void the_time_of_clock_Beijing_should_be_9_after_the_phone_clock_is_set_to_9_Beijing_time()
	{
		CityClock beijing=new CityClock("beijing",8);
		hotelWorldClockSystem.attach(beijing);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(9);
		Assert.assertEquals("北京时钟有问题",9,beijing.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Beijing_should_be_0_after_the_phone_clock_is_set_to_0_Beijing_time()
	{
		CityClock beijing=new CityClock("beijing",8);
		hotelWorldClockSystem.attach(beijing);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(0);
		Assert.assertEquals("北京时钟有问题",0,beijing.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Beijing_should_be_23_after_the_phone_clock_is_set_to_负1_Beijing_time()
	{
		CityClock beijing=new CityClock("beijing",8);
		hotelWorldClockSystem.attach(beijing);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(-1);
		Assert.assertEquals("北京时钟有问题",23,beijing.getLocalTime());
	}
}
