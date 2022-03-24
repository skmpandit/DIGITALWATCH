import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockMy extends JFrame
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
	
	ClockMy()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock");
		this.setLayout(new FlowLayout());
		this.setSize(400,300);
		this.setResizable(false);
		
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEE");
		dateFormat=new SimpleDateFormat("MMMM dd, yyyy");
	
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Vendana",Font.PLAIN,45));
		timeLabel.setForeground(Color.YELLOW);
		timeLabel.setBackground(Color.red);
		timeLabel.setOpaque(true);
		
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Vendana",Font.PLAIN,35));
		dayLabel.setForeground(Color.green);
		dayLabel.setBackground(Color.blue);
		dayLabel.setOpaque(true);
		
		dateLabel=new JLabel();
		dateLabel.setFont(new Font("Vendana",Font.PLAIN,35));
		dateLabel.setForeground(Color.MAGENTA);
		dateLabel.setBackground(Color.DARK_GRAY);
		dateLabel.setOpaque(true);
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
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
