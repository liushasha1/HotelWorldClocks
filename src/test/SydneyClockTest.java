package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import hotelworldclocks.CityClock;
import hotelworldclocks.HotelWorldClockSystem;
import hotelworldclocks.PhoneClock;
import org.junit.Test;
import org.junit.Before;
public class SydneyClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
    @Before
    public void setUp()
    {
    	hotelWorldClockSystem=new HotelWorldClockSystem();
    	phoneClock=new PhoneClock(8);
    }
    @Test
	public void the_time_of_clock_Sydney_should_be_11_after_the_phone_clock_is_set_to_9_Beijing_time()
	{
		CityClock sydney=new CityClock("sydney",10);
		hotelWorldClockSystem.attach(sydney);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(9);
		Assert.assertEquals("悉尼时钟有问题",11,sydney.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Sydney_should_be_2_after_the_phone_clock_is_set_to_0_Beijing_time()
	{
		CityClock sydney=new CityClock("sydney",10);
		hotelWorldClockSystem.attach(sydney);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(0);
		Assert.assertEquals("悉尼时钟有问题",2,sydney.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Sydney_should_be_1_after_the_phone_clock_is_set_to_负1_Beijing_time()
	{
		CityClock sydney=new CityClock("sydney",10);
		hotelWorldClockSystem.attach(sydney);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(-1);
		Assert.assertEquals("悉尼时钟有问题",1,sydney.getLocalTime());
	}
}
