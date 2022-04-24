
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reshma
 */
public class xomaster extends javax.swing.JFrame {
// all the 9 blocks storage
int [] stat=new int[]{3,3,3,3,3,3,3,3,3,3};

//to randomize movements
Random r=new Random();
// bots turn or my turn
int turn;
int botorhuman;
    /**
     * Creates new form xomaster
     */
    public xomaster() {
        initComponents();
        
        this.setResizable(false);
    
    }
    public void mainbot(){
    
    
   
    try {
        TimeUnit.MILLISECONDS.sleep(200);
        /*bots 2 streaks*/////////////////////////////////////////////////////////////////////////////////////////////
    } catch (InterruptedException ex) {
        Logger.getLogger(xomaster.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // horizontal right
    
    if(stat[1]==1 && stat[2]==1 && stat[3]!=2){System.out.println("step1");
    stat[3]=1;}
    else
    if(stat[4]==1 && stat[5]==1 && stat[6]!=2){System.out.println("step2");
    stat[6]=1;}
    else
    if(stat[7]==1 && stat[8]==1 && stat[9]!=2){System.out.println("step3");
    stat[9]=1;}
    // horizontal center
    else
    if(stat[1]==1 && stat[3]==1 && stat[2]!=2){System.out.println("step4");
    stat[2]=1;}
    else
    if(stat[4]==1 && stat[6]==1 && stat[5]!=2){System.out.println("step5");
    stat[5]=1;}
    else
    if(stat[7]==1 && stat[9]==1 && stat[8]!=2){System.out.println("step6");
    stat[8]=1;}
    // horizontal left
    else
    if(stat[1]!=2 && stat[3]==1 && stat[2]==1){System.out.println("step7");
    stat[1]=1;}
    else
    if(stat[4]!=2 && stat[6]==1 && stat[5]==1){System.out.println("step8");
    stat[4]=1;}
    else
    if(stat[7]!=2 && stat[9]==1 && stat[8]==1){System.out.println("step9");
    stat[7]=1;}
    //vertical bottom
    else
    if(stat[1]==1 && stat[4]==1 && stat[7]!=2){System.out.println("step10");
    stat[7]=1;}
    else
    if(stat[2]==1 && stat[5]==1 && stat[8]!=2){System.out.println("step11");
    stat[8]=1;}
    else
    if(stat[3]==1 && stat[6]==1 && stat[9]!=2){System.out.println("step12");
    stat[9]=1;}
    // vertical middle
    else
    if(stat[1]==1 && stat[4]!=2 && stat[7]==1){System.out.println("step13");
    stat[4]=1;}
    else
    if(stat[2]==1 && stat[5]!=2 && stat[8]==1){System.out.println("step14");
    stat[5]=1;}
    else
    if(stat[3]==1 && stat[6]!=2 && stat[9]==1){System.out.println("step15");
    stat[6]=1;}
    // vertical upper
    else
    if(stat[1]!=2 && stat[4]==1 && stat[7]==1){System.out.println("step16");
    stat[1]=1;}
    else
    if(stat[2]!=2 && stat[5]==1 && stat[8]==1){System.out.println("step17");
    stat[2]=1;}
    else
    if(stat[3]!=2 && stat[6]==1 && stat[9]==1){System.out.println("step18");
    stat[3]=1;}
    //diagonal all
    else
    if(stat[1]==1 && stat[5]==1 && stat[9]!=2){System.out.println("step19");
    stat[9]=1;}
    else
    if(stat[1]!=2 && stat[5]==1 && stat[9]==1){System.out.println("step20");
    stat[1]=1;}
    else
    if(stat[1]==1 && stat[5]!=2 && stat[9]==1){System.out.println("step21");
    stat[5]=1;}
    else
    if(stat[3]!=2 && stat[5]==1 && stat[7]==1){System.out.println("step22");
    stat[3]=1;}
    else
    if(stat[3]==1 && stat[5]==1 && stat[7]!=2){System.out.println("step23");
    stat[7]=1;}
    else
    if(stat[3]==1 && stat[5]!=2 && stat[7]==1){System.out.println("step24");
    stat[5]=1;}
     /*humans 2 streaks*////////////////////////////////////////////////////////////////////////////////////////////
    else
    // horizontal right
    if(stat[1]==2 && stat[2]==2 && stat[3]!=1){System.out.println("stop1");
    stat[3]=1;}
    else
    if(stat[4]==2 && stat[5]==2 && stat[6]!=1){System.out.println("stop2");
    stat[6]=1;}
    else
    if(stat[7]==2 && stat[8]==2 && stat[9]!=1){System.out.println("stop3");
    stat[9]=1;}
    // horizontal center
    else
    if(stat[1]==2 && stat[3]==2 && stat[2]!=1){System.out.println("stop4");
    stat[2]=1;}
    else
    if(stat[4]==2 && stat[6]==2 && stat[5]!=1){System.out.println("stop5");
    stat[5]=1;}
    else
    if(stat[7]==2 && stat[9]==2 && stat[8]!=1){System.out.println("stop6");
    stat[8]=1;}
    // horizontal left
    else
    if(stat[1]!=1 && stat[3]==2 && stat[2]==2){System.out.println("stop7");
    stat[1]=1;}
    else
    if(stat[4]!=1 && stat[6]==2 && stat[5]==2){System.out.println("stop8");
    stat[4]=1;}
    else
    if(stat[7]!=1 && stat[9]==2 && stat[8]==2){System.out.println("stop9");
    stat[7]=1;}
    //vertical bottom
    else
    if(stat[1]==2 && stat[4]==2 && stat[7]!=1){System.out.println("stop10");
    stat[7]=1;}
    else
    if(stat[2]==2 && stat[5]==2 && stat[8]!=1){System.out.println("stop11");
    stat[8]=1;}
    else
    if(stat[3]==2 && stat[6]==2 && stat[9]!=1){System.out.println("stop12");
    stat[9]=1;}
    // vertical middle
    else
    if(stat[1]==2 && stat[4]!=1 && stat[7]==2){System.out.println("stop13");
    stat[4]=1;}
    else
    if(stat[2]==2 && stat[5]!=1 && stat[8]==2){System.out.println("stop14");
    stat[5]=1;}
    else
    if(stat[3]==2 && stat[6]!=1 && stat[9]==2){System.out.println("stop15");
    stat[6]=1;}
    // vertical upper
    else
    if(stat[1]!=1 && stat[4]==2 && stat[7]==2){System.out.println("stop16");
    stat[1]=1;}
    else
    if(stat[2]!=1 && stat[5]==2 && stat[8]==2){System.out.println("stop17");
    stat[2]=1;}
    else
    if(stat[3]!=1 && stat[6]==2 && stat[9]==2){System.out.println("stop18");
    stat[3]=1;}
    //diagonal all
    else
    if(stat[1]==2 && stat[5]==2 && stat[9]!=1){System.out.println("stop19");
    stat[9]=1;}
    else
    if(stat[1]!=1 && stat[5]==2 && stat[9]==2){System.out.println("stop20");
    stat[1]=1;}
    else
    if(stat[1]==2 && stat[5]!=1 && stat[9]==2){System.out.println("stop21");
    stat[5]=1;}
    else
    if(stat[3]!=1 && stat[5]==2 && stat[7]==2){System.out.println("stop22");
    stat[3]=1;}
    else
    if(stat[3]==2 && stat[5]==2 && stat[7]!=1){System.out.println("stop23");
    stat[7]=1;}
    else
    if(stat[3]==2 && stat[5]!=1 && stat[7]==2){System.out.println("stop24");
    stat[5]=1;}
    /*bot single streak*/////////////////////////////////////////////////////////////////////////////////////////
    
    // horizontal //////////////////////////
    
    //first row
    else
    if(stat[1]==1 && stat[2]==0 && stat[3]==0){System.out.println("hello0");
    if(r.nextInt(2)==1)
    stat[2]=1;
    else
    stat[3]=1;
    }
    else
    if( stat[2]==1 && stat[1]==0 && stat[3]==0){System.out.println("hello1");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[3]=1;
    }
    else
    if(stat[1]==0 && stat[2]==0  && stat[3]==1){System.out.println("hello2");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[2]=1;
    }
    // second row
    else
    if(stat[4]==1 && stat[6]==0 && stat[5]==0){System.out.println("hello3");
    if(r.nextInt(2)==1)
    stat[6]=1;
    else
    stat[5]=1;
    }
    else
    if(stat[5]==1 && stat[6]==0 && stat[4]==0){System.out.println("hello4");
    if(r.nextInt(2)==1)
    stat[6]=1;
    else
    stat[4]=1;
    }
    else
    if(stat[6]==1 && stat[5]==0 && stat[4]==0){System.out.println("hello5");
    if(r.nextInt(2)==1)
    stat[5]=1;
    else
    stat[4]=1;
    }
    // bottom row
    else
    if(stat[7]==1 && stat[8]==0 && stat[9]==0){System.out.println("hello6");
    if(r.nextInt(2)==1)
    stat[8]=1;
    else
    stat[9]=1;
    }
    else
    if(stat[8]==1 && stat[7]==0 && stat[9]==0){System.out.println("hello7");
    if(r.nextInt(2)==1)
    stat[7]=1;
    else
    stat[9]=1;
    }
    else
    if(stat[9]==1 && stat[7]==0 && stat[8]==0){System.out.println("hello8");
    if(r.nextInt(2)==1)
    stat[8]=1;
    else
    stat[7]=1;
    }
    // vertical ////////////////////////
    
    // first column
    else
    if(stat[1]==1 && stat[4]==0 && stat[7]==0){System.out.println("hello9");
    if(r.nextInt(2)==1)
    stat[4]=1;
    else
    stat[7]=1;
    }
    else
    if(stat[4]==1 &&stat[1]==0 && stat[7]==0){System.out.println("hello10");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[7]=1;
    }
    else
    if(stat[7]==1 &&stat[4]==0 && stat[1]==0){System.out.println("hello11");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[4]=1;
    }
    // center column
    else
    if(stat[2]==1 && stat[5]==0 && stat[8]==0){System.out.println("hello12");
    if(r.nextInt(2)==1)
    stat[5]=1;
    else
    stat[8]=1;
    }
    else
    if(stat[5]==1 && stat[2]==0 && stat[8]==0){System.out.println("hello13");
    if(r.nextInt(2)==1)
    stat[2]=1;
    else
    stat[8]=1;
    }
    else
    if(stat[8]==1 &&stat[2]==0 && stat[5]==0){System.out.println("hello14");
    if(r.nextInt(2)==1)
    stat[2]=1;
    else
    stat[5]=1;
    }
    // right column
    else
    if(stat[3]==1 &&stat[6]==0 && stat[9]==0){System.out.println("hello15");
    if(r.nextInt(2)==1)
    stat[6]=1;
    else
    stat[9]=1;
    }
    else
    if(stat[6]==1 &&stat[3]==0 && stat[9]==0){System.out.println("hello16");
    if(r.nextInt(2)==1)
    stat[3]=1;
    else
    stat[9]=1;
    }
    else
    if(stat[9]==1 &&stat[3]==0 && stat[6]==0){System.out.println("hello17");
    if(r.nextInt(2)==1)
    stat[3]=1;
    else
    stat[6]=1;
    }
    // all diagonals//////////////////////
    else
    if(stat[1]==1 &&stat[5]==0 && stat[9]==0){System.out.println("hello18");
    if(r.nextInt(2)==1)
    stat[5]=1;
    else
    stat[9]=1;
    }
    else
    if(stat[5]==1 && stat[9]==0 && stat[1]==0){System.out.println("hello19");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[9]=1;
    
    }
    else
    if(stat[9]==1 &&stat[1]==0 && stat[5]==0){System.out.println("hello20");
    if(r.nextInt(2)==1)
    stat[1]=1;
    else
    stat[5]=1;
    }
    else
    if(stat[3]==1 && stat[5]==0 && stat[7]==0){System.out.println("hello21");
    if(r.nextInt(2)==1)
    stat[5]=1;
    else
    stat[7]=1;
    }
    else
    if(stat[5]==1 && stat[3]==0 && stat[7]==0){System.out.println("hello22");
    if(r.nextInt(2)==1)
    stat[3]=1;
    else
    stat[7]=1;
    }
    else
    if(stat[7]==1 && stat[3]==0 && stat[5]==0){System.out.println("hello23");
    if(r.nextInt(2)==1)
    stat[3]=1;
    else
    stat[5]=1;
    }
    // No streak nothing////////////////////////////////////////////////////////////////////////////////////////
    else
    if(stat[5]==0){System.out.println("hi0");
    stat[5]=1;    
    }
    else
    if(stat[1]==0){System.out.println("hi1");
    stat[1]=1;}
    else
    if(stat[2]==0){System.out.println("hi2");
    stat[2]=1;}
    else
    if(stat[3]==0){System.out.println("hi3");
    stat[3]=1;}
    else
    if(stat[4]==0){System.out.println("hi4");
    stat[4]=1;}
    
    else
    if(stat[6]==0){System.out.println("hi5");
    stat[6]=1;}
    else
    if(stat[7]==0){System.out.println("hi6");
    stat[7]=1;}
    else
    if(stat[8]==0){System.out.println("hi7");
    stat[8]=1;}
    else{System.out.println("hi8");
    if(turn!=9)
    stat[9]=1;
    }
    
    }
    
    public void mainsetter(){
    if(stat[1]==2)
    ul.setText("X");
    else if(stat[1]==1)
    ul.setText("O");
    if(stat[2]==2)
    uc.setText("X");
    else if(stat[2]==1)
    uc.setText("O");
    if(stat[3]==2)
    ur.setText("X");
    else if(stat[3]==1)
    ur.setText("O");
    if(stat[4]==2)
    ml.setText("X");
    else if(stat[4]==1)
    ml.setText("O");
    if(stat[5]==2)
    mc.setText("X");
    else if(stat[5]==1)
    mc.setText("O");
    if(stat[6]==2)
    mr.setText("X");
    else if(stat[6]==1)
    mr.setText("O");
    if(stat[7]==2)
    bl.setText("X");
    else if(stat[7]==1)
    bl.setText("O");
    if(stat[8]==2)
    bc.setText("X");
    else if(stat[8]==1)
    bc.setText("O");
    if(stat[9]==2)
    br.setText("X");
    else if(stat[9]==1)
    br.setText("O");
    
    }
    public void mainwin(){
    //bot wins/////////////////////////////////////////////////////////////////////////////////////
    if(stat[1]==1 && stat[2]==1 && stat[3]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[4]==1 && stat[5]==1 && stat[6]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[7]==1 && stat[8]==1 && stat[9]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[1]==1 && stat[4]==1 && stat[7]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[2]==1 && stat[5]==1 && stat[8]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[3]==1 && stat[6]==1 && stat[9]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[1]==1 && stat[5]==1 && stat[9]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    if(stat[3]==1 && stat[5]==1 && stat[7]==1){
    JOptionPane.showMessageDialog(this,"O WINS!!!!");
    
    }
    // player wins/////////////////////////////////////////////////////////////////////////////
    if(stat[1]==2 && stat[2]==2 && stat[3]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[4]==2 && stat[5]==2 && stat[6]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[7]==2 && stat[8]==2 && stat[9]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[1]==2 && stat[4]==2 && stat[7]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[2]==2 && stat[5]==2 && stat[8]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[3]==2 && stat[6]==2 && stat[9]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[1]==2 && stat[5]==2 && stat[9]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(stat[3]==2 && stat[5]==2 && stat[7]==2){
    JOptionPane.showMessageDialog(this,"X WINS!!!!");
    
    }
    if(botorhuman==1){
    if(turn==10 || turn==9)
    JOptionPane.showMessageDialog(this,"TIE!!!");}
    else
        if(turn==9)
    JOptionPane.showMessageDialog(this,"TIE!!!");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ul = new javax.swing.JButton();
        uc = new javax.swing.JButton();
        ur = new javax.swing.JButton();
        ml = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        bl = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        br = new javax.swing.JButton();
        vsbot = new javax.swing.JButton();
        vshuman = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 3));

        ul.setBackground(new java.awt.Color(0, 0, 0));
        ul.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ul.setForeground(new java.awt.Color(0, 204, 204));
        ul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulActionPerformed(evt);
            }
        });
        jPanel1.add(ul);

