package org.structuralPattern;

interface MediaPlayer {
	void play(String audioType, String fileName);
}

interface AdvanceMediaPlayer {
	void playVlc(String fileName);

	void playMp4(String fileName);
}

class VlcPlayer implements AdvanceMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing VLC fileName :" + fileName);

	}

	public void playMp4(String fileName) {

	}

}

class Mp4Player implements AdvanceMediaPlayer {

	public void playVlc(String fileName) {

	}

	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 fileName:" + fileName);

	}

}

class MediaAdapter implements MediaPlayer {
	AdvanceMediaPlayer mediaPlayer;

	public MediaAdapter(String audioType) {

		if (audioType.equals("vlc")) {
			mediaPlayer = new VlcPlayer();
		} else if (audioType.equals("mp4")) {
			mediaPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {
		if (audioType.equals("vlc")) {
			mediaPlayer.playVlc(fileName);
		} else if (audioType.equals("mp4")) {
			mediaPlayer.playMp4(fileName);
		}
	}

}

public class AdaptorExample implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file: " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media type: " + audioType);
		}
	}

	public static void main(String[] args) {
		AdaptorExample example = new AdaptorExample();
		example.play("mp3", "song.mp3");
		example.play("mp4", "movie.mp4");
		example.play("vlc", "video.vlc");
		example.play("avi", "file.avi");

	}
}
