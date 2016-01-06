package com;

import java.awt.Container;

import javax.swing.*;


/*

<applet code="JTabbedPaneDemo.class" width=300 height=100>
</applet>

*/

public class JTabbedPaneDemo extends JApplet {

static Storage store;
JTabbedPane jtp;
public void init() {
	
jtp = new JTabbedPane();
jtp.addTab("Hormone", new Hormone());
jtp.addTab("Gland", new Gland());
jtp.addTab("DB_Details", new DB_Details());
jtp.addTab("Login", new Login());
jtp.addTab("Save", new Storage());
Container contentPane = getContentPane();
contentPane.add(jtp);

}


}
