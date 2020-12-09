package cobatimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BreakCobaTimer extends CobaTimer{

	public BreakCobaTimer() {
		// TODO Auto-generated constructor stub
		this.duration = 300000;
		clock = new JLabel(sdf.format(new Date(duration)),JLabel.CENTER);
		long x = 0;
		al = new ActionListener() {
			long x = duration - 1000;
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				clock.setText(sdf.format(new Date(x)));
		        x -= 1000;
			}
		};
		
		new javax.swing.Timer(1000, al).start();
		jp = new JPanel();
		jp.add(clock);
		getContentPane().add(jp);
	    pack();
	}

}
