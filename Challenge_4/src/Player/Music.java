package Player;

import java.util.ArrayList;
import java.util.List;

public class Music implements Player, Playlist {

	private boolean isPlaying = false;
	private String currentSong = "";
	private List<String> songList = new ArrayList<>();

	@Override
	public void play(String song) {
		if (!isPlaying) {
			currentSong = song;
			System.out.println("Playing song: " + song);
			isPlaying = true;
		} else {
			System.out.println("Music is already playing.");
		}
	}

	@Override
	public void pause() {
		if (isPlaying) {
			System.out.println("Paused: " + currentSong);
			isPlaying = false;
		} else {
			System.out.println("Music is already paused.");
		}
	}

	@Override
	public void stop() {
		if (isPlaying) {
			System.out.println("Stopped: " + currentSong);
			isPlaying = false;
			currentSong = "";
		} else {
			System.out.println("Music is already stopped.");
		}
	}

	@Override
	public void addMedia(String song) {
		songList.add(song);
		System.out.println(song + " added.");
	}

	@Override
	public void removeMedia(String song) {
		if (songList.contains(song)) {
			songList.remove(song);
			System.out.println(song + " removed from the list.");
		} else {
			System.out.println(song + " not found in the list.");
		}
	}

	@Override
	public void displayMediaList() {
		System.out.println("Song List:");
		for (String song : songList) {
			System.out.println(song);
		}
	}
}
