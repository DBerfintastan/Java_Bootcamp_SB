package Player;

import java.util.ArrayList;
import java.util.List;

public class Video implements Player, Playlist {
	private boolean isPlaying = false;
	private String currentVideo = "";
	private List<String> videoList = new ArrayList<>();
	private String quality;

	public Video(String quality) {
		this.quality = quality;
	}

	@Override
	public void play(String video) {
		if (!isPlaying) {
			currentVideo = video;
			System.out.println("Playing video: " + video + " (Quality: " + quality + ")");
			isPlaying = true;
		} else {
			System.out.println("Video is already playing.");
		}
	}

	@Override
	public void pause() {
		if (isPlaying) {
			System.out.println("Paused: " + currentVideo);
			isPlaying = false;
		} else {
			System.out.println("Video is already paused.");
		}
	}

	@Override
	public void stop() {
		if (isPlaying) {
			System.out.println("Stopped: " + currentVideo);
			isPlaying = false;
			currentVideo = "";
		} else {
			System.out.println("Video is already stopped.");
		}
	}

	@Override
	public void addMedia(String video) {
		videoList.add(video);
		System.out.println(video + " added.");
	}

	@Override
	public void removeMedia(String video) {
		if (videoList.contains(video)) {
			videoList.remove(video);
			System.out.println(video + " removed from the list.");
		} else {
			System.out.println(video + " not found in the list.");
		}
	}

	@Override
	public void displayMediaList() {
		System.out.println("Video List:");
		for (String video : videoList) {
			System.out.println(video);
		}
	}
}
