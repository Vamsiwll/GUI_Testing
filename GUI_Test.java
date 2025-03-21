import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class ImageViewerAppTest {

    private ImageViewerApp app;

    @BeforeEach
    void setUp() {
        app = new ImageViewerApp();
    }


    @Test
    void testImageLabelExists() {
        assertNotNull(new ImageViewerApp().imageLabel1);
        assertNotNull(new ImageViewerApp().imageLabel2);
        assertNotNull(new ImageViewerApp().imageLabel3);
    }

    @Test
    void testTextBoxExists() {
        assertNotNull(new ImageViewerApp().textBox1);
        assertNotNull(new ImageViewerApp().textBox2);
        assertNotNull(new ImageViewerApp().textBox3);
    }

    @Test
    void testHeadingLabelExists() {
        assertNotNull(new ImageViewerApp().headingLabel1);
        assertNotNull(new ImageViewerApp().headingLabel2);
        assertNotNull(new ImageViewerApp().headingLabel3);
    }

    @Test
    void testNextButtonExists() {
        assertNotNull(new ImageViewerApp().nextButton1);
        assertNotNull(new ImageViewerApp().nextButton2);
        assertNotNull(new ImageViewerApp().nextButton3);
    }

    @Test
    void testPreviousButtonExists() {
        assertNotNull(new ImageViewerApp().prevButton1);
        assertNotNull(new ImageViewerApp().prevButton2);
        assertNotNull(new ImageViewerApp().prevButton3);
    }

    @Test
    void testRadioButtonExists() {
        assertNotNull(app.radioButton1);
        assertNotNull(app.radioButton2);
        assertNotNull(app.radioButton3);
        assertNotNull(app.radioButton4);
        assertNotNull(app.radioButton5);
        assertNotNull(app.radioButton6);
    }

    @Test
    void testCheckBoxExists() {
        assertNotNull(new ImageViewerApp().checkBox1);
        assertNotNull(new ImageViewerApp().checkBox2);
        assertNotNull(new ImageViewerApp().checkBox3);
        assertNotNull(new ImageViewerApp().checkBox4);
        assertNotNull(new ImageViewerApp().checkBox5);
        assertNotNull(new ImageViewerApp().checkBox6);
        assertNotNull(new ImageViewerApp().checkBox7);
        assertNotNull(new ImageViewerApp().checkBox8);
    }

    @Test
    void testSliderExists() {
        assertNotNull(new ImageViewerApp().slider1);
        assertNotNull(new ImageViewerApp().slider2);
        assertNotNull(new ImageViewerApp().slider3);
    }

    @Test
    void testImageLabelsLocationAndSize() {
        JLabel imageLabel1 = app.imageLabel1;
        Dimension expectedSize1 = new Dimension(640, 427);
        Point expectedLocation1 = new Point(223, 5);
        assertEquals(expectedSize1, imageLabel1.getSize());
        assertEquals(expectedLocation1, imageLabel1.getLocation());

        app.showPage2();
        JLabel imageLabel2 = app.imageLabel2;
        Dimension expectedSize2 = new Dimension(275, 183);
        Point expectedLocation2 = new Point(329, 5);
        assertEquals(expectedSize2, imageLabel2.getSize());
        assertEquals(expectedLocation2, imageLabel2.getLocation());

        app.showPage3();
        JLabel imageLabel3 = app.imageLabel3;
        Dimension expectedSize3 = new Dimension(288, 175);
        Point expectedLocation3 = new Point(318, 5);
        assertEquals(expectedSize3, imageLabel3.getSize());
        assertEquals(expectedLocation3, imageLabel3.getLocation());
    }

    @Test
    void testTextBoxLocationAndSize() {
        JTextField textBox1 = app.textBox1;
        Dimension expectedSize = new Dimension(105, 20);
        Point expectedLocation = new Point(868,208);
        assertEquals(expectedSize, textBox1.getSize());
        assertEquals(expectedLocation, textBox1.getLocation());

        app.showPage2();
        JTextField textBox2 = app.textBox2;
        Dimension expectedSize2 = new Dimension(105, 20);
        Point expectedLocation2 = new Point(609,86);
        assertEquals(expectedSize2, textBox2.getSize());
        assertEquals(expectedLocation2, textBox2.getLocation());

        app.showPage3();
        JTextField textBox3 = app.textBox3;
        Dimension expectedSize3 = new Dimension(105, 20);
        Point expectedLocation3 = new Point(611,82);
        assertEquals(expectedSize3, textBox3.getSize());
        assertEquals(expectedLocation3, textBox3.getLocation());
    }

    @Test
    void testHeadingLabelLocationAndSize() {
        JLabel headingLabel1 = app.headingLabel1;
        Dimension expectedSize = new Dimension(119, 16);
        Point expectedLocation = new Point(99, 210);
        assertEquals(expectedSize, headingLabel1.getSize());
        assertEquals(expectedLocation, headingLabel1.getLocation());

        app.showPage2();
        JLabel headingLabel2 = app.headingLabel2;
        Dimension expectedSize2 = new Dimension(191, 16);
        Point expectedLocation2 = new Point(133, 88);
        assertEquals(expectedSize2, headingLabel2.getSize());
        assertEquals(expectedLocation2, headingLabel2.getLocation());

        app.showPage3();
        JLabel headingLabel3 = app.headingLabel3;
        Dimension expectedSize3 = new Dimension(176, 16);
        Point expectedLocation3 = new Point(137, 84);
        assertEquals(expectedSize3, headingLabel3.getSize());
        assertEquals(expectedLocation3, headingLabel3.getLocation());
    }

    @Test
    void testNextButtonLocationAndSize() {
        JButton nextButton1 = app.nextButton1;
        Dimension expectedSize = new Dimension(60, 26);
        Point expectedLocation = new Point(231, 524);
        assertEquals(expectedSize, nextButton1.getSize());
        assertEquals(expectedLocation, nextButton1.getLocation());

        app.showPage2();
        JButton nextButton2 = app.nextButton2;
        Dimension expectedSize2 = new Dimension(60, 26);
        Point expectedLocation2 = new Point(719, 83);
        assertEquals(expectedSize2, nextButton2.getSize());
        assertEquals(expectedLocation2, nextButton2.getLocation());

        app.showPage3();
        JButton nextButton3 = app.nextButton3;
        Dimension expectedSize3 = new Dimension(60, 26);
        Point expectedLocation3 = new Point(721, 79);
        assertEquals(expectedSize3, nextButton3.getSize());
        assertEquals(expectedLocation3, nextButton3.getLocation());
    }

        @Test
        void testTextBoxContent() {
            assertEquals("Text Box in Page 1", new ImageViewerApp().textBox1.getText());
            assertEquals("Text Box in Page 2", new ImageViewerApp().textBox2.getText());
            assertEquals("Text Box in Page 3", new ImageViewerApp().textBox3.getText());
        }

        @Test
        void testHeadingLabelContent() {
            assertEquals("Image Viewer - SVVT", new ImageViewerApp().headingLabel1.getText());
            assertEquals("Image Viewer - Functional Testing", new ImageViewerApp().headingLabel2.getText());
            assertEquals("Image Viewer - System Testing", new ImageViewerApp().headingLabel3.getText());
        }


        @Test
        void testNextButtonsFunctionality() {
            app.showPage1();
            app.nextButton1.doClick();
            assertEquals(app.panel2, app.frame.getContentPane().getComponent(0));

            app.showPage2();
            app.nextButton2.doClick();
            assertEquals(app.panel3, app.frame.getContentPane().getComponent(0));

            app.showPage3();
            app.nextButton3.doClick();
            assertEquals(app.panel1, app.frame.getContentPane().getComponent(0));
        }

        @Test
        void testPrevButtonsFunctionality() {
            app.showPage3();
            app.prevButton3.doClick();
            assertEquals(app.panel2, app.frame.getContentPane().getComponent(0));

            app.showPage2();
            app.prevButton2.doClick();
            assertEquals(app.panel1, app.frame.getContentPane().getComponent(0));

            app.showPage1();
            app.prevButton1.doClick();
            assertEquals(app.panel3, app.frame.getContentPane().getComponent(0));
        }

        @Test
        void testSliderValue() {

            int expectedValue1 = 50;
            int expectedValue2 = 30;
            int expectedValue3 = 70;

            int actualValue1 = app.slider1.getValue();
            int actualValue2 = app.slider2.getValue();
            int actualValue3;
            if(app.slider3 == null){
                actualValue3 = 0;
            }
            else {
                actualValue3 = app.slider3.getValue();
            }

            assertEquals(expectedValue1, actualValue1);
            assertEquals(expectedValue2, actualValue2);
            assertEquals(expectedValue3, actualValue3);
        }

        @Test
        void testSliderOrientation() {
            int expectedOrientation1 = JSlider.VERTICAL;
            int expectedOrientation2 = JSlider.HORIZONTAL;
            int expectedOrientation3 = JSlider.HORIZONTAL;

            int actualOrientation1 = app.slider1.getOrientation();
            int actualOrientation2 = app.slider2.getOrientation();
            int actualOrientation3;
            if(app.slider3 == null){
                actualOrientation3 = 2;
            }
            else {
                actualOrientation3 = app.slider3.getOrientation();
            }

            assertEquals(expectedOrientation1, actualOrientation1);
            assertEquals(expectedOrientation2, actualOrientation2);
            assertEquals(expectedOrientation3, actualOrientation3);
    }

    }

