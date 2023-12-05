

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Odd{
	JFrame frame = new JFrame();
	JLabel textField = new JLabel("0");
	JButton start, stop, reset;
	JButton number[] = new JButton[1];
	int x = 20;
	int y = 150;
	int width = 100;
	int height = 40;
	static int count = 0;

	 Odd(){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}	catch(Exception e){
           e.printStackTrace();
	   }
		

		frame.setSize(400, 500);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField.setBounds(100, 50, 200, 40);
		//textField.setEditable(false);
		//textField.setCaretColor(Color.white);
		textField.setForeground(Color.white);

		start = new JButton("Increment");
		stop = new JButton("Decrement");
		reset = new JButton("Reset");

		start.setFocusable(false);
		stop.setFocusable(false);
		reset.setFocusable(false);
        
        start.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        	     
             	textField.setText(""+ ++count);
            }
       });

        stop.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){

             textField.setText(""+ --count);
        	}
        });

        reset.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
             count = 0;
             textField.setText("0");
        	}
        });


		start.setBounds(x, y, width, height);
		stop.setBounds(x + x + width, y, width, height);
		reset.setBounds(x + x + x + width + width, y, width, height);

        frame.add(textField);
		frame.add(start);
		frame.add(stop);
		frame.add(reset);

		frame.setVisible(true);
	}

	public static void main(String args[]){
       new Odd();
	}

}