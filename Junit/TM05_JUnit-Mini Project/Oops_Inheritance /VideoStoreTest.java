import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VideoStoreTest {
	
	VideoStore obj = new VideoStore("");

	@Test
	void testAddVideo() {
		assertEquals("Video is added successfully.", obj.addVideo("Matrix"));
	}


	@Test
	void testRecieveRatingStringInt() {
		obj.addVideo("Matrix");
		assertEquals("Rating has been mapped to the video.",obj.recieveRating("Matrix", 9));
	}
	
	@Test
	void testDoCheckoutString() {
		obj.addVideo("Matrix");
		assertEquals("The video has been checked successfully.", obj.doCheckout("Matrix"));
	}

	@Test
	void testDoReturnString() {
		obj.addVideo("Matrix");
		assertEquals("The video has been returned successfully.", obj.doReturn("Matrix"));
	}

}
