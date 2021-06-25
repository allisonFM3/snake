import javax.swing.JFrame;
public class GameFrame extends JFrame
{
    GameFrame()
    {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //takes JFrame and fits it snug around components
        this.setVisible(true);
        this.setLocationRelativeTo(null); //appear in middle of computer
    }

}
