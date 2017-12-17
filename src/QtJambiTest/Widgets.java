package QtJambiTest;

import com.trolltech.qt.gui.*;

public class Widgets extends QWidget {
    public Widgets() {
        setFixedSize(200, 120);

        QPushButton quit = new QPushButton(tr("Quit"), this);
        quit.setGeometry(62, 40, 75, 30);
        quit.setFont(new QFont("Times", 18, QFont.Weight.Bold.value()));

        quit.clicked.connect(QApplication.instance(), "quit()");

        setWindowTitle(tr("Let There Be Widgets"));
    }

    public static void main(String args[]) {
        QApplication.initialize(args);

        Widgets widget = new Widgets();
        widget.show();

        QWidget popup = new QWidget(widget);
        popup.setFixedSize(100,100);
        popup.setWindowTitle("PopUp!");
        QLabel popupLabel = new QLabel(popup);
        popupLabel.setText("PopUp!");

        QPushButton button = new QPushButton("Click Me", widget);
        button.setGeometry(64, 5, 75, 30);
        button.clicked.connect(popup,"show()");
        button.show();

        QApplication.execStatic();
    }
}