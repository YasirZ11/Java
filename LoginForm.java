package org.eclipse.wb.swt;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Point;

public class LoginForm {
  Display display = new Display();
  Shell shell = new Shell(display);
  Label label1,label2;
  Text Username;
  Text Password;

 
  public LoginForm() {
  shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
  shell.setMinimumSize(new Point(560, 300));
  shell.setSize(560, 306);
  shell.setText("Login Form - Database");
  shell.setLayout(null);
  label1=new Label(shell, SWT.NULL);
  label1.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
  label1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
  label1.setBounds(10, 104, 105, 20);
  label1.setText("User Name: ");
  
  Username = new Text(shell, SWT.SINGLE | SWT.BORDER);
  Username.setBounds(214, 103, 262, 26);
  Username.setText("");
  Username.setTextLimit(30);
  
  label2=new Label(shell, SWT.NULL);
  label2.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
  label2.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
  label2.setBounds(10, 153, 105, 20);
  label2.setText("Password: ");
  
  Password = new Text(shell, SWT.SINGLE | SWT.BORDER);
  Password.setBounds(214, 152, 262, 26);
  System.out.println(Password.getEchoChar());
  Password.setEchoChar('*');
  Password.setTextLimit(30);

  Button button=new Button(shell,SWT.PUSH);
  button.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
  button.addSelectionListener(new SelectionAdapter() {
  	@Override
  	public void widgetSelected(SelectionEvent e) {
  	}
  });
  button.setBounds(115, 201, 92, 30);
  button.setText("Submit");
  button.addListener(SWT.Selection, new Listener() {
  public void handleEvent(Event event) {
  String User=Username.getText();
  String Pass=Password.getText();
  
  	if(User==""){ 
	  MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WARNING |SWT.CANCEL);
	  messageBox.setMessage("Enter the User Name");
	  messageBox.open();
	  }
	  if(Pass==""){
	  MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WARNING |SWT.CANCEL);
	  messageBox.setMessage("Enter the Password");
	  messageBox.open();
	  }
	  else{ 
	   MessageBox messageBox=new MessageBox(shell,SWT.OK|SWT.CANCEL);
	   messageBox.setText("Login Form");
	   messageBox.setMessage("Welcome: " + Username.getText());
	   messageBox.open();
	  }
	  }
	  });

  
  Label lblNewLabel = new Label(shell, SWT.NONE);
  lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
  lblNewLabel.setAlignment(SWT.CENTER);
  lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  lblNewLabel.setBounds(132, 23, 291, 30);
  lblNewLabel.setText("New User Login Form Databse");
  
  Button btnCancel = new Button(shell, SWT.NONE);
  btnCancel.setText("Cancel");
  btnCancel.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
  btnCancel.setBounds(317, 201, 92, 30);

  btnCancel.addSelectionListener(new SelectionAdapter() {
  	@Override
  	public void widgetSelected(SelectionEvent e) {
  		shell.dispose();
  		
  	}
  });
  shell.pack();
  shell.open();
  
  while (!shell.isDisposed()) {
  if (!display.readAndDispatch()) {
  display.sleep();
  }}
  }
 public static void main(String[] args) {
 new LoginForm();
  }
}

