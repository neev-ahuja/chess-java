import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class flag{
    static String flag = "free";
    static boolean[][] dots = new boolean[9][9];
    static int[] pos = new int[2];
    static String piece = "";
}

class button{
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    public void create(int row , JFrame frame){
        
        //Row Manipulation  
        int y = 70*(row-1);

        //Colours Manipulation
        Color color1 , color2;
        if(row%2==0){
            color1 = Color.black;
            color2 = Color.white;
        } else{
            color1 = Color.white;
            color2 = Color.black;
        }

        //buttons or all boxes 
        button1.setBounds(0, y, 70, 70);
        frame.add(button1);
        button1.setBackground(color1);

        button2.setBounds(70, y, 70, 70);
        frame.add(button2);
        button2.setBackground(color2);

        button3.setBounds(140, y, 70, 70);
        frame.add(button3);
        button3.setBackground(color1);

        button4.setBounds(210, y, 70, 70);
        frame.add(button4);
        button4.setBackground(color2);

        button5.setBounds(280, y, 70, 70);
        frame.add(button5);
        button5.setBackground(color1);

        button6.setBounds(350, y, 70, 70);
        frame.add(button6);
        button6.setBackground(color2);

        button7.setBounds(420, y, 70, 70);
        frame.add(button7);
        button7.setBackground(color1);
        
        button8.setBounds(490, y, 70, 70);
        frame.add(button8);
        button8.setBackground(color2);
        if(row==8){
            JButton btn9 = new JButton();
            frame.add(btn9);
            btn9.setBounds(490, 490, 1, 1);
            btn9.setBackground(Color.white);
        }
    }
}

class ui implements ActionListener {
    JFrame frame = new JFrame();
    button row1 = new button();
    button row2 = new button();
    button row3 = new button();
    button row4 = new button();
    button row5 = new button();
    button row6 = new button();
    button row7 = new button();
    button row8 = new button();

    public void move(int x , int y , ImageIcon icon){
        if(y==1){
            if(x==1){
                row1.button1.setIcon(icon);;
            } 
            else if(x==2){
                row1.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row1.button3.setIcon(icon);
            }
            else if(x==4){
                row1.button4.setIcon(icon);
            }
            else if(x==5){
                row1.button5.setIcon(icon);
            }
            else if(x==6){
                row1.button6.setIcon(icon);
            }
            else if(x==7){
                row1.button7.setIcon(icon);
            }
            else if(x==8){
                row1.button8.setIcon(icon);
            }
        }

        if(y==2){
            if(x==1){
                row2.button1.setIcon(icon);;
            } 
            else if(x==2){
                row2.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row2.button3.setIcon(icon);
            }
            else if(x==4){
                row2.button4.setIcon(icon);
            }
            else if(x==5){
                row2.button5.setIcon(icon);
            }
            else if(x==6){
                row2.button6.setIcon(icon);
            }
            else if(x==7){
                row2.button7.setIcon(icon);
            }
            else if(x==8){
                row2.button8.setIcon(icon);
            }
        }
    
        if(y==3){
            if(x==1){
                row3.button1.setIcon(icon);;
            } 
            else if(x==2){
                row3.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row3.button3.setIcon(icon);
            }
            else if(x==4){
                row3.button4.setIcon(icon);
            }
            else if(x==5){
                row3.button5.setIcon(icon);
            }
            else if(x==6){
                row3.button6.setIcon(icon);
            }
            else if(x==7){
                row3.button7.setIcon(icon);
            }
            else if(x==8){
                row3.button8.setIcon(icon);
            }
        }
    
        if(y==4){
            if(x==1){
                row4.button1.setIcon(icon);;
            } 
            else if(x==2){
                row4.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row4.button3.setIcon(icon);
            }
            else if(x==4){
                row4.button4.setIcon(icon);
            }
            else if(x==5){
                row4.button5.setIcon(icon);
            }
            else if(x==6){
                row4.button6.setIcon(icon);
            }
            else if(x==7){
                row4.button7.setIcon(icon);
            }
            else if(x==8){
                row4.button8.setIcon(icon);
            }
        }
    
        if(y==5){
            if(x==1){
                row5.button1.setIcon(icon);;
            } 
            else if(x==2){
                row5.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row5.button3.setIcon(icon);
            }
            else if(x==4){
                row5.button4.setIcon(icon);
            }
            else if(x==5){
                row5.button5.setIcon(icon);
            }
            else if(x==6){
                row5.button6.setIcon(icon);
            }
            else if(x==7){
                row5.button7.setIcon(icon);
            }
            else if(x==8){
                row5.button8.setIcon(icon);
            }
        }

        if(y==6){
            if(x==1){
                row6.button1.setIcon(icon);;
            } 
            else if(x==2){
                row6.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row6.button3.setIcon(icon);
            }
            else if(x==4){
                row6.button4.setIcon(icon);
            }
            else if(x==5){
                row6.button5.setIcon(icon);
            }
            else if(x==6){
                row6.button6.setIcon(icon);
            }
            else if(x==7){
                row6.button7.setIcon(icon);
            }
            else if(x==8){
                row6.button8.setIcon(icon);
            }
        }

        if(y==7){
            if(x==1){
                row7.button1.setIcon(icon);;
            } 
            else if(x==2){
                row7.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row7.button3.setIcon(icon);
            }
            else if(x==4){
                row7.button4.setIcon(icon);
            }
            else if(x==5){
                row7.button5.setIcon(icon);
            }
            else if(x==6){
                row7.button6.setIcon(icon);
            }
            else if(x==7){
                row7.button7.setIcon(icon);
            }
            else if(x==8){
                row7.button8.setIcon(icon);
            }
        }

        if(y==8){
            if(x==1){
                row8.button1.setIcon(icon);;
            } 
            else if(x==2){
                row8.button2.setIcon(icon);
            } 
            else if(x ==3 ){
                row8.button3.setIcon(icon);
            }
            else if(x==4){
                row8.button4.setIcon(icon);
            }
            else if(x==5){
                row8.button5.setIcon(icon);
            }
            else if(x==6){
                row8.button6.setIcon(icon);
            }
            else if(x==7){
                row8.button7.setIcon(icon);
            }
            else if(x==8){
                row8.button8.setIcon(icon);
            }
        }
    
    }


