package QtJambiTest;

import com.trolltech.qt.gui.*;

public class Quit {
    public static void main(String args[]) {
        QApplication.initialize(args);


        QPushButton quit = new QPushButton("Quit");

        quit.resize(80, 40);

        quit.setFont(new QFont("Times", 18, QFont.Weight.Bold.value()));



        quit.clicked.connect(QApplication.instance(), "quit()");


        quit.setWindowTitle("Calling It Quits");
        quit.show();
        QApplication.execStatic();
    }
}