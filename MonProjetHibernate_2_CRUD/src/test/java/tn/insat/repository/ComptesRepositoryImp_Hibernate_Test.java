package tn.insat.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tn.insat.entities.Compte;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
public class ComptesRepositoryImp_Hibernate_Test {

	private IComptesRepository underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new ComptesRepositoryImp_Hibernate();
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public final void testCreate() {

		// ARRANGE
		String expected = "B200";
		Compte nouveau = new Compte("B200", "Someone ...", new BigDecimal("10000"));

		// ACT
		String actual = underTest.create(nouveau);

		// ASSERT
		assertEquals(expected, actual);
			}

	@Test
	public final void testFindById() {

		// ARRANGE
		String id = "C1000";
		Compte expected = new Compte("C1000", "James Gosling", new BigDecimal("1000.000"));

		// ACT
		Compte actual = underTest.findById(id);

		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public final void testFindAll() {
		// ARRANGE
		int expected = 5;

		// ACT
		List<Compte> actual = underTest.findAll();

		// ASSERT
		assertEquals(expected, actual.size());
	}

	@Test
	public final void testUpdate() {

		// ARRANGE

		Compte nouveau = new Compte("C1000", "James Gosling- Java Creator ", new BigDecimal("1000.000"));
        Compte expected = nouveau;
		// ACT
		Compte actual = underTest.update(nouveau);

		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public final void testDelete() {
		fail("Not yet implemented"); // TODO
	}

}
