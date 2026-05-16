package com.demo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SchuelerTest {

    private SchuelerManager schuelerManager;

    @Before
    public void setUp() {
        schuelerManager = new SchuelerManager();
        schuelerManager.add(new Schueler("Anna", 101, 1.7));
        schuelerManager.add(new Schueler("Peter", 102, 2.3));
        schuelerManager.add(new Schueler("Simon", 103, 1.0));
    }

    @Test
    public void testDurchschnitt() {
        assertEquals(2.0, schuelerManager.durchschnitt(), 0.01);
    }

    @Test
    public void testBester() {
        assertEquals("Anna", schuelerManager.bester().getName());
    }
}
