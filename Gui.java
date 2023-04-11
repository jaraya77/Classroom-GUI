package edu.mhu.cs.johnnyaraya.finalexam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class Gui {
	private JFrame frame;
	private JButton btnSend;
	private JTextArea incoming;
	private JTextField msg;

	public static void main(String[] args) {
		
		Gui g = new Gui();
		g.go();
	}
	
	/*
	 * Copied GUI from SimpleChat example
	 */
	public void go() {
		
		frame = new JFrame("Course Importer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel mainPanel = new JPanel();
		
		incoming = new JTextArea(15, 30);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		
		JScrollPane scroller = new JScrollPane(incoming);
	
		btnSend = new JButton("Submit");
		btnSend.addActionListener(new SendButtonListener());
		
		//Set the "send" button as default - linked with "Enter' key
		frame.getRootPane().setDefaultButton(btnSend);
		
		msg = new JTextField(20);
		
		mainPanel.add(msg);
		mainPanel.add(btnSend);
		mainPanel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(600, 350);
		frame.setVisible(true);
	
	}
	
	class SendButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				String url = msg.getText();
				CourseImporter importer = new CourseImporter();
				importer.readCourseFile(url);
				incoming.append(importer.printInNameOrder());
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
		
		}
		}
}

