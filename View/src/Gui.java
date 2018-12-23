import javax.swing.*;
import java.awt.*;
public class Gui {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Movie Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Movie");
        JMenu m2 = new JMenu("Employees");
        mb.add(m1);
        mb.add(m2);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Movie");
        JTextField tf = new JTextField(15); // accepts upto 15 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        //Creating the panel at the center, to list movies. 5 Movies every week.
        JPanel listPanel = new JPanel(new GridLayout(5,1));
        listPanel.setBackground(Color.black);

        //First Movie
        JLabel movie1Name = new JLabel();
        movie1Name.setText("1 -     Name1 "); //Have to get movie name from Database
        JLabel movie1Description = new JLabel();
        movie1Description.setText(" Desc1 ");
        JLabel movie1Date = new JLabel();
        movie1Date.setText(" Date1 ");
        JLabel movie1Release = new JLabel();
        movie1Release.setText(" Release1");

        movie1Name.setForeground(Color.white);
        movie1Date.setForeground(Color.white);
        movie1Description.setForeground(Color.white);
        movie1Release.setForeground(Color.white);

        listPanel.add(movie1Name);
        listPanel.add(movie1Description);
        listPanel.add(movie1Date);
        listPanel.add(movie1Release);

        //Second
        JLabel movie2Name = new JLabel();
        movie2Name.setText("2 -     Name2 ");
        JLabel movie2Description = new JLabel();
        movie2Description.setText(" Desc2 ");
        JLabel movie2Date = new JLabel();
        movie2Date.setText(" Date2 ");
        JLabel movie2Release = new JLabel();
        movie2Release.setText(" Release2");

        movie2Date.setForeground(Color.white);
        movie2Name.setForeground(Color.white);
        movie2Description.setForeground(Color.white);
        movie2Release.setForeground(Color.white);

        listPanel.add(movie2Name);
        listPanel.add(movie2Description);
        listPanel.add(movie2Date);
        listPanel.add(movie2Release);

        //Third
        JLabel movie3Name = new JLabel();
        movie3Name.setText("3 -     Name3 ");
        JLabel movie3Description = new JLabel();
        movie3Description.setText(" Desc3 ");
        JLabel movie3Date = new JLabel();
        movie3Date.setText(" Date3 ");
        JLabel movie3Release = new JLabel();
        movie3Release.setText(" Release3");

        movie3Name.setForeground(Color.white);
        movie3Date.setForeground(Color.white);
        movie3Release.setForeground(Color.white);
        movie3Description.setForeground(Color.white);

        listPanel.add(movie3Name);
        listPanel.add(movie3Description);
        listPanel.add(movie3Date);
        listPanel.add(movie3Release);

        //Fourth
        JLabel movie4Name = new JLabel();
        movie4Name.setText("4 -     Name4 ");
        JLabel movie4Description = new JLabel();
        movie4Description.setText(" Desc4 ");
        JLabel movie4Date = new JLabel();
        movie4Date.setText(" Date4 ");
        JLabel movie4Release = new JLabel();
        movie4Release.setText(" Release4");

        movie4Name.setForeground(Color.white);
        movie4Description.setForeground(Color.white);
        movie4Date.setForeground(Color.white);
        movie4Release.setForeground(Color.white);

        listPanel.add(movie4Name);
        listPanel.add(movie4Description);
        listPanel.add(movie4Date);
        listPanel.add(movie4Release);

        //Fifth
        JLabel movie5Name = new JLabel();
        movie5Name.setText("5 -     Name5 ");
        JLabel movie5Description = new JLabel();
        movie5Description.setText(" Desc5 ");
        JLabel movie5Date = new JLabel();
        movie5Date.setText(" Date5 ");
        JLabel movie5Release = new JLabel();
        movie5Release.setText(" Release5");

        movie5Name.setForeground(Color.white);
        movie5Date.setForeground(Color.white);
        movie5Description.setForeground(Color.white);
        movie5Release.setForeground(Color.white);

        listPanel.add(movie5Name);
        listPanel.add(movie5Description);
        listPanel.add(movie5Date);
        listPanel.add(movie5Release);


        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, listPanel);
        frame.setVisible(true);
    }
}

