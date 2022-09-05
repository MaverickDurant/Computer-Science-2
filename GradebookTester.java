import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;


public class GradebookTester 
{
	
private GradeBook g1;
private GradeBook g2;

@Before
public void setUp() 
{
	
g1 = new GradeBook(5);
g2 = new GradeBook(5);


g1.addScore(50.0);
g1.addScore(75.0);
g2.addScore(90.0);
g2.addScore(105.0);
}

@After
public void tearDown() 
{
	
g1 = null;
g2 = null;
}

@Test
public void testSum()
{
	
assertEquals(125.0,g1.sum(),0.001);
assertEquals(195,g2.sum(),0.001);
}

@Test
public void testMinimum()
{
	
assertEquals(50.0,g1.minimum(),0.001);
assertEquals(90.0,g2.minimum(),0.001);
}

@Test
public void addScoreTest()
{
	
assertTrue(g1.toString().equals("50.0 75.0 "));
assertTrue(g2.toString().equals("90.0 105.0 "));
}

@Test
public void finalScoreTest()
{
	
assertEquals(75.0,g1.finalScore(),0.001);
assertEquals(105.0,g2.finalScore(),0.001);
}
}