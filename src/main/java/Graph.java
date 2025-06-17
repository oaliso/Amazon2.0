import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class Graph {

  private String userS;
  private String passwordS;

  public void gHome () {

    JFrame homePanel = new JFrame();
    JButton regButton = new JButton("Cadastrar Produto");
    JButton removeButton = new JButton("Remover Produto");
    JButton buyButton = new JButton("Consultar Produto");
    JButton logoutButton = new JButton("Log Out");

    // Setting Panel
    homePanel.setLayout(null);
    homePanel.setBounds(10, 10, 400, 400);
    homePanel.setTitle("Mercado Javão da Massa");
    homePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    homePanel.setVisible(true);

    // Setting Button

    // <!-- Register Button -->

    regButton.setBounds(115, 110, 170, 30);

    regButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        homePanel.setVisible(false);
        gRegister();
      }
    });

    // <!-- Cart Button -->

    buyButton.setBounds(115, 170, 170, 30);

    buyButton.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
      homePanel.setVisible(false);
      gRead();
    }

    });

    removeButton.setBounds(115, 230, 170, 30);
    removeButton.addActionListener(new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			homePanel.setVisible(false);
      gDelete();
			
		}
      
    });

    logoutButton.setBounds(115, 290, 170, 30);
    logoutButton.addActionListener(new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			homePanel.setVisible(false);
      gLogin();
			
		}
      
    });
    

    homePanel.add(regButton);
    homePanel.add(buyButton);
    homePanel.add(removeButton);
    homePanel.add(logoutButton);

    // Setting Label

    JLabel label = new JLabel("Mercado Javão da Massa");
    label.setBounds(113, 40, 175, 30);
    homePanel.add(label);
    
  }

  public void gLogin () {
    JFrame loginPanel = new JFrame();
    JButton loginButton = new JButton("Entrar");
    JLabel user = new JLabel("Usuário: ");
    JLabel password = new JLabel("Senha: ");

    JTextField userField = new JTextField();
    JPasswordField passwordField = new JPasswordField();

    //Setting Panel

    loginPanel.setLayout(null);
    loginPanel.setBounds(0, 0, 400, 400);
    loginPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    loginPanel.setTitle("Mercado Javão da Massa");
    loginPanel.setVisible(true);

    //Setting Button

    loginButton.setBounds(130, 230, 125, 30);
    loginPanel.add(loginButton);
    loginButton.addActionListener(new ActionListener(){

      private String user;
      private String password;

  		@Override
  		public void actionPerformed(ActionEvent e) {
        
        this.user = userField.getText();
        this.password = new String(passwordField.getPassword());

        this.isValid(user, password);
        
  		}

		private void isValid(String user, String password) {

      user = user.toUpperCase();

      System.out.println(user);
      System.out.println(password);

      if(user.equals("ADMIN") && password.equals("123456")){

        loginPanel.setVisible(false);

        gHome();
      
      }else{

        JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta", "Mercado Javão da Massa", JOptionPane.ERROR_MESSAGE);
        
      }
      
		}

    
    
      
    });

    //Setting Label

    user.setBounds(80, 30, 80, 30);
    password.setBounds(80, 120, 80, 30);

    loginPanel.add(user);
    loginPanel.add(password);

    //Setting TextField

    userField.setBounds(80, 60, 225, 30);
    passwordField.setBounds(80, 150, 225, 30);

    loginPanel.add(userField);
    loginPanel.add(passwordField);

    //Setting Password

    

    
    
  }

  public void gRegister () {

    JFrame registerPanel = new JFrame();
    registerPanel.setBounds(0, 0, 400, 400);
    registerPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    registerPanel.setTitle("Mercado Javão da Massa");
    registerPanel.setVisible(true);
    
  }

  public void gRead () {

    JFrame readPanel = new JFrame();
    readPanel.setBounds(0, 0, 400, 400);
    readPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    readPanel.setTitle("Mercado Javão da Massa");
    readPanel.setVisible(true);

  }

  public void gDelete () {

    JFrame deletePanel = new JFrame();
    deletePanel.setBounds(0, 0, 400, 400);
    deletePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    deletePanel.setTitle("Mercado Javão da Massa");
    deletePanel.setVisible(true);

  }

  
}