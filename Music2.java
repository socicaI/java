package Music;

public class Music2 extends Thread{
	Music m = new Music("sun.wav");
	boolean h = true;
	
	@Override
	public void run() {
		if(h==true) {
			m.Play();
		}else if(h==false) {
			m.Stop();
		}
	}
}
