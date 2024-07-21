package cats.com.kh.aftnfinder.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Arr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rec_id")
    private long id;

    @Column(name = "AF_MsgDate")
    private Date aFMsgDate;

    @Column(name = "AF_CH")
    private String aFCh;

    @Column(name = "AF_Originator")
    private String aFOriginator;

    @Column(name = "AF_Msg")
    private String aFMsg;

}
