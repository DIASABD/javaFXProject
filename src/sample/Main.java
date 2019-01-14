package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.ScrollPane;


import java.util.Collection;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Metrics Project");
        Group  group = new Group();

        Color compColor = Color.BLUE;
        Rectangle classeName =new Rectangle();
        classeName.setFill(compColor);
        ScrollPane s1 = new ScrollPane();
        classeName.setWidth(120);
        classeName.setHeight(580);
        s1.setPrefSize(120, 580);
        classeName.setX(40);
        classeName.setY(20);
        s1.setContent(classeName);
        group.getChildren().add(s1);


        Rectangle attrClasse =new Rectangle();
        ScrollPane s2 = new ScrollPane();
        s2.setPrefSize(80, 300);
        s2.setContent(attrClasse);
        attrClasse.setFill(compColor);
        attrClasse.setX(10);
        attrClasse.setY(10);
        attrClasse.setWidth(30);
        attrClasse.setHeight(30);
        group.getChildren().add(s2);


        Rectangle OperClasse =new Rectangle();
        OperClasse.setX(20);
        OperClasse.setY(10);
        OperClasse.setWidth(30);
        OperClasse.setHeight(30);
        //group.getChildren().add(s1);

        Rectangle aggrClasse=new Rectangle();
        aggrClasse.setX(20);
        aggrClasse.setY(20);
        aggrClasse.setWidth(30);
        aggrClasse.setHeight(30);
        //group.getChildren().add(s1);

        Rectangle underClasse =new Rectangle();
        underClasse.setX(30);
        underClasse.setY(20);
        underClasse.setWidth(30);
        underClasse.setHeight(30);
       // group.getChildren().add(s1);

        Rectangle detailsClasse =new Rectangle();
        detailsClasse.setX(40);
        detailsClasse.setY(40);
        detailsClasse.setWidth(30);
        detailsClasse.setHeight(30);
       // group.getChildren().add(s1);



        Scene  scene = new Scene(group, 800, 600);

       //scene.setFill();
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
