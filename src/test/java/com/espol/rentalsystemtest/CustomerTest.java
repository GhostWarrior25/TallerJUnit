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
public class CustomerTest {
    Customer Carlos;
    Movie mulan;
    VideoGameRental orden;
    MovieRental rent_pelicula;
    WiiGame mario;
    Xbox360Game halo;
    Ps3Game gta;
    int drenta;
    boolean consola;
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Carlos = new Customer("Carlos");
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        rent_pelicula = new MovieRental(mulan,8 );
        mario = new WiiGame("mario");
        orden = new VideoGameRental(mario, 8, true);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = rent_pelicula;
        Customer instance = Carlos;
        instance.addMovieRental(arg);
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = orden;
        Customer instance = Carlos;
        instance.addVideoGameRental(arg);

    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = Carlos;
        String expResult = "Rental Record for Carlos\n" +"Amount owed is 0.0\n" +"You earned 0 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
    }
    
}