        uc.setBackground(new java.awt.Color(0, 0, 0));
        uc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        uc.setForeground(new java.awt.Color(0, 204, 204));
        uc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucActionPerformed(evt);
            }
        });
        jPanel1.add(uc);

        ur.setBackground(new java.awt.Color(0, 0, 0));
        ur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ur.setForeground(new java.awt.Color(0, 204, 204));
        ur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urActionPerformed(evt);
            }
        });
        jPanel1.add(ur);

        ml.setBackground(new java.awt.Color(0, 0, 0));
        ml.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ml.setForeground(new java.awt.Color(0, 204, 204));
        ml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlActionPerformed(evt);
            }
        });
        jPanel1.add(ml);

        mc.setBackground(new java.awt.Color(0, 0, 0));
        mc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mc.setForeground(new java.awt.Color(0, 204, 204));
        mc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });
        jPanel1.add(mc);

        mr.setBackground(new java.awt.Color(0, 0, 0));
        mr.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mr.setForeground(new java.awt.Color(0, 204, 204));
        mr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });
        jPanel1.add(mr);

        bl.setBackground(new java.awt.Color(0, 0, 0));
        bl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bl.setForeground(new java.awt.Color(0, 204, 204));
        bl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blActionPerformed(evt);
            }
        });
        jPanel1.add(bl);

        bc.setBackground(new java.awt.Color(0, 0, 0));
        bc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bc.setForeground(new java.awt.Color(0, 204, 204));
        bc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        jPanel1.add(bc);

        br.setBackground(new java.awt.Color(0, 0, 0));
        br.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        br.setForeground(new java.awt.Color(0, 204, 204));
        br.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brActionPerformed(evt);
            }
        });
        jPanel1.add(br);

        vsbot.setBackground(new java.awt.Color(0, 0, 0));
        vsbot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vsbot.setForeground(new java.awt.Color(255, 255, 255));
        vsbot.setText("<html>Vs<br>Bot</html>");
        vsbot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsbotActionPerformed(evt);
            }
        });
        jPanel1.add(vsbot);

        vshuman.setBackground(new java.awt.Color(0, 0, 0));
        vshuman.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vshuman.setForeground(new java.awt.Color(255, 255, 255));
        vshuman.setText("<html>Vs<br>Human</html>");
        vshuman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vshuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vshumanActionPerformed(evt);
            }
        });
        jPanel1.add(vshuman);

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void vsbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsbotActionPerformed
    try {
        TimeUnit.MILLISECONDS.sleep(200);
    } catch (InterruptedException ex) {
        Logger.getLogger(xomaster.class.getName()).log(Level.SEVERE, null, ex);
    }
        turn=0;
        botorhuman=1;
        ul.setText("");
