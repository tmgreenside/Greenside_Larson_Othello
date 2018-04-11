/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenside_larson_Lee_othello;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author Trevor Greenside
 */
public class PlayerStart extends VBox {
    
    private String humanName;
    private final TextField getName;
    private final Label getNameLabel;
    private final ToggleGroup playerSelect;
    private Color chosenColor;
    
    public Button startButton;
    
    public PlayerStart() {
        getNameLabel = new Label("Name: ");
        getName = new TextField();
        playerSelect = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Black");
        rb1.setToggleGroup(playerSelect);
        rb1.setSelected(true);
        rb1.setOnAction((ActionEvent e) -> {
            chosenColor = Color.BLACK;
        });
        chosenColor = Color.BLACK;
        RadioButton rb2 = new RadioButton("White");
        rb2.setToggleGroup(playerSelect);
        rb2.setOnAction((ActionEvent e) -> {
            chosenColor = Color.WHITE;
        });
        
        startButton = new Button("Start");
        this.getChildren().addAll(getNameLabel, getName, rb1, rb2, startButton);
    }
    
    public String getPlayerName() {
        return getName.getText();
    }
    
    public Color getColor() {
        return chosenColor;
    }
}