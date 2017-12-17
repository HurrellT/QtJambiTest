package QtJambiTest;

import com.trolltech.qt.gui.*;

public class FamilyValues {
    public static void main(String args[]) {
        QApplication.initialize(args);


        QWidget window = new QWidget();

        window.resize(200, 120);



        QPushButton quit = new QPushButton("Quit", window);

        quit.setFont(new QFont("Times", 18, QFont.Weight.Bold.value()));

        quit.setGeometry(10, 40, 180, 40);


        quit.clicked.connect(QApplication.instance(), "quit()");

        window.setWindowTitle("FamilyValues");

        window.show();

        QApplication.execStatic();
    }
}