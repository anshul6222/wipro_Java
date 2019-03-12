public class VideoStore extends Video {
	
	Video[] store;
	int i = 0;
	
	VideoStore(String name){
		super(name);
	}
	
	String addVideo(String name) {    // to add video
		setVideoName(i, name);
		++i;
		return "Video is added successfully.";
	}
	
	String doCheckout(String name) {  // to do checkout
		
		
		int j,index=0;
		for(j = 0 ;j < i; j++)
		{
			if(videoName[j].equals(name))
			{
				index=j;
				break;
			}
		}
		
		if (i != j) {
			doCheckout(index);
			System.out.println("\nVideo " + name + " checked out successfuly.\n");
			return "The video has been checked successfully.";
		}
		
		else{
			System.out.println("\nSorry this video is not present in the inventory \n");
			return "The video has not been checked out.";
		}
	}
	
	String doReturn(String name) {   // to do return
		
		int j,index = 0;
		for(j = 0; j < i; j++)
		{
			if(videoName[j].equals(name))
			{
				index=j;
				break;
			}
		}
		if (i != j) {
			doReturn(index);
			System.out.println("\nVideo " + name + " returned successfuly\n");
			return "The video has been returned successfully.";
		}
		else {
			System.out.println("\nSorry this video is not present in the inventory \n");
			return "\nSorry this video is not present in the inventory \n";
		}
		
	}	
	
	String recieveRating(String name, int rating) {   // to recieve rating
		int j, index = 0;
		for(j = 0; j < i; ++j) {
			if(videoName[j].equals(name)) {
				index = j;
				break;
			}
		}
		if (i != j) {
			recieveRating(index, rating);
			System.out.println("\nRating " + rating + " has been mapped to the video " + name + ".\n");
			return "Rating has been mapped to the video.";
		}
		else {
			System.out.println("\nSorry this video is not present in the inventory \n");
			return "Sorry this video is not present in the inventory.";
		}
	}
	
	void listInventory() {    // to display inventory
		for (int j = 0; j < i ; j++) {
			System.out.print(videoName[j] + "\t\t|");
			System.out.print("\t" + getCheckout(j) + "\t\t|");
			System.out.println("\t" + getRating(j));
			System.out.println();
		}
	}
	

}