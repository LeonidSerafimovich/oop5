import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

import java.util.Date;

public class Program {

    /**
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Василий");
        bookingView.reservationTable(new Date(), 2, "Алексей");
        bookingView.reservationTable(new Date(), 5, "Петр");

        bookingView.changeReservationTable(1001, new Date(), 2, "Василий");
    }

}
