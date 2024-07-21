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
public class Chg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AF_CH")
    private String afCh;

    @Column(name = "AF_MsgDate")
    private Date aFMsgDate;

    @Column(name = "AF_Originator")
    private String aFOriginator;

    @Column(name = "Msgs")
    private String Msgs;
}
