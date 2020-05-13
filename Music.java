package Music;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine.Info;

public class Music {
	File bgm;
	AudioInputStream stream;
	AudioFormat format;
	Info infObj;

	String fileName;
	Clip clip;

	public Music(String name) {
		fileName = name;
	}

	boolean loop = true;
	public void Play() {
		try {
			bgm = new File(Main.Main.class.getResource("../Song/" + fileName).toURI()); // 사용시에는 개별 폴더로 변경할 것
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			infObj = new Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(infObj);
			clip.open(stream);
			clip.start();
			if (loop) clip.loop(-1);

		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Stop() {
		try {
			if (clip != null)
				clip.stop();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
}