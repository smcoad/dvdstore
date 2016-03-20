/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dvdrental.Film;
import javax.faces.model.DataModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class FilmControllerTest {
    
    public FilmControllerTest() {
    }
    
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
     * Test of getSelected method, of class FilmController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        FilmController instance = new FilmController();
        Film expResult = null;
        Film result = instance.getSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFilmTitles method, of class FilmController.
     */
    @Test
    public void testGetFilmTitles() {
        System.out.println("getFilmTitles");
        FilmController instance = new FilmController();
        DataModel expResult = null;
        DataModel result = instance.getFilmTitles();
        assertEquals(expResult, result);
    }

    /**
     * Test of recreateModel method, of class FilmController.
     */
    @Test
    public void testRecreateModel() {
        System.out.println("recreateModel");
        FilmController instance = new FilmController();
        instance.recreateModel();
    }

    /**
     * Test of isHasNextPage method, of class FilmController.
     */
    @Test
    public void testIsHasNextPage() {
        System.out.println("isHasNextPage");
        FilmController instance = new FilmController();
        boolean expResult = false;
        boolean result = instance.isHasNextPage();
        assertEquals(expResult, result);
    }

    /**
     * Test of isHasPreviousPage method, of class FilmController.
     */
    @Test
    public void testIsHasPreviousPage() {
        System.out.println("isHasPreviousPage");
        FilmController instance = new FilmController();
        boolean expResult = false;
        boolean result = instance.isHasPreviousPage();
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of class FilmController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
    }

    /**
     * Test of previous method, of class FilmController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPageSize method, of class FilmController.
     */
    @Test
    public void testGetPageSize() {
        System.out.println("getPageSize");
        FilmController instance = new FilmController();
        int expResult = 0;
        int result = instance.getPageSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of prepareView method, of class FilmController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
    }

    /**
     * Test of prepareList method, of class FilmController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLanguage method, of class FilmController.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.getLanguage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getActors method, of class FilmController.
     */
    @Test
    public void testGetActors() {
        System.out.println("getActors");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.getActors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class FilmController.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        FilmController instance = new FilmController();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
    
}
