package cats.com.kh.aftnfinder.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Fpl {

    @Column(name = "AF_MsgDate")
    private Date aFMsgDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "Msgs")
    private String msgs;

    @Column(name = "AF_CH")
    private String afCh;

    @Column(name = "AF_Originator")
    private String aFOriginator;

    @Column(name = "CallSign")
    private String callSign;

    private Boolean isFlyOver;

    private int departureTime;
    private int arrivalTime;
    private String aeroDeparture;
    private String aircraft;
    private String REG;


}
