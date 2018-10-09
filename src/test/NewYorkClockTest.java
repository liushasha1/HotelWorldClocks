package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import hotelworldclocks.CityClock;
import hotelworldclocks.HotelWorldClockSystem;
import hotelworldclocks.PhoneClock;
import org.junit.Test;
import org.junit.Before;
public class NewYorkClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;
    @Before
    public void setUp()
    {
    	hotelWorldClockSystem=new HotelWorldClockSystem();
    	phoneClock=new PhoneClock(8);
    }
    @Test
	public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time()
	{
		CityClock newYork=new CityClock("newYork",-5);
		hotelWorldClockSystem.attach(newYork);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(9);
		Assert.assertEquals("纽约时钟有问题",20,newYork.getLocalTime());
	}
    @Test
	public void the_time_of_clock_NewYork_should_be_11_after_the_phone_clock_is_set_to_0_Beijing_time()
	{
		CityClock newYork=new CityClock("newYork",-5);
		hotelWorldClockSystem.attach(newYork);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(0);
		Assert.assertEquals("纽约时钟有问题",11,newYork.getLocalTime());
	}
    @Test
	public void the_time_of_clock_NewYork_should_be_10_after_the_phone_clock_is_set_to_负1_Beijing_time()
	{
		CityClock newYork=new CityClock("newYork",-5);
		hotelWorldClockSystem.attach(newYork);
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setLocalTime(-1);
		Assert.assertEquals("纽约时钟有问题",10,newYork.getLocalTime());
	}
}
