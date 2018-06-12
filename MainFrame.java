import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnexit = new JButton("EXIT");
    private JButton jbtnrun = new JButton("RUN");
    private JTextField jtf =new JTextField();
    private JLabel jlb =new JLabel();

    private Container cp;

    public MainFrame(){
        Final();
    }

    private void Final(){
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setBounds(200, 20, 500, 300);//設置介面大小
        MainFrame.this.setTitle("接水果遊戲");//視窗上的名字
        this.setLayout(null);

        cp = this.getContentPane();
        cp.setLayout(new GridLayout(1,4,1,1));
        cp.add(jtf);
        cp.add(jbtnrun);
        cp.add(jlb);
        cp.add(jbtnexit);

        jbtnrun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int data[]=new int[5];

                    Double v1 =Double.parseDouble(jtf.getText());
                    Double v2 =v1*0.6214;
                    jlb.setText(Double.toString(v2));

                    for (int i=0;i<5;i++){
                        data[i]=(int)Math.round(Math.random()*100);
                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"ERROR");
                } catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"wwww");
                }catch (Exception e3){
                    JOptionPane.showMessageDialog(MainFrame.this,"030");
                }
            }
        });


        jbtnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}