import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTests {

	@Test
	void VHSTest() {
		VHS title = new VHS("The Little Mermaid", 83 );
		String actual = title.getTitle();
		String expected = "The Little Mermaid";
		assertEquals(expected, actual);
	}
	@Test
	void DVDTest() {
		DVD title = new DVD("Frozen", 108 );
		String actual = title.getTitle();
		String expected = "Frozen";
		assertEquals(expected, actual);
	}
	@Test
	void playTest() {
		
		assertEquals(expected, actual);
}
	@Test
	void rewindTest() {
		
		assertEquals(expected, actual);
	}
}