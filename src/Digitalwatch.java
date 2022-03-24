import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Digitalwatch extends JFrame
{
	Calendar calendar;
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	String time;
	Digitalwatch()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock");
		this.setSize(400,150);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Ink Free",Font.PLAIN,60));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		this.add(timeLabel);
		this.setVisible(true);
		setTime();
	}
	public void setTime()
	{
		while(true)
		{
			time=timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 
}
