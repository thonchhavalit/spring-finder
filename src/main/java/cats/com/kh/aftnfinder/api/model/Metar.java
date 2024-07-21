package cats.com.kh.aftnfinder.api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Metar", catalog = "AFTN", schema = "dbo")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Metar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "AF_MsgDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aFMsgDate;

    @Column(name = "AF_CH")
    private String afCh;

    @Column(name = "Originator")
    private String originator;

    @Column(name = "FILLING_TIME")
    private String fillingTime;

    @Column(name = "DECODE_STATUS")
    private String decodeStatus;

    @Column(name = "AF_TYPE")
    private String afType;
}
