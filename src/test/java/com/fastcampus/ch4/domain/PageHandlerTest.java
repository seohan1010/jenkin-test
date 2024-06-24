package com.fastcampus.ch4.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/test-context.xml"})
public class PageHandlerTest {


    @Test
    public void test(){

        PageHandler ph = new PageHandler(250,15);
            assertTrue(ph.getBeginPage()==11);
            assertTrue(ph.getEndPage()==20);
            ph.print();


    }

    @Test
    public void test1(){

        PageHandler ph = new PageHandler(255,25);
        ph.print();
        assertTrue(ph.getTotalPage()==26);
        assertTrue(ph.getBeginPage()==21);
        assertTrue(ph.getEndPage()==26);


    }


}