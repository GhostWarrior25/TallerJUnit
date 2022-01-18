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
    
    /**
    WiiGame mario;
    Xbox360Game halo;
    Ps3Game gta;
    VideoGameRental orden;
    int drenta;
    boolean consola;
    
    @Before
    public void setUp() {
        mario = new WiiGame("Mario galaxy";
        halo = new Xbox360Game("HALO");
        gta = new Ps3Game("GTA 5");
        drenta = 5;
        consola= True;
        orden = new VideoGameRental(gta, drenta , consola);
    }
    @Test
    public void testGetDaysRented() {
        assertEquals( drenta, orden.getDaysRented());
    }
    public void testGetVideoGame() {
        assertEquals( gta, orden.getVideogame());
    }
    public void testGetDaysRented() {
        assertEquals(gta.getCharge(drenta, consola), orden.getCharge());
    }
    public void testGetFrequentRenterPoints() {
        assertEquals(gta.getFrequentRenterPoints(drenta, consola), orden.getFrequentRenterPoints());
    }
    */  
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = null;
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = null;
        Object expResult = null;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = null;
        double expResult = 0.0;
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = null;
        int expResult = 0;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
