package com.brian.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReservationKey {
    @Column(name = "jet_id")
    int jet_id;

    @Column(name = "route_id")
    int route_id;
    
    @Column(name = "user_id")
    int user_id;
}
