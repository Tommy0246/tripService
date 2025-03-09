package efrei.net.tripservice.data;

import jakarta.persistence.*;

@Entity
@Table(name = "dates")
public class Dates {
    @Id
    private Long id;
    private String startDate;
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "trip_reference", referencedColumnName = "tripReference")
    private Trip trip;

    public Dates(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Dates() {

    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "begin='" + startDate + '\'' +
                ", end='" + endDate + '\'' +
                '}';
    }
}
