import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WatchMy extends JFrame 
{
	Calendar calendar;
	
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	String time;
	String day;
	String date;
	
	WatchMy()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Watch");
		this.setSize(420,350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEE");
		dateFormat=new SimpleDateFormat("dd MMMMM, yyyy");
		
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Vendana",Font.PLAIN,60));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Vendana",Font.PLAIN,55));
		dayLabel.setForeground(new Color(0x00FF00));
		dayLabel.setBackground(Color.black);
		dayLabel.setOpaque(true);
		
		dateLabel=new JLabel();
		dateLabel.setFont(new Font("Vendana",Font.PLAIN,45));
		dateLabel.setForeground(new Color(0x00FF00));
		dateLabel.setBackground(Color.black);
		dateLabel.setOpaque(true);
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		this.setVisible(true);
		
		setTime();
	}
	public void setTime()
	{
		while(true)
		{
			
			time=timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day=dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date=dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
