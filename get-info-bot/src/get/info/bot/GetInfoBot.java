/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get.info.bot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Nkateko Nkuna
 */
public class GetInfoBot extends JComponent implements ActionListener{

 

    String N;
    int  velX =254;
    int velY =22;
    int vel =2;
    Timer t = null;

 

    JTextField tf = new JTextField();
    JTextArea ta = new JTextArea();
    JLabel jl = new JLabel();
    int ballX = 120;
    int ballY =20;
    int x =150;
    int y = 220;
    
    
    public GetInfoBot(){
        tf.setLocation(22,560);
        tf.setSize(300,30);
        this.add(tf);
        
        // Chat Area
        ta.setLocation(22,2);
        ta.setSize(340,520);
        this.add(ta);
        
        
        
        tf.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                String Me =tf.getText();
                ta.append(" You : "+Me + "\n");
                tf.setText("");
                
              
                 
                        if(Me.contains("Hi")){
                            Replies("Hello There."); 
                        }
                        else if(Me.contains("How are you")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I am well how are you?");
                        }
                            else if(rdm ==3){
                        Replies("I am great I hope you are great too..");
                                
                            }
                            
                        } 
                        else if(Me.contains("How are you")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("Good Thanks.");
                        }
                            else if(rdm ==3){
                        Replies("Not Too Bad Thanks");
                                
                            }
                            
                        } 
                        else if(Me.contains("name")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I am a piece of software called Wizard Niggaracci");
                        }
                            else if(rdm ==3){
                        Replies("I am Niggaracci");
                                
                            }
                            
                        } 
                         else if(Me.contains("fuck")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("Please do not swear..");
                        }
                            else if(rdm ==3){
                        Replies("Could we please keep it PG 13?");
                                
                            }
                            
                        } 
                          else if(Me.contains("where")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I am no quite sure could you inform me?.");
                        }
                            else if(rdm ==3){
                        Replies("I do not know");
                                
                            }
                            
                        } 
                           else if(Me.contains("siri")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("You know about Apples assistant as well?");
                        }
                            else if(rdm ==3){
                        Replies("I think Siri is a really great assistant");
                                
                            }
                            
                        } 
                            else if(Me.contains("racism")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I would rather not say much about this topic as it is a very controversial topic.");
                        }
                            else if(rdm ==3){
                        Replies("I believe we there's more to a human being than their skin color");
                                
                            }
                            
                        } 
                            else if(Me.contains("weed")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I see nothing wrong with the occasional blunt"+"\n"+" but it is a problem when its a coping mechanism");
                        }
                            else if(rdm ==3){
                        Replies("Marijuana makes you lazy!!!");
                                
                            }
                            
                        } 
                           else if(Me.contains("name")){
                                 int rdm = (int) (Math.random()*1+1);
                            if (rdm ==1){
                        Replies ("I am a software called Niggaracci."+"\n"+"Programmed by Teko or Niggracci");
                        }
                        } 
                            else if(Me.contains("made")){
                                 int rdm = (int) (Math.random()*3+2);
                            if (rdm ==2){
                        Replies ("I was created to keep the regular human-"+"\n"+" being entertained.");
                        }
                            else if(rdm ==3){
                        Replies("My Creator,Niggaracci");
                                
                            }
                            
                        } 
                        else {
                            int rdm = (int) (Math.random()*2+1);
                            if (rdm ==1){
                        Replies ("Please rephrase your text");
                        }
                            else if(rdm ==2){
                        Replies("The program was not programmed"+"\n"+"to interact like that");
                                
                            }
                        }

                 }
       });      
    }
    public void Replies(String s){
        ta.append("Wizard Niggaracci :" + s +"\n");
    }

 public void paintComponent(Graphics g){
     g.setColor(new Color(255,38,175));
     g.fillRect(0, 0, 400, 600);
         
 }
   public void actionPerformed(ActionEvent e) {
   
   }
 
    public static void main(String[] args) {
        GetInfoBot gib = new GetInfoBot();
        JFrame f = new JFrame ();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,600);
        f.setTitle("get_InfoBot");
        f.setVisible(true);
        f.add(gib);
        
        
        
    }
    
}


