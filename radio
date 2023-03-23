import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {
private JTextField textField;
private Font plainFont;
private Font boldFont;
private Font italicFont;
private Font boldItalicFont;
private JRadioButton plainJRadioButton;
private JRadioButton boldJRadioButton;
private JRadioButton italicJRadioButton;
private JRadioButton boldItalicRadioButton;
private ButtonGroup radioGroup;
public RadioButtonFrame()
{
super("RadioButton Test");
setLayout(new FlowLayout());

textField = new JTextField("Watch the font style change",25);
add(textField);

plainJRadioButton = new JRadioButton("plain",true);
boldJRadioButton = new JRadioButton("Bold",false);
italicJRadioButton = new JRadioButton("Italic",false);
boldItalicRadioButton = new JRadioButton("Bold/italic",false);
add(plainJRadioButton);
add(boldJRadioButton);
add(italicJRadioButton);
add(boldItalicRadioButton);

radioGroup = new ButtonGroup();
radioGroup.add(plainJRadioButton);
radioGroup.add(boldJRadioButton);
radioGroup.add(italicJRadioButton);
radioGroup.add(boldItalicRadioButton);

plainFont = new Font ("Serif", Font.PLAIN,14);
boldFont = new Font("Serif", Font.BOLD,14);
italicFont = new Font ("Serif", Font.ITALIC,14);
boldItalicFont = new Font ("Serif", Font.BOLD+Font.ITALIC, 14);
textField.setFont(plainFont);

plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
boldItalicRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));

}
public class RadioButtonHandler implements ItemListener
{
private Font font;

public RadioButtonHandler(Font f)
{
font = f;
}
public void itemStateChanged(ItemEvent event)
{
textField.setFont(font);
}

}


}
