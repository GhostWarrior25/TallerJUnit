/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }
    
    
    WiiGame mario;
    Xbox360Game halo;
    Ps3Game gta;
    VideoGameRental orden;
    int drenta;
    boolean consola;
    
  

   
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mario = new WiiGame("Mario galaxy");
        halo = new Xbox360Game("HALO");
        gta = new Ps3Game("GTA 5");
        drenta = 5;
        consola= true;
        orden = new VideoGameRental(gta, drenta , consola);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        assertEquals(drenta, orden.getDaysRented());
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        assertEquals( gta, orden.getVideoGame());
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        assertEquals(gta.getCharge(drenta, consola), orden.getCharge());

    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
      assertEquals(gta.getFrequentRenterPoints(drenta, consola), orden.getFrequentRenterPoints());
    }
    
}
