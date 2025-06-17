/*

Classe Desenvolvida por:
Alisson de Carvalho Silva

*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class Graph {

  private String userS;
  private String passwordS;
  private List<Produto> listaDeProdutos = new ArrayList<>();

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
    JButton cellButton = new JButton("Smartphone");
    JButton tvButton = new JButton("Televisão");
    JLabel label = new JLabel("Cadastrar Produto");
    
    registerPanel.setBounds(0, 0, 400, 400);
    registerPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    registerPanel.setTitle("Mercado Javão da Massa");
    registerPanel.setLayout(null);
    registerPanel.setVisible(true);

    cellButton.setBounds(115, 100, 170, 30);
    tvButton.setBounds(115, 160, 170, 30);

    cellButton.addActionListener(new ActionListener () {

		public void actionPerformed(ActionEvent e) {
      registerPanel.setVisible(false);
      gRegisterCell();
			
		} 
    });

    tvButton.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			registerPanel.setVisible(false);
      gRegisterTv();
			
		}
      
    });

    registerPanel.add(cellButton);
    registerPanel.add(tvButton);

    label.setBounds(133, 40, 170, 30);
    registerPanel.add(label);

    

    
    
  }

  public void gRegisterCell () {

    JFrame registerCellPanel = new JFrame();
    registerCellPanel.setBounds(0, 0, 400, 400);
    registerCellPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    registerCellPanel.setTitle("Mercado Javão da Massa");
    registerCellPanel.setLayout(null);
    registerCellPanel.setVisible(true);

    JTextField tf1 = new JTextField("Id do Produto");
    JTextField tf2 = new JTextField("Marca");
    JTextField tf3 = new JTextField("Modelo");
    JTextField tf4 = new JTextField("Preço");
    JTextField tf5 = new JTextField("Armazenamento");
    
    tf1.setBounds(115, 80, 170, 30);
    tf2.setBounds(115, 120, 170,30);
    tf3.setBounds(115, 160, 170,30);
    tf4.setBounds(115, 200, 170,30);
    tf5.setBounds(115, 240, 170,30);

    JLabel label = new JLabel("Cadastrar Telefone");

    label.setBounds(128, 40, 170, 30);

    JButton cadastrar = new JButton("Cadastar");
    cadastrar.setBounds(115, 280, 170, 30);

    cadastrar.addActionListener(new ActionListener () {

		public void actionPerformed(ActionEvent e) {
      try {
        int id = Integer.parseInt(tf1.getText());

        for (Produto p : listaDeProdutos) {
            if (p.getId() == id) {
                JOptionPane.showMessageDialog(null, "Erro: Já existe um produto com este ID.");
                return;
            }
        }
        
        String marca = tf2.getText();
        String modelo = tf3.getText();
        double preco = Double.parseDouble(tf4.getText());

        String armazenamento = tf5.getText();


        Smartphone novoSmartphone = new Smartphone(id, marca, modelo, preco, armazenamento);
        listaDeProdutos.add(novoSmartphone);

        JOptionPane.showMessageDialog(null, "Smartphone cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        registerCellPanel.setVisible(false);
        gHome();

      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Erro: Verifique se os campos de ID e Preço são números válidos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
      }
			
		}
      
    });

    JButton voltar = new JButton("Voltar");
    voltar.setBounds(115, 320, 170, 30);

    voltar.addActionListener(new ActionListener () {

    public void actionPerformed(ActionEvent e) {
      registerCellPanel.setVisible(false);
      gHome();

    }

    });

    registerCellPanel.add(tf1);
    registerCellPanel.add(tf2);
    registerCellPanel.add(tf3);
    registerCellPanel.add(tf4);
    registerCellPanel.add(tf5);
    registerCellPanel.add(label);
    registerCellPanel.add(cadastrar);
    registerCellPanel.add(voltar);
    
  }

  public void gRegisterTv () {
    JFrame registerTvPanel = new JFrame();
    registerTvPanel.setBounds(0, 0, 400, 400);
    registerTvPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    registerTvPanel.setTitle("Mercado Javão da Massa");
    registerTvPanel.setLayout(null);
    registerTvPanel.setVisible(true);

    JTextField tf1 = new JTextField("Id do Produto");
    JTextField tf2 = new JTextField("Marca");
    JTextField tf3 = new JTextField("Modelo");
    JTextField tf4 = new JTextField("Preço");
    JTextField tf5 = new JTextField("Tela");

    tf1.setBounds(115, 80, 170, 30);
    tf2.setBounds(115, 120, 170,30);
    tf3.setBounds(115, 160, 170,30);
    tf4.setBounds(115, 200, 170,30);
    tf5.setBounds(115, 240, 170,30);

    JLabel label = new JLabel("Cadastrar Televisão");

    label.setBounds(126, 40, 170, 30);

    JButton cadastrar = new JButton("Cadastar");
    cadastrar.setBounds(115, 280, 170, 30);

    cadastrar.addActionListener(new ActionListener () {

    public void actionPerformed(ActionEvent e) {
      try {
          int id = Integer.parseInt(tf1.getText());

          for (Produto p : listaDeProdutos) {
              if (p.getId() == id) {
                  JOptionPane.showMessageDialog(null, "Erro: Já existe um produto com este ID.", "ID duplicado", JOptionPane.ERROR_MESSAGE);
                  return; 
              }
          }
        
          String marca = tf2.getText();
          String modelo = tf3.getText();
          double preco = Double.parseDouble(tf4.getText());
          int polegadas = Integer.parseInt(tf5.getText());

          Televisao novaTv = new Televisao(id, marca, modelo, preco, polegadas);
          listaDeProdutos.add(novaTv);

          JOptionPane.showMessageDialog(null, "Televisão cadastrada com sucesso!");
          registerTvPanel.setVisible(false);
          gHome();
      } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null, "Erro: Verifique os campos numéricos (ID, Preço, Polegadas).");
              }
          }
      });

    JButton voltar = new JButton("Voltar");
    voltar.setBounds(115, 320, 170, 30);

    voltar.addActionListener(new ActionListener () {

		public void actionPerformed(ActionEvent e) {
			registerTvPanel.setVisible(false);
      gHome();
			
		}
      
    });

    registerTvPanel.add(tf1);
    registerTvPanel.add(tf2);
    registerTvPanel.add(tf3);
    registerTvPanel.add(tf4);
    registerTvPanel.add(tf5);
    registerTvPanel.add(label);
    registerTvPanel.add(cadastrar);
    registerTvPanel.add(voltar);
    
  }

  public void gRead () {

    JFrame readPanel = new JFrame();
    readPanel.setBounds(0, 0, 400, 400);
    readPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    readPanel.setTitle("Mercado Javão da Massa");
    readPanel.setLayout(null);
    readPanel.setVisible(true);

    JLabel label = new JLabel("Buscar Produto");
    label.setBounds(135, 50, 170, 30);

    JTextField tf1 = new JTextField("Id do Produto");
    tf1.setBounds(115, 90, 170, 30);

    JButton buscar = new JButton("Buscar");
    buscar.setBounds(115, 260, 170, 30);

    buscar.addActionListener(new ActionListener () {
      
  		public void actionPerformed(ActionEvent e) {

        String ttf1 = tf1.getText();
        
        gReadSpecific(ttf1, "read");
  			
  		}
     
    });

    JButton voltar = new JButton("Voltar");
    voltar.setBounds(115, 300, 170, 30);

    voltar.addActionListener(new ActionListener () {

    public void actionPerformed(ActionEvent e) {
      readPanel.setVisible(false);
      gHome();

    }

    });
      

    readPanel.add(label);
    readPanel.add(tf1);
    readPanel.add(buscar);
    readPanel.add(voltar);

  }

  public void gDelete () {

    JFrame deletePanel = new JFrame();
    deletePanel.setBounds(0, 0, 400, 400);
    deletePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    deletePanel.setLayout(null);
    deletePanel.setTitle("Mercado Javão da Massa");
    deletePanel.setVisible(true);

    JLabel label = new JLabel("Deletar Produto");
    label.setBounds(135, 50, 170, 30);

    JTextField tf1 = new JTextField("Id do Produto");
    tf1.setBounds(115, 90, 170, 30);

    JButton delete = new JButton("Deletar");
    delete.setBounds(115, 260, 170, 30);

    delete.addActionListener(new ActionListener () {

      public void actionPerformed(ActionEvent e) {

        String ttf1 = tf1.getText();

        gReadSpecific(ttf1, "delete");

      }

    });

    JButton voltar = new JButton("Voltar");
    voltar.setBounds(115, 300, 170, 30);

    voltar.addActionListener(new ActionListener () {

    public void actionPerformed(ActionEvent e) {
      deletePanel.setVisible(false);
      gHome();

    }

    });


    deletePanel.add(label);
    deletePanel.add(tf1);
    deletePanel.add(delete);
    deletePanel.add(voltar);

  } 

  public void gReadSpecific(String idString, String action) {
      try {
          int id = Integer.parseInt(idString);
          Produto produtoEncontrado = null;

          for (Produto p : listaDeProdutos) {
              if (p.getId() == id) {
                  produtoEncontrado = p;
                  break;
              }
          }

          if (produtoEncontrado != null) {
              if (action.equals("read")) {
                  gShowInfo(produtoEncontrado);
              } else if (action.equals("delete")) {
                  String descricao = produtoEncontrado.getDescricao();
                  int confirmacao = JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja remover o produto?\n" + descricao,
                      "Confirmar Remoção",
                      JOptionPane.YES_NO_OPTION);

                  if (confirmacao == JOptionPane.YES_OPTION) {
                      listaDeProdutos.remove(produtoEncontrado);
                      JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                  }
                  gHome();
              }
          } else {
              JOptionPane.showMessageDialog(null, "Produto com ID '" + id + "' não encontrado.");
              gHome();
          }
      } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número.");
          gHome();
      }
  }

  public void gShowInfo(Produto produto) {
      JFrame infoPanel = new JFrame("Detalhes do Produto");
      infoPanel.setBounds(0, 0, 400, 450);
      infoPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      infoPanel.setLayout(null);

      JLabel lblTitulo = new JLabel("Informações do Produto");
      lblTitulo.setBounds(125, 20, 200, 30);
      infoPanel.add(lblTitulo);

      JLabel lblId = new JLabel("ID:");
      lblId.setBounds(40, 70, 100, 30);
      JTextField txtId = new JTextField(String.valueOf(produto.getId()));
      txtId.setBounds(150, 70, 200, 30);
      txtId.setEditable(false);

      JLabel lblMarca = new JLabel("Marca:");
      lblMarca.setBounds(40, 110, 100, 30);
      JTextField txtMarca = new JTextField(produto.getMarca());
      txtMarca.setBounds(150, 110, 200, 30);
      txtMarca.setEditable(false);

      JLabel lblModelo = new JLabel("Modelo:");
      lblModelo.setBounds(40, 150, 100, 30);
      JTextField txtModelo = new JTextField(produto.getModelo());
      txtModelo.setBounds(150, 150, 200, 30);
      txtModelo.setEditable(false);

      JLabel lblPreco = new JLabel("Preço (R$):");
      lblPreco.setBounds(40, 190, 100, 30);
      JTextField txtPreco = new JTextField(String.valueOf(produto.getPreco()));
      txtPreco.setBounds(150, 190, 200, 30);
      txtPreco.setEditable(false);

      infoPanel.add(lblId);
      infoPanel.add(txtId);
      infoPanel.add(lblMarca);
      infoPanel.add(txtMarca);
      infoPanel.add(lblModelo);
      infoPanel.add(txtModelo);
      infoPanel.add(lblPreco);
      infoPanel.add(txtPreco);

      int yPosition = 230;
      if (produto instanceof Smartphone) {
          Smartphone s = (Smartphone) produto;
          JLabel lblMemoria = new JLabel("Armazenamento:");
          lblMemoria.setBounds(40, yPosition, 110, 30);
          JTextField txtMemoria = new JTextField(s.getMemoriaGB());
          txtMemoria.setBounds(150, yPosition, 200, 30);
          txtMemoria.setEditable(false);
          infoPanel.add(lblMemoria);
          infoPanel.add(txtMemoria);
      } else if (produto instanceof Televisao) {
          Televisao t = (Televisao) produto;
          JLabel lblPolegadas = new JLabel("Polegadas:");
          lblPolegadas.setBounds(40, yPosition, 100, 30);
          JTextField txtPolegadas = new JTextField(String.valueOf(t.getPolegadas()) + "\"");
          txtPolegadas.setBounds(150, yPosition, 200, 30);
          txtPolegadas.setEditable(false);
          infoPanel.add(lblPolegadas);
          infoPanel.add(txtPolegadas);

          yPosition += 40;
          JLabel lblResolucao = new JLabel("Resolução:");
          lblResolucao.setBounds(40, yPosition, 100, 30);
          JTextField txtResolucao = new JTextField(t.getResolucao());
          txtResolucao.setBounds(150, yPosition, 200, 30);
          txtResolucao.setEditable(false);
          infoPanel.add(lblResolucao);
      }

      JButton voltar = new JButton("Voltar");
      voltar.setBounds(115, 350, 170, 30);
      voltar.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              infoPanel.dispose();
              gHome();
          }
      });

      infoPanel.add(voltar);
      infoPanel.setLocationRelativeTo(null);
      infoPanel.setVisible(true);
  }
  
}