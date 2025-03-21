import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ImageViewerApp {
    public JFrame frame;
    public JPanel panel1, panel2, panel3;
    public JButton nextButton1, prevButton1, nextButton2, prevButton2, nextButton3, prevButton3;
    public JLabel imageLabel1, imageLabel2, imageLabel3, headingLabel1, headingLabel2, headingLabel3;
    public JTextField textBox1, textBox2, textBox3;
    public JRadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6;
    public JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;
    public JSlider slider1, slider2, slider3;

    public ImageViewerApp() {
        frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);

        // Create GUI elements for Page 1
        panel1 = new JPanel();
        imageLabel1 = new JLabel(new ImageIcon("C:\\Users\\ysaiv\\IdeaProjects\\GUI_Final\\src\\image1.jpg"));
        textBox1 = new JTextField("Text Box in Page 1");
        prevButton1 = new JButton("Previous");
        headingLabel1 = new JLabel("Image Viewer - SVVT");
        nextButton1 = new JButton("Next");
        prevButton1.addActionListener(e -> showPage3());
        nextButton1.addActionListener(e -> showPage2());
        panel1.add(prevButton1);
        panel1.add(headingLabel1);
        panel1.add(imageLabel1);
        panel1.add(textBox1);
        panel1.add(nextButton1);

// Add radio buttons
        radioButton1 = new JRadioButton("Option 1");
        radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

// Add checkboxes
        checkBox1 = new JCheckBox("Verification");
        checkBox2 = new JCheckBox("Validation");
        checkBox3 = new JCheckBox("Testing");

// Add sliders
        slider1 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider1.setMajorTickSpacing(20);
        slider1.setMinorTickSpacing(5);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);

// Add components to panel1
        panel1.add(radioButton1);
        panel1.add(radioButton2);
        panel1.add(checkBox1);
        panel1.add(checkBox2);
        panel1.add(checkBox3);
        panel1.add(slider1);

        // Create GUI elements for Page 2
        panel2 = new JPanel();
        imageLabel2 = new JLabel(new ImageIcon("C:\\Users\\ysaiv\\IdeaProjects\\GUI_Final\\src\\image2.jpeg"));
        headingLabel2 = new JLabel("Image Viewer - Functional Testing");
        prevButton2 = new JButton("Previous");
        nextButton2 = new JButton("Next");
        textBox2 = new JTextField("Text Box in Page 2");
        prevButton2.addActionListener(e -> showPage1());
        nextButton2.addActionListener(e -> showPage3());
        panel2.add(prevButton2);
        panel2.add(headingLabel2);
        panel2.add(imageLabel2);
        panel2.add(textBox2);
        panel2.add(nextButton2);

// Add radio buttons
        radioButton3 = new JRadioButton("Choice A");
        radioButton4 = new JRadioButton("Choice B");
        ButtonGroup radioGroup2 = new ButtonGroup();
        radioGroup2.add(radioButton3);
        radioGroup2.add(radioButton4);

// Add checkboxes
        checkBox4 = new JCheckBox("Black Box Testing");
        checkBox5 = new JCheckBox("White Box Testing");

// Add sliders
        slider2 = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);

// Add components to panel2
        panel2.add(radioButton3);
        panel2.add(radioButton4);
        panel2.add(checkBox4);
        panel2.add(checkBox5);
        panel2.add(slider2);

        // Create GUI elements for Page 3
        panel3 = new JPanel();
        imageLabel3 = new JLabel(new ImageIcon("C:\\Users\\ysaiv\\IdeaProjects\\GUI_Final\\src\\image3.jpeg"));
        textBox3 = new JTextField("Text Box in Page 3");
        headingLabel3 = new JLabel("Image Viewer - System Testing");
        prevButton3 = new JButton("Previous");
        nextButton3 = new JButton("Next");
        nextButton3.addActionListener(e -> showPage1());
        prevButton3.addActionListener(e -> showPage2());
        panel3.add(prevButton3);
        panel3.add(headingLabel3);
        panel3.add(imageLabel3);
        panel3.add(textBox3);
        panel3.add(nextButton3);

// Add radio buttons
        radioButton5 = new JRadioButton("Option X");
        radioButton6 = new JRadioButton("Option Y");
        ButtonGroup radioGroup3 = new ButtonGroup();
        radioGroup3.add(radioButton5);
        radioGroup3.add(radioButton6);

// Add checkboxes
        checkBox6 = new JCheckBox("Performance Testing");
        checkBox7 = new JCheckBox("Stress Testing");
        checkBox8 = new JCheckBox("Safety and Security Testing");

// Add sliders
        slider3 = new JSlider(JSlider.HORIZONTAL, 0, 100, 70);
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        slider3.setPaintTicks(true);
        slider3.setPaintLabels(true);

// Add components to panel3
        panel3.add(radioButton5);
        panel3.add(radioButton6);
        panel3.add(checkBox6);
        panel3.add(checkBox7);
        panel3.add(checkBox8);
        panel3.add(slider3);

        // Set initial page
        frame.add(panel1);
        frame.setVisible(true);
    }

    public void showPage1() {
        frame.getContentPane().removeAll();
        frame.add(panel1);
        frame.revalidate();
        frame.repaint();
    }

    public void showPage2() {
        frame.getContentPane().removeAll();
        frame.add(panel2);
        frame.revalidate();
        frame.repaint();
    }

    public void showPage3() {
        frame.getContentPane().removeAll();
        frame.add(panel3);
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageViewerApp());
    }
}

