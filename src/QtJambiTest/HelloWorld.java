package QtJambiTest;


import com.trolltech.qt.gui.*;

public class HelloWorld {
    public static void main(String args[]) {
        QApplication.initialize(args);

        QPushButton hello = new QPushButton("Hello World!");
        hello.resize(150, 50);
        hello.setWindowTitle("Hello World");
        hello.show();

        QApplication.execStatic();
    }
}