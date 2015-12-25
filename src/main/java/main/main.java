package main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Win extends JFrame {
	JTextArea code;
	Win(String s) {
		super(s);
		code = new JTextArea();
		code.setLineWrap(true);// 设置文本区的换行策略。
		code.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 16));  //设置当前字体。
		code.setTabSize(2);//使用setTabSize()方法设置[Tab]键的跳离距离
		JScrollPane jsp = new JScrollPane(code);
		this.add(jsp);
		setSize(600, 650);
		setVisible(true);
		validate();
		
		  AbstractAction sendMsg=new AbstractAction()  
		  {  
		   public void actionPerformed(ActionEvent e)  
		   {  
				String[] input = { code.getText() };
				AST.MyLang.main(input);
		   }  
		  };  
		code.getInputMap().put(KeyStroke.getKeyStroke('\n',java.awt.event.InputEvent.CTRL_MASK), "send");  
		code.getActionMap().put("send", sendMsg); 
	}
}

public class main {
	public static void main(String[] args) {
		new Win("My Window");
	}
}