package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import hotelworldclocks.CityClock;
import hotelworldclocks.HotelWorldClockSystem;
import hotelworldclocks.PhoneClock;
import org.junit.Test;
import org.junit.Before;
public class MoscowClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
    @Before
    public void setUp()
    {
    	hotelWorldClockSystem=new HotelWorldClockSystem();
    	phoneClock=new PhoneClock(8);
    }
    @Test
	public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time()
	{
		CityClock moscow=new CityClock("moscow",4);
		hotelWorldClockSystem.attach(moscow);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(9);
		Assert.assertEquals("莫斯科时钟有问题",5,moscow.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Moscow_should_be_20_after_the_phone_clock_is_set_to_0_Beijing_time()
	{
		CityClock moscow=new CityClock("moscow",4);
		hotelWorldClockSystem.attach(moscow);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(0);
		Assert.assertEquals("莫斯科时钟有问题",20,moscow.getLocalTime());
	}
    @Test
	public void the_time_of_clock_Moscow_should_be_19_after_the_phone_clock_is_set_to_负1_Beijing_time()
	{
		CityClock moscow=new CityClock("moscow",4);
		hotelWorldClockSystem.attach(moscow);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(-1);
		Assert.assertEquals("莫斯科时钟有问题",19,moscow.getLocalTime());
	}
}
