
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vu Huy
 */
public class MyFrame extends JFrame implements KeyListener, Runnable {
    
    Block b;
    
    public MyFrame() {
        b = new Block();
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("My Frame");
        this.setLocationRelativeTo(null);

        // key board control 
        this.addKeyListener(this);
        this.setVisible(true);
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(b.getC());
        g.fillRect(b.getX(), b.getY(), b.getDai(), b.getRong());
        
    }
    
    
    @Override
    public void keyPressed(KeyEvent ke) {
        repaint();
        switch(ke.getKeyCode()){
            case KeyEvent.VK_UP: b.setY((b.getY()-5+500)%500);break;
            case KeyEvent.VK_DOWN: b.setY((b.getY()+5)%500);break;
            case KeyEvent.VK_LEFT: b.setX(b.getX()-5);break;
            case KeyEvent.VK_RIGHT: b.setX(b.getX()+5);break;
            case KeyEvent.VK_R: b.setC(Color.red);break;
            case KeyEvent.VK_G: b.setC(Color.green);break;
            case KeyEvent.VK_B: b.setC(Color.blue);break;
            default: break;
            
        }
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyReleased(KeyEvent ke) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       while(true){
           repaint();
           try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
}
