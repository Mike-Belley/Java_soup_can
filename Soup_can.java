import java.awt.*;
public class Soup_can {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 650);
        Graphics2D g = panel.getGraphics();
        
        String camp = "Campbell\'s";
        String cond = "CONDENSED";
        String tomato = "TOMATO";
        String soup = "SOUP";
        
        panel.setBackground(new Color(245,245,220));
        
        g.setColor(new Color(117, 115, 113));
        g.fillOval(142, 600, 215, 40);
        
        g.setColor(new Color(255,255,255));
        g.fillOval(147, 595, 205, 40);
        g.fillRect(147, 460, 205, 155);
        
        g.setColor(new Color(142, 19, 19));
        g.fillOval(147, 440, 205, 40);
        g.fillRect(147, 305, 205, 155);
        
        g.setColor(new Color(117, 115, 113));
        g.fillOval(142, 285, 215, 40);
        
        g.setColor(new Color(168, 132, 13));
        g.fillOval(217, 450, 65, 65);
        
        g.setColor(new Color(255,255,255));
        g.setFont(new Font("Times", Font.ITALIC + Font.BOLD, 35));
        g.drawString(camp, 170,365);
        
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(cond, 190, 420);
        
        g.setColor(new Color(142, 19, 19));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString(tomato, 175, 570);
        
        g.setColor(new Color(168, 132, 13));
        g.setFont(new Font("Times", Font.BOLD, 35));
        g.drawString(soup, 205, 615);

    }

}
