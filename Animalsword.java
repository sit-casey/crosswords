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

public class Animalsword extends JFrame{

	private JPanel screen;
	private JTextField[][] boxes;
	private Font type;
	private boolean flip = false;
	private JButton hint;
	private JButton checkwin;
	private JButton addlabel;
	
	//20 columns and 14 rows
	public Animalsword(){
		super("Animal Crossword Puzzle");
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
		boxes = new JTextField[14][20];
	}
	
	private void textsetup(){
		for(int r = 0; r <14;r++){
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

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Down:\n" +
													"1. Bear that eats berries and seal." +
													"\n2. Animal that hates people and other animals, literally swims islands to get away." +
													"\n4. Known for carrying stuff across the desert" +
													"\n5. As common as Man's Best Friend" +
													"\n6. South American countries eat it, US people adore it" +
													"\n9. Cold birds" +
													"\n14. Nocturnal bird" +
													"\n" +
													"\nAcross:" +
													"\n3. City bird known for poop bombs on innocent bystanders" +
													"\n7. Sea Cow" +
													"\n8. Smallest bird" +
													"\n9. Farm animal that people really like, or religion dislikes" +
													"\n10. Can be found in cities scaling trees." +
													"\n11. Endangered fluffy bear in China" +
													"\n12. An animal of mismatched features from others. Very lost." +
													"\n13. Common aquatic pet.");
				
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
		for(int r = 0; r<=3-1;r++){
			for(int c = 0; c<=8-1;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[0][8].setEditable(false);
		boxes[0][10].setEditable(false);
		boxes[0][11].setEditable(false);
		boxes[0][13].setEditable(false);
		boxes[4][18].setEditable(false);
		boxes[4][19].setEditable(false);
		
		for(int r = 0; r<=2;r++){
			for(int c = 14;c<boxes[0].length;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[2][8].setEditable(false);
		boxes[2][10].setEditable(false);
		boxes[2][11].setEditable(false);
		boxes[2][13].setEditable(false);
		
		for(int c=1;c<=8;c++){
			boxes[3][c].setEditable(false);
		}
		
		for(int r =4;r<=5;r++){
			for(int c =1;c<=5;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[4][7].setEditable(false);
		boxes[5][8].setEditable(false);
		boxes[4][8].setEditable(false);
		boxes[5][7].setEditable(false);
		boxes[3][10].setEditable(false);
		boxes[3][11].setEditable(false);
		boxes[4][10].setEditable(false);
		boxes[5][10].setEditable(false);
		boxes[5][11].setEditable(false);
		boxes[3][13].setEditable(false);
		
		for(int c = 15; c<boxes[0].length;c++){
			boxes[3][c].setEditable(false);
			boxes[5][c].setEditable(false);
		}
		
		boxes[5][13].setEditable(false);
		boxes[6][1].setEditable(false);
		
		for(int c = 13; c<=15;c++){
			boxes[6][c].setEditable(false);
		}
		
		for(int c = 1;c<=5;c++){
			boxes[7][c].setEditable(false);
		}
		
		for(int r = 9;r<boxes.length;r++){
			boxes[r][0].setEditable(false);
		}
		
		for(int r = 7;r<boxes.length;r++){
			boxes[r][20-1].setEditable(false);
		}
		
		for(int r = 9;r<=10;r++){
			for(int c = 1;c<=5;c++){
				boxes[r][c].setEditable(false);
			}
		}
		
		boxes[12][1].setEditable(false);
		boxes[13][1].setEditable(false);
		boxes[7][7].setEditable(false);
		boxes[7][8].setEditable(false);
		boxes[7][10].setEditable(false);
		boxes[7][11].setEditable(false);
		boxes[7][13].setEditable(false);
		boxes[7][14].setEditable(false);
		boxes[7][15].setEditable(false);
		boxes[7][17].setEditable(false);
		boxes[7][18].setEditable(false);
		boxes[8][8].setEditable(false);
		boxes[8][10].setEditable(false);
		boxes[8][11].setEditable(false);
		boxes[8][13].setEditable(false);
		boxes[9][7].setEditable(false);
		boxes[9][8].setEditable(false);
		boxes[9][10].setEditable(false);
		boxes[9][11].setEditable(false);
		boxes[9][13].setEditable(false);
		boxes[9][14].setEditable(false);
		boxes[9][15].setEditable(false);
		boxes[9][17].setEditable(false);
		boxes[9][18].setEditable(false);
		boxes[10][7].setEditable(false);
		boxes[10][8].setEditable(false);
		boxes[10][9].setEditable(false);
		boxes[10][18].setEditable(false);
		
		for(int c = 9;c<=15;c++){
			boxes[11][c].setEditable(false);
			boxes[12][c].setEditable(false);
			boxes[13][c].setEditable(false);
		}
		
		boxes[11][17].setEditable(false);
		boxes[11][18].setEditable(false);
		boxes[12][17].setEditable(false);
		boxes[12][18].setEditable(false);
		boxes[13][16].setEditable(false);
		boxes[13][17].setEditable(false);
		boxes[13][18].setEditable(false);
		
		for(int c = 3;c<=8;c++){
			boxes[12][c].setEditable(false);
			boxes[13][c].setEditable(false);
		}
		boxes[12][6].setEditable(true);
				
		
		for(int r = 0;r<boxes.length;r++){
			for(int c =0; c<boxes[0].length;c++){
				if(!(boxes[r][c].isEditable())){
					boxes[r][c].setBackground(Color.BLACK);
				}
			}
		}
		
		}
		
	private void numberLabel(){
		boxes[0][9].setText("1");
		boxes[0][12].setText("2");
		boxes[1][8].setText("3");
		boxes[3][0].setText("4");
		boxes[3][14].setText("5");
		boxes[4][6].setText("6");
		boxes[4][11].setText("7");
		boxes[6][2].setText("8");
		boxes[6][16].setText("9");
		boxes[8][0].setText("10");
		boxes[8][14].setText("11");
		boxes[10][10].setText("12");
		boxes[11][1].setText("13");
		boxes[11][2].setText("14");
	}
		
	private boolean winCondition(){
		if(Word1().equalsIgnoreCase("pizzlyBear")&&  Word2().equalsIgnoreCase("lowlandanoa")&&
		   Word3().equalsIgnoreCase("pigeon") && Word4().equalsIgnoreCase("camels") &&
		   Word5().equalsIgnoreCase("cat")&&  Word6().equalsIgnoreCase("guineaPig") &&
		   Word7().equalsIgnoreCase("manatee")&& Word8().equalsIgnoreCase("hummingbird")&&
		   Word9Hori().equalsIgnoreCase("pigs") && Word9Verti().equalsIgnoreCase("penguin")&&
		   Word10().equalsIgnoreCase("squirrel") && Word11().equalsIgnoreCase("panda") &&
		   Word12().equalsIgnoreCase("platypus")&& Word13().equalsIgnoreCase("goldfish")&&
		   Word14().equalsIgnoreCase("owl")){
			
			return true;
			
		}
		return false;
	}

	private String Word1(){
		String word1 = "";
		for(int r = 0;r<=9;r++){
			word1 += boxes[r][9].getText();
		}
		System.out.println(word1);
		return word1;
	}
	
	private String Word2(){
		String word2 = "";
		for(int r =0;r<=10;r++){
			word2 += boxes[r][12].getText();
		}
		System.out.println(word2);
		return word2;
	}
	private String Word3(){
		String word3 = "";
		for(int c=8;c<=13;c++){
			word3 += boxes[1][c].getText();
		}
		System.out.println(word3);

		return word3;
	}
	
	private String Word4(){
		String word4 = "";
		for(int r = 3;r<=8;r++){
			word4 +=boxes[r][0].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word5(){
		String word5 = "";
		for(int r = 3;r<=5;r++){
			word5 +=boxes[r][14].getText();
		}
		System.out.println(word5);

		return word5;
	}
	
	private String Word6(){
		String word6 = "";
		for(int r = 4;r<=12;r++){
			word6+=boxes[r][6].getText();
		}
		return word6;
	}
	
	private String Word7(){
		String word4 = "";
		for(int r = 11;r<=17;r++){
			word4+=boxes[4][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word8(){
		String word4 = "";
		for(int r = 2;r<=12;r++){
			word4+=boxes[6][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word9Hori(){
		String word4 = "";
		for(int r = 16;r<=19;r++){
			word4+=boxes[6][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word9Verti(){
		String word9 = "";
		for(int r = 6;r<=12;r++){
			word9 +=boxes[r][16].getText();
		}
		System.out.println(word9);

		return word9;
	}
	
	private String Word10(){
		String word4 = "";
		for(int r = 0;r<=7;r++){
			word4+=boxes[8][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word11(){
		String word4 = "";
		for(int r = 14;r<=18;r++){
			word4+=boxes[8][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word12(){
		String word4 = "";
		for(int r = 10;r<=17;r++){
			word4+=boxes[10][r].getText();
		}
		System.out.println(word4);

		return word4;
	}
	
	private String Word13(){
		String word4 = "";
		for(int r = 1;r<=8;r++){
			word4+=boxes[11][r].getText();
		}		
		System.out.println(word4);

		return word4;
	}
	
	private String Word14(){
		String word4 = "";
		for(int r = 11;r<=13;r++){
			word4+=boxes[r][2].getText();
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
	


