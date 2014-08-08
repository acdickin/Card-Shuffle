package com.adickinson.program;
import javax.imageio.ImageIO;
import javax.swing.*; 

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//IO files
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CardGUI {
	BufferedImage img=null;
	


	private final int IMAGE_WIDTH=200;
	private final int IMAGE_HEIGHT=500;
	private final String IMG_PATH="Image\\";
	private JFrame frame;
	private JPanel panel;
	private JLabel prompt;
	private JTextField numberField;
	private JButton button;
	private JPanel picturePanel;
	Card C;
	Deck deck;
	public CardGUI(){
		deck= new Deck();
		C=new Card();	
		createFrame();
	}

	private void createFrame(){
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(200,200,400,400);
			frame.add(createPanel());
			frame.setVisible(true);
	
		
	}
	
	private JPanel createPanel(){
		panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(createTopPanel(), BorderLayout.NORTH);
         return panel;
	}
	
	private JPanel createTopPanel(){
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		prompt= new JLabel("How many Cards");
		numberField = new JTextField(10);
		
		button = new JButton("Get Cards");
		button.addActionListener(new PictureListener());
		//pictureLabel = new JLabel();
		
		
         topPanel.add(prompt);
         topPanel.add(numberField);
         topPanel.add(button);
         
         return topPanel;
	}
	private class PictureListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
		
			int	numCards = Integer.parseInt(numberField.getText());
			picturePanel=new JPanel();
			picturePanel.setLayout(new FlowLayout(FlowLayout.LEFT));			 
			 BufferedImage img=null;
			 Integer.parseInt(numberField.getText());
			try{
				frame.dispose();
				createFrame();
				int total=1;
				while(total<=numCards ){
				total++;
				 
				C = deck.drawFromDeck();
				String fileImg=(IMG_PATH+ C.returnImg()+".gif");
				img= ImageIO.read(new File(fileImg));
				ImageIcon icon = new ImageIcon(img);
				JLabel label = new JLabel(icon);
				new JLabel(C.getSuit()+" "+C.getValue());
				
				picturePanel.add(label, BorderLayout.	WEST);
				 }
				panel.add(picturePanel, BorderLayout.CENTER);
					frame.setBounds(200,200,numCards *(IMAGE_WIDTH),IMAGE_HEIGHT);
					
					//frame.revalidate();
					//frame.repaint();
					
					
			 }catch(IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
			
			}
		}
	
	}
