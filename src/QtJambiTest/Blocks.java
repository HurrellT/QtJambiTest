package QtJambiTest;

import com.trolltech.qt.gui.*;
import com.trolltech.qt.core.*;

public class Blocks extends QWidget {
    public Blocks() {
        QPushButton quit = new QPushButton(tr("Quit"));
        quit.setFont(new QFont("Times", 18, QFont.Weight.Bold.value()));

        QPushButton setValueBaseTo2 = new QPushButton(tr("Base 2"));
        QPushButton setValueBaseTo3 = new QPushButton(tr("Base 3"));
        QPushButton setValueBaseTo4 = new QPushButton(tr("Base 4"));

        Integer baseVal = 2;

        QLCDNumber lcd = new QLCDNumber(baseVal);
        lcd.setSegmentStyle(QLCDNumber.SegmentStyle.Filled);

        QSlider slider = new QSlider(Qt.Orientation.Horizontal);
        slider.setRange(0, 9999);
        slider.setValue(0);

//        setValueBaseTo2.onClick.changeTheBaseVal;
//        setValueBaseTo3.clicked.connect(lcd,"setDigitCount(3)");
//        setValueBaseTo4.clicked.connect(lcd,"setDigitCount(4)");

        quit.clicked.connect(QApplication.instance(), "quit()");
        slider.valueChanged.connect(lcd, "display(int)");

        QVBoxLayout layout = new QVBoxLayout();
        layout.addWidget(setValueBaseTo2);
        layout.addWidget(setValueBaseTo3);
        layout.addWidget(setValueBaseTo4);
        layout.addWidget(lcd);
        layout.addWidget(slider);
        layout.addWidget(quit);
        setLayout(layout);
        setWindowTitle(tr("Building Blocks"));
    }

    public static void main(String args[]) {
        QApplication.initialize(args);

        Blocks widget = new Blocks();
        widget.show();

        QApplication.execStatic();
    }
}
