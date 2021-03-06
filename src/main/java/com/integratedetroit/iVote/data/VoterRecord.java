package com.integratedetroit.iVote.data;

import javax.persistence.*;
import java.util.Objects;

/**
 * Describes the fields for the Voter table of the database. VoterService creates Voter to turn it into a VoterRecord,
 * database gives an ID to the VoterRecord, and then the VoterRecord is passed to the VoterRepository.
 */
@Entity
@Table(name = "voter_record")
public class VoterRecord {

    private String firstName;

    private String lastName;

    private String streetAddress;

    private String streetAddress2;

    private String city;

    private String state;

    private int zipCode;
    @Id
    @Column(name="emailAddress",unique=true)
    private String emailAddress;

    private String passwordHash;

    public VoterRecord() {

    }

    public static VoterRecord fromRecord(VoterRecord record) {
        return new VoterRecord();
    }


    public void setVoterFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getVoterFirstName() {
        return this.firstName;
    }

    public void setVoterLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getVoterLastName() {
        return this.lastName;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getStreetAddress2() {
        return this.streetAddress2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        VoterRecord that = (VoterRecord) obj;
        return zipCode == that.zipCode &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(streetAddress, that.streetAddress) &&
                Objects.equals(streetAddress2, that.streetAddress2) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(passwordHash, that.passwordHash);
    }

    @Override
    public int hashCode() {

        return Objects.hash( firstName, lastName, streetAddress, streetAddress2, city, state, zipCode, emailAddress, passwordHash);
    }
}
