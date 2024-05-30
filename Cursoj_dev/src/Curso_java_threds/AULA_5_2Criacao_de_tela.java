package Curso_java_threds;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*CONFIG DA TELA*/
public class AULA_5_2Criacao_de_tela extends JDialog{
	
	/*CRIACAO DE PAINEL O  GRIDBAGLAYOUT TEM A FUNÇÃO DE GERENCIAR O PAINEL POR ISSO E PASSADO COMO PARAMETRO*/
	private JPanel JPanel = new JPanel(new GridBagLayout());/*PAINEL DE COMPONENTES*/
	
	private JLabel descricaoHora = new JLabel("PRIMEIRA THREAD");/*PRIMEIRA LABEL*/
	private JTextField mostratempo = new JTextField(); /*CAMPO DE TEXTO*/

	private JLabel descricaoHora2 = new JLabel("SEGUNDA THREAD");/*SEGUNDA LABEL*/
	private JTextField mostratempo2 = new JTextField(); /*CAMPO DE TEXTO*/
	
	private JLabel msg = new JLabel("THREAD INICIADA");
	private JLabel msg2 = new JLabel("THREAD INTERRROMPIDA");
	/*CRIACAO DE BUTOES*/
	private JButton jbutton = new JButton("Start");/*NOME DOS BOTOES*/
	private JButton jbutton2 = new JButton("Stop");/*NOME DOS BUTOES*/
	
	

	
	
	
	;
	
	private Thread thread2time;/*OBJETO DA THREAD2*/
	private Thread thread1Time ;/*OBJETO DE THREAD*/
	
		public  AULA_5_2Criacao_de_tela(){/*EXECUTAR O QUE ESTIVER DENTRO NO MOMEMTO DE ABERTURA OU EXECUÇÃO*/
			setTitle("minha tela de time com threds");
			setSize(new Dimension(240,280));/*240 ou 340*/
			setLocationRelativeTo(null);
			setResizable(false);
			/*PRIMEIRA PASTA*/
			
			/*GERENCIADOR DE POSICIONAMENTOS E LAYOUTS*/
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			/*POSICIONAMETO O GRID Y E A COLUNA DA TELA ENQUANTO O GRID X A LINHA*/
			gridBagConstraints.gridx = 0; /*LINHA*/
			gridBagConstraints.gridy = 0; /*COLUNA*/
			gridBagConstraints.gridwidth = 2; /*O GRIDWIDTH SERVE PARA COLOAR OS BOTOES UM LADO DO OUTRO*/
			gridBagConstraints.insets = new Insets(5, 10, 5, 5);/*5,10,5,5*/
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			
			
			/*DEFENINDO O TAMANHO DA LABEL*/
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			/*COLOCANDO O COMPONENTE DENTRO DO PAINEL*/
			JPanel.add(descricaoHora, gridBagConstraints); /*COLOCAMOS AO NOSSA LABEL NO PAINEL E USAMOD A GRID PARA DIZAER O LUGAR*/
			
			/*MUDAMOS A POSIÇÃO POR ISSO COLOCAMOS GRIDX ++*/
			mostratempo.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;/*DEFININDO O LUGAR NO PAINEL*/
			mostratempo.setEditable(false); /*ETA FUNÇÃO IMPEDE QUE DIGITEM NO CAMPO*/
			JPanel.add(mostratempo,gridBagConstraints);
			
			/*TAMANHO DA LABEL*/
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy++;
			JPanel.add(descricaoHora2, gridBagConstraints);/*ADICIONAMOS AO PAINEL*/
			
			/*MUDAMOS A POSIÇÃO POR ISSO COLOCAMOS GRIDX ++*/
			mostratempo2.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;/*DEFININDO O LUGAR NO PAINEL*/
			mostratempo2.setEditable(false);
			JPanel.add(mostratempo2,gridBagConstraints);
			/*MUDAMOS A POSIÇÃO POR ISSO COLOCAMOS GRIDX ++*/
			
			
			

			
			/*POSICIONAMENTO DE BOTOES*/
			gridBagConstraints.gridwidth = 1;
			
			jbutton.setPreferredSize(new Dimension(92, 25));/*DIMENSAO DE UM BOTAO*/
			gridBagConstraints.gridy++;
			JPanel.add(jbutton, gridBagConstraints);/*BUTAO E GERENCIADOR*/
			
			jbutton2.setPreferredSize(new Dimension(92, 25));
			gridBagConstraints.gridx++; /*COLOCAMOS UM BOTAO AO LADO DO OUTRO*/
			JPanel.add(jbutton2, gridBagConstraints);/*ADICIONAMOS UM BOTAO AO PAINEL E DEPOIS AO GERENCIADOR*/
			
			/*METODO RESPONSAVEL POR EXECUTAR O CLIQUE NO BOTAO E INICIAR O TEMPO NA LABEL*/
			jbutton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {/*EXECUTA O CLIQUE NA LABEL*/
					
					jbutton2.setEnabled(true);
					jbutton.setEnabled(false);
					msg.setVisible(true);
					msg2.setVisible(false);
					
					
					
				}
			});
			
			
			
			jbutton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					thread1Time.stop();
					thread2time.stop();
					jbutton2.setEnabled(false);
					jbutton.setEnabled(true);
					msg.setVisible(false);
					msg2.setVisible(true);
				}
			});
			
			
			gridBagConstraints.gridwidth = 2; 

			msg.setPreferredSize(new Dimension(200,25));
			gridBagConstraints.gridy ++;
			gridBagConstraints.gridx = 0;
			JPanel.add(msg,gridBagConstraints);
			
			gridBagConstraints.gridwidth = 2; 

			msg2.setPreferredSize(new Dimension(200,25));
			gridBagConstraints.gridy ++;
			gridBagConstraints.gridx = 0;
			JPanel.add(msg2,gridBagConstraints);
			
			
			
			
			msg.setVisible(false);
			msg2.setVisible(false);
			jbutton2.setEnabled(false); /*FUNÇÃO RESPONSAVEL POR DESATIVAR O BOTÃO STOP*/
			add(JPanel, BorderLayout.WEST);
			/*SEMPRE SERA O ULTIMO COMANDO*/
			setVisible(true);/*TORNA A TELA VISIVEL PARA O USUARIO*/
		}
}