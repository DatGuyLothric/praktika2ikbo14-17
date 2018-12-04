package com.pract4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NullLayout extends JFrame{
	
	JButton bMilan = new JButton("AC Milan");
	JButton bMadrid = new JButton("Real Madrid");
	int sMilan = 0;
	int sMadrid = 0;
	JLabel lResult = new JLabel("Result: " + sMilan + " X " + sMadrid);
	JLabel lLast = new JLabel("Last Scored: N/A");
	Label lWinner = new Label("Winner: Draw");
	
    void addScore(){
    	
        bMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
            	sMilan++;
                lLast.setText("Last Scored: Milan");
                lResult.setText("Result: " + sMilan + " X " + sMadrid);
                winner(sMilan, sMadrid);
            }
        });

        bMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
            	sMadrid++;
                lLast.setText("Last Scored: Madrid");
                lResult.setText("Result: " + sMilan + " X " + sMadrid);
                winner(sMilan, sMadrid);
            }
        });

    }
    
    void winner(int sMilan, int sMadrid) {
    	
    	if(sMilan < sMadrid){
            lWinner.setText("Winner: Real Madrid");
        }
    	
        if (sMilan == sMadrid){
            lWinner.setText("Winner: DRAW");
        }
        
        if(sMilan > sMadrid){
            lWinner.setText("Winner: AC Milan");
        }
    	
    }
    
    NullLayout(){
    	
        setLayout(null);
        lResult.setBounds(200, 0, 150, 50);
        lLast.setBounds(200, 250, 150, 50);
        lWinner.setBounds(200, 75, 150, 50);
        bMilan.setBounds(75, 150, 150, 50);
        bMadrid.setBounds(400-75-50, 150, 150, 50);
        addScore();
        add(lLast);
        add(lResult);
        add(lWinner);
        add(bMilan);
        add(bMadrid);
        setSize(500, 350);
        
    }

}
