import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel();
    private JButton jbon []= new JButton[12];
    int data [] = new int[10];
    private Container cp;
    private Random rand = new Random();
    private JPanel jpnn = new JPanel(new GridLayout(1,1,5,5));
    private JPanel jpnc = new JPanel(new GridLayout(4,3,3,3));
    private boolean flag = true;
    int i =0;
    public MainFrame (){
        init();
    }
    private void init(){
        this.setBounds(100,100,600,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpnn,BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);

        jpnn.add(jlb);

        while (i<10){
            flag = false;
            data[i] = rand.nextInt(10);
            for (int j = 0 ; j <i ; j++){
                if (data[i] == data[j]){
                    flag = false;
                }
            }
            if (flag){
                i++;
            }
        }
        for (int j= 0 ; j<10 ; j++){
            jbon [j]=new JButton(data[j]);
            jpnc.add(jbon[j]);













    }
}