uc.setText("");     
        ur.setText("");
        ml.setText("");
        mc.setText("");
        mr.setText("");
        br.setText("");
        bc.setText("");
        bl.setText("");
for(int i=1;i<stat.length;i++){
stat[i]=0;
}
if(r.nextInt(2)==1){

mainbot();
turn++;
mainsetter();
System.out.println(turn);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_vsbotActionPerformed

    private void ulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulActionPerformed
if(stat[1]==0){
if(botorhuman==1){
stat[1]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[1]=2;
else
    stat[1]=1;turn++;mainsetter();mainwin();
}
}
System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_ulActionPerformed

    private void ucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucActionPerformed
if(stat[2]==0)
if(botorhuman==1){
stat[2]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[2]=2;
else
    stat[2]=1;turn++;mainsetter();mainwin();
}System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_ucActionPerformed

    private void urActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urActionPerformed
if(stat[3]==0)
if(botorhuman==1){
stat[3]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[3]=2;
else
    stat[3]=1;turn++;mainsetter();mainwin();
}System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_urActionPerformed

    private void mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlActionPerformed
if(stat[4]==0)
if(botorhuman==1){
stat[4]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[4]=2;
else
    stat[4]=1;turn++;mainsetter();mainwin();
}System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_mlActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
if(stat[5]==0)
if(botorhuman==1){
stat[5]=2;turn++;
mainbot();
turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[5]=2;
else
    stat[5]=1;turn++;
}System.out.println(turn);mainsetter();mainwin();
        // TODO add your handling code here:
    }//GEN-LAST:event_mcActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
