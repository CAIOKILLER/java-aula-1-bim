package flowlayoutframe;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {

      private JButton leftJButton;
      private JButton centerJButton;
      private JButton rightJButton;
      private FlowLayout layout;
      private Container container;
      
 public FlowLayoutFrame(){
     super("FlowLayout Demo");
     
     layout = new FlowLayout(); // cria FlowLayout container getContentPane(); // obtém contéiner para layout setLayout(layout); // configura o layout de frame

container = getContentPane();
setLayout(layout);

leftJButton = new JButton("Left");
add(leftJButton);
leftJButton.addActionListener(
      new ActionListener(){
    

 public void actionPerformed (ActionEvent event ){
     layout.setAlignment (FlowLayout.LEFT);
     
     layout.layoutContainer(container);
  }
 } 
); 
centerJButton = new JButton("Center");
add(centerJButton);
centerJButton.addActionListener(
   
        new ActionListener(){
     
     public void actionPerformed(ActionEvent event){
         layout.setAlignment (FlowLayout.LEFT);
     
     layout.layoutContainer(container);
     }
 }
);
 rightJButton = new JButton("Right");
 add(rightJButton);
 rightJButton.addActionListener(
     new ActionListener(){
          public void actionPerformed(ActionEvent event){
         layout.setAlignment (FlowLayout.LEFT);
     
     layout.layoutContainer(container);
     }
     }
 );
}
}
