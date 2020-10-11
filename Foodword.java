package crossword;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Foodword extends JFrame{

		private JPanel screen;
		private JTextField[][] boxes;
		private Font type;
		private boolean flip = false;
		private JButton hint;
		private JButton checkwin;
		private JButton addlabel;
		
		//20 columns and 14 rows
		public Foodword(){
			super("Food Crossword Puzzle");
			instructions();
			setup();
			textsetup();
			setnull();
			numberLabel();
		}	
		
		private void setup(){
			screen = new JPanel();
			type = new Font("SansSerif", Font.BOLD,48);
			screen.setLayout(new GridLayout(0,20));
			boxes = new JTextField[15][20];
		}
		
		private void textsetup(){
			for(int r = 0; r <15;r++){
				for(int c = 0; c < 20;c++){
					JTextField box = new JTextField();
					boxes[r][c]=box;
					boxes[r][c].setFont(type);
					screen.add(boxes[r][c]);
				}
			}
			hint = new JButton("Hints");
			checkwin = new JButton("Check Win!");
			addlabel = new JButton("Re-add labeling!");
			
			hint.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Down:\n" +
														"2. Luxury that's likely to run out in the future" +
														"\n5. Truly American and fried" +
														"\n6. How many can you eat this year?" +
														"\n10. Smelly food" +
														"\n11. Steakhouse" +
														"\n" +
														"\nAcross:" +
														"\n1. Feeds a billion people daily" +
														"\n3. Keeps your friends away" +
														"\n4. Red bean paste" +
														"\n7. The most well known fruit" +
														"\n8. Two pronounciations: The authentic one and the one everyone uses" +
														"\n9. Baby oranges" +
														"\n12. Rice and seaweed" +
														"\n13. Creamy frozen dessert" +
														"\n14. The staple side of 'Murica");
					
				}
				
			});
			
			
			checkwin.addActionListener(new ActionListener(){

				
				public void actionPerformed(ActionEvent e) {
					if(winCondition()){
						JOptionPane.showMessageDialog(null, "Congratulations for winning! You have cleared the animal crossword!");
						JOptionPane.showMessageDialog(null, "If you check this on President's day uh..well. Otherwise, enjoy the other modes!");
						System.exit(0);
					}
					else{
						JOptionPane.showMessageDialog(null, "Sorry! One of your answers are incorrect. Please try again!");
					}
					
				}
				
			});
			
			addlabel.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					numberLabel();
					
				}
				
			});
			
			screen.add(hint);
			screen.add(checkwin);
			screen.add(addlabel);
			add(screen);
		}
		
	private void setnull(){
			
		for(int r = 0; r<=4;r++){
			for(int c=0;c<=11;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		for(int c=0;c<=10;c++){
			boxes[5][c].setEditable(false);
		}
			
		for(int r = 6;r<=11;r++){
			for(int c=0;c<=3;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[6][4].setEditable(false);
		boxes[6][5].setEditable(false);
		boxes[6][6].setEditable(false);
		boxes[14][0].setEditable(false);
		
		for(int c =0;c<=3;c++){
			boxes[13][c].setEditable(false);
		}
		
		for(int r =5;r<=7;r++){
			for(int c=12;c<=14;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		for(int c=4;c<=6;c++){
			boxes[6][c].setEditable(false);
			boxes[8][c].setEditable(false);
		}
		
		for(int c=8;c<=10;c++){
			boxes[6][c].setEditable(false);
			boxes[7][c].setEditable(false);
		}
		
		for(int r= 9;r<=13;r++){
			boxes[r][5].setEditable(false);
			boxes[r][6].setEditable(false);
		}
		
		for(int c =7;c<=10;c++){
			boxes[13][c].setEditable(false);
		}
		
		boxes[12][8].setEditable(false);
		
		for(int r=9;r<=11;r++){
			for(int c=8;c<=10;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[14][12].setEditable(false);
		boxes[14][13].setEditable(false);
		boxes[13][12].setEditable(false);
		boxes[13][13].setEditable(false);
		
		for(int r=7;r<=14;r++){
			for(int c= 17;c<=19;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[14][15].setEditable(false);
		boxes[14][16].setEditable(false);
		boxes[13][15].setEditable(false);
		boxes[13][16].setEditable(false);
		
		for(int c=12;c<=16;c++){
			boxes[9][c].setEditable(false);
			boxes[10][c].setEditable(false);
		}
		
		boxes[11][12].setEditable(false);
		boxes[11][13].setEditable(false);
		boxes[11][15].setEditable(false);
		boxes[11][16].setEditable(false);
		boxes[7][16].setEditable(false);
		boxes[8][16].setEditable(false);
		
		for(int r= 3;r<=5;r++){
			for(int c= 16;c<=19;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		for(int r= 0;r<=2;r++){
			boxes[r][18].setEditable(false);
			boxes[r][19].setEditable(false);
		}
		
		boxes[0][17].setEditable(false);
		boxes[1][17].setEditable(false);
		boxes[1][16].setEditable(false);
		boxes[0][12].setEditable(false);
		boxes[1][12].setEditable(false);
		boxes[1][13].setEditable(false);
		boxes[1][14].setEditable(false);
		boxes[3][12].setEditable(false);
		boxes[3][13].setEditable(false);
		boxes[3][14].setEditable(false);
		
		
		
		
			
		for(int r = 0;r<boxes.length;r++){
			for(int c =0; c<boxes[0].length;c++){
				if(!(boxes[r][c].isEditable())){
					boxes[r][c].setBackground(Color.BLACK);
				}
			}
		}
			
		}
			
		private void numberLabel(){
			boxes[0][13].setText("1");
			boxes[0][15].setText("2");
			boxes[2][12].setText("3");
			boxes[4][12].setText("4");
			boxes[5][11].setText("5");
			boxes[6][7].setText("6");
			boxes[6][15].setText("7");
			boxes[7][4].setText("8");
			boxes[8][7].setText("9");
			boxes[9][4].setText("10");
			boxes[11][14].setText("11");
			boxes[12][0].setText("12");
			boxes[12][9].setText("13");
			boxes[14][1].setText("14");
		}
			
		private boolean winCondition(){
			if(Word1().equalsIgnoreCase("rice")&&  Word2().equalsIgnoreCase("chocolate")&&
			   Word3().equalsIgnoreCase("onions") && Word4().equalsIgnoreCase("anko") &&
			   Word5().equalsIgnoreCase("friedoreos")&&  Word6().equalsIgnoreCase("hotdogs") &&
			   Word7().equalsIgnoreCase("apple")&& Word8().equalsIgnoreCase("gyro")&&
			   Word9Hori().equalsIgnoreCase("tangerine") && Word10().equalsIgnoreCase("durian") && 
			   Word11().equalsIgnoreCase("beef") &&
			   Word12().equalsIgnoreCase("sushi")&& Word13().equalsIgnoreCase("icecream")&&
			   Word14().equalsIgnoreCase("frenchfries")){
				
				return true;
				
			}
			return false;
		}

		private String Word1(){
			String word1 = "";
			for(int r = 13;r<=16;r++){
				word1 += boxes[0][r].getText();
			}
			System.out.println(word1);
			return word1;
		}
		
		private String Word2(){
			String word2 = "";
			for(int r =0;r<=8;r++){
				word2 += boxes[r][15].getText();
			}
			System.out.println(word2);
			return word2;
		}
		private String Word3(){
			String word3 = "";
			for(int c=12;c<=17;c++){
				word3 += boxes[2][c].getText();
			}
			System.out.println(word3);
			return word3;
		}
		
		private String Word4(){
			String word4 = "";
			for(int r = 12;r<=15;r++){
				word4 +=boxes[4][r].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word5(){
			String word5 = "";
			for(int r = 5;r<=14;r++){
				word5 +=boxes[r][11].getText();
			}
			System.out.println(word5);

			return word5;
		}
		
		private String Word6(){
			String word6 = "";
			for(int r = 6;r<=12;r++){
				word6+=boxes[r][7].getText();
			}
			return word6;
		}
		
		private String Word7(){
			String word4 = "";
			for(int r = 15;r<=19;r++){
				word4+=boxes[6][r].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word8(){
			String word4 = "";
			for(int r = 4;r<=7;r++){
				word4+=boxes[7][r].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word9Hori(){
			String word4 = "";
			for(int r = 7;r<=15;r++){
				word4+=boxes[8][r].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word10(){
			String word4 = "";
			for(int r = 9;r<=14;r++){
				word4+=boxes[r][4].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word11(){
			String word4 = "";
			for(int r = 11;r<=14;r++){
				word4+=boxes[r][14].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word12(){
			String word4 = "";
			for(int r = 0;r<=4;r++){
				word4+=boxes[12][r].getText();
			}
			System.out.println(word4);

			return word4;
		}
		
		private String Word13(){
			String word4 = "";
			for(int r = 9;r<=16;r++){
				word4+=boxes[12][r].getText();
			}		
			System.out.println(word4);

			return word4;
		}
		
		private String Word14(){
			String word4 = "";
			for(int r = 1;r<=11;r++){
				word4+=boxes[14][r].getText();
			}	
			System.out.println(word4);

			return word4;
		}
		
		private void instructions(){
			JOptionPane.showMessageDialog(null, "Welcome to my crossword puzzle!");
			JOptionPane.showMessageDialog(null, "To play, type one letter per text field. " +
					"\nWhen you are confident in your answer, please delete the number before pressing the check answer program!" + 
					"\nTo check answers, press the check answer button! To see hints, press the hint button! To add in the labels again, press the Add Labels button! WARNING IT OVERRIDES YOUR TEXT!");
		}

	}
