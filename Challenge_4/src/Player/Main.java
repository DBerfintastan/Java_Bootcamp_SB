package Player;

public class Main {

	public static void main(String[] args) {

		Video videoPlayer = new Video("1080p");
		Music musicPlayer = new Music();

		videoPlayer.addMedia("Video 1");
		videoPlayer.addMedia("Video 2");
		videoPlayer.addMedia("Video 3");
		videoPlayer.addMedia("Video 4");
		videoPlayer.play("Video 1");
		videoPlayer.pause();
		videoPlayer.play("Video 2");
		videoPlayer.play("Video 2");
		videoPlayer.stop();
		videoPlayer.removeMedia("Video 1");
		
		System.err.println("-------------------");
		
		musicPlayer.addMedia("Şarkı 1");
		musicPlayer.addMedia("Şarkı 2");
		musicPlayer.play("Şarkı 1");
		musicPlayer.play("Şarkı 2");
		musicPlayer.pause();
		musicPlayer.play("Şarkı 2");
		musicPlayer.stop();
		musicPlayer.removeMedia("Şarkı 1");
		
		System.err.println("-------------------");
		
		musicPlayer.displayMediaList();
		videoPlayer.displayMediaList();
	}

}
