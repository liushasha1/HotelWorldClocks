package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import hotelworldclocks.CityClock;
import hotelworldclocks.HotelWorldClockSystem;
import hotelworldclocks.PhoneClock;
import org.junit.Test;
import org.junit.Before;
public class LondonClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
    @Before
    public void setUp()
    {
    	hotelWorldClockSystem=new HotelWorldClockSystem();
    	phoneClock=new PhoneClock(8);
    }
    @Test
	public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time()
	{
		CityClock london=new CityClock("london",0);
		hotelWorldClockSystem.attach(london);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(9);
		Assert.assertEquals("伦敦时钟有问题",1,london.getLocalTime());
	}
    @Test
	public void the_time_of_clock_London_should_be_16_after_the_phone_clock_is_set_to_0_Beijing_time()
	{
		CityClock london=new CityClock("london",0);
		hotelWorldClockSystem.attach(london);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(0);
		Assert.assertEquals("伦敦时钟有问题",16,london.getLocalTime());
	}
    @Test
	public void the_time_of_clock_London_should_be_15_after_the_phone_clock_is_set_to_负1_Beijing_time()
	{
		CityClock london=new CityClock("london",0);
		hotelWorldClockSystem.attach(london);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(-1);
		Assert.assertEquals("伦敦时钟有问题",15,london.getLocalTime());
	}
}
