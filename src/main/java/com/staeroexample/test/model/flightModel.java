package com.staeroexample.test.model;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "Flights")
public class flightModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name="tailNumber")
    private String tailNumber;

    @NotNull
    @Column(name="flightID")
    private String flightID;

    @NotNull
    @Column(name="takeoff")
    private String takeoff;

    @NotNull
    @Column(name="landing")
    private String landing;

    @NotNull
    @Column(name="duration")
    private String duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }



}
