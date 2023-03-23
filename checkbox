package checkboxframe;

import java.awt. Font;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame{

private JTextField textField;
private JCheckBox boldJCheckBox;
private JCheckBox italicJCheckBox;


public CheckBoxFrame()
{
super( "CheckBox Test");
setLayout( new FlowLayout());

textField = new JTextField("Watch the font style change, 20 ):"

textField.setFont(new Font("Serif", Font.PLAIN,14));
add (textField );
BoldJCheckBox = new JCheckBox("Bold");
italicJCheckBox = new JCheckBox("italic");
add(boldJCheckBox);
add(italicJCheckBox);

CheckBoxHandler handler = new CheckBoxHandler();
}
private class CheckBoxHandler implements ItemListener
{
public void intemStateChanged(ItenEvent event)
{
Font font = null;
if(boldJCheckBox.isSelected()&& italicJCheckBox.isSelected())
font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
else if(boldJCheckBox.isSelected() )
font = new Font("Serif", Font.BOLD, 14);
else if(italicJCheckBox.isSelected() )
font = new Font("Serif", Font.ITALIC, 14;
else
font = new Font("Serif", Font.PLAIN, 14;

textField.setFont( font));
}

}
}