if(stat[6]==0)
if(botorhuman==1){
stat[6]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[6]=2;
else
    stat[6]=1;turn++;mainsetter();mainwin();
}System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_mrActionPerformed

    private void blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blActionPerformed
if(stat[7]==0)
if(botorhuman==1){
stat[7]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
    }
else{
if(turn%2==0)
stat[7]=2;
else
    stat[7]=1;turn++;mainsetter();mainwin();
}System.out.println(turn);
        // TODO ad your handling code here:
    }//GEN-LAST:event_blActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
if(stat[8]==0)
if(botorhuman==1){
stat[8]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[8]=2;
else
    stat[8]=1;turn++;mainsetter();mainwin();
}
System.out.println(turn);
          // TODO add your handling code here:
    }//GEN-LAST:event_bcActionPerformed

    private void brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brActionPerformed
if(stat[9]==0)
if(botorhuman==1){
stat[9]=2;turn++;
mainbot();turn++;
mainsetter();
mainwin();
}
else{
if(turn%2==0)
stat[9]=2;
else
    stat[9]=1;mainsetter();mainwin();
turn++;
}System.out.println(turn);
        // TODO add your handling code here:
    }//GEN-LAST:event_brActionPerformed

    private void vshumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vshumanActionPerformed
 try {
        TimeUnit.MILLISECONDS.sleep(200);
    } catch (InterruptedException ex) {
        Logger.getLogger(xomaster.class.getName()).log(Level.SEVERE, null, ex);
    }
        turn=0;
        botorhuman=0;
ul.setText("");
uc.setText("");     
        ur.setText("");
        ml.setText("");
        mc.setText("");
        mr.setText("");
        br.setText("");
        bc.setText("");
        bl.setText("");
for(int i=1;i<stat.length;i++){
stat[i]=0;
}
        // TODO add your handling code here:
    }//GEN-LAST:event_vshumanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(xomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xomaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bc;
    private javax.swing.JButton bl;
    private javax.swing.JButton br;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mc;
    private javax.swing.JButton ml;
    private javax.swing.JButton mr;
    private javax.swing.JButton uc;
    private javax.swing.JButton ul;
    private javax.swing.JButton ur;
    private javax.swing.JButton vsbot;
    private javax.swing.JButton vshuman;
    // End of variables declaration//GEN-END:variables
}
