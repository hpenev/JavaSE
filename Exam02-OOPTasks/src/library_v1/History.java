package library_v1;

import java.time.LocalDate;

public class History {
    private LocalDate dateTaken;
    private LocalDate dateReturn;

    public History(LocalDate dateTaken, LocalDate dateReturn) {
	this.dateTaken = dateTaken;
	this.dateReturn = dateReturn;
    }

}