    public void spMove(int x, int y){
        if(flag.piece == "wpawn"){
            move(x, y, icons.WhitePawn);
        } 
    }


    public void start() throws IllegalArgumentException, IllegalAccessException{
        //frame settings
        frame.setTitle("Chess");
        frame.setSize(575,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        //icon
        ImageIcon icon = new ImageIcon("data//logo.jpg");
        frame.setIconImage(icon.getImage());

        row1.create(1 , frame);
        row2.create(2 , frame);
        row3.create(3 , frame);
        row4.create(4 , frame);
        row5.create(5 , frame);
        row6.create(6 , frame);
        row7.create(7 , frame);
        row8.create(8 , frame);
        
        
        //Button Event Listeners
        for(Field btn : row8.getClass().getDeclaredFields()){
            ((JButton) btn.get(row8)).addActionListener(this);
            ((JButton) btn.get(row7)).addActionListener(this);
            ((JButton) btn.get(row6)).addActionListener(this);
            ((JButton) btn.get(row5)).addActionListener(this);
            ((JButton) btn.get(row4)).addActionListener(this);
            ((JButton) btn.get(row3)).addActionListener(this);
            ((JButton) btn.get(row2)).addActionListener(this);
            ((JButton) btn.get(row1)).addActionListener(this);
            
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((JButton) e.getSource()).getIcon() == icons.WhitePawn){
            if(flag.flag == "free"){
                JButton btn = (JButton) e.getSource();
                JButton checkbtn1 = new JButton() , checkbtn2 = new JButton();
                int x = (btn.getX()+70)/70;
                int y = (btn.getY()+70)/70;
                for(Field button : row8.getClass().getDeclaredFields()){
                    try {
                        JButton resButton = ((JButton) button.get(row8));
                        boolean con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        boolean con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row7));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row6));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        System.out.println(con1 + "" + con2);
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row5));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row4));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row3));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row2));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        resButton = ((JButton) button.get(row1));
                        con1 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-1;
                        con2 = ((resButton.getX()+70)/70)==x && ((resButton.getY()+70)/70)==y-2;
                        
                        if(con1 || con2){
                            checkbtn1 = resButton;
                        }
                        
                    } catch (IllegalArgumentException | IllegalAccessException e1) {
                        e1.printStackTrace();
                    }
                    if(checkbtn1.getIcon()==null && checkbtn2.getIcon()==null){
                        move(x, y-1, icons.dot);
                        move(x, y-2, icons.dot);
                        flag.pos[0] =x ;
                        flag.pos[1] = y;
                        flag.flag = "busy";
                        flag.dots[y-1][x] = true;
                        flag.dots[y-2][x] = true;
                        flag.piece = "wpawn";
                    } else if(checkbtn2.getIcon()==null){
                        move(x, y-1, icons.dot);
                        flag.pos[0] =x ;
                        flag.pos[1] = y;
                        flag.flag = "busy";
                        flag.dots[y-1][x] = true;
                        flag.piece = "wpawn";
                    }
                   
                }
            } else if(flag.flag.compareTo("busy")==0){
                for(int i = 1 ; i <9 ; i++){
                    for(int j =1 ; j< 9 ; j++){
                        if(flag.dots[i][j]==true){
                            move(j, i, null);
                        }
                    }
                }   
                flag.flag = "free";
            }
            
        } else if(((JButton) e.getSource()).getIcon() == icons.dot){
            JButton btn = (JButton) e.getSource();
            int x = (btn.getX()+70)/70;
            int y = (btn.getY()+70)/70;
            for(int i = 1 ; i <9 ; i++){
                for(int j =1 ; j< 9 ; j++){
                    if(flag.dots[i][j]==true){
                        move(j, i, null);
                        flag.dots[i][j] = false;
                    } 
                }
            }
            spMove(x, y);
            move(flag.pos[0], flag.pos[1], null);
            
            flag.flag = "free";
        }
    }
}
