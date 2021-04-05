package thread;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class test7 {
public static void main(String[] args) throws AWTException, IOException {
	
	Robot r = new Robot();
	Rectangle rect = new Rectangle(0,0,1920,1080);
	
	
	BufferedImage img = r.createScreenCapture(rect);
	
	ImageIO.write(img, "png", new File("kh","capture.png"));//쉰기
	
	//화면만 네트워크로 보내고 싶으면 어떻게 해야 할까???
	//singlebyte로 보내면 된다.
	//
	
}
}
