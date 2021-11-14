package io.joshuaphilips.betterreads.userbooks;

import java.time.LocalDate;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "book_by_user_and_bookid")
public class UserBooks {

    @PrimaryKey
    private UserBooksPrimaryKey key;

    @Column("started_date")
    @CassandraType(type = Name.DATE)
    private LocalDate startedDate;

    @Column("completed_date")
    @CassandraType(type = Name.DATE)
    private LocalDate completedDate;

    @Column("reading_status")
    @CassandraType(type = Name.TEXT)
    private String readingStatus;

    @Column("rating")
    @CassandraType(type = Name.INT)
    private int rating;

    /**
     * @return the startedDate
     */
    public LocalDate getStartedDate() {
        return startedDate;
    }

    /**
     * @param startedDate the startedDate to set
     */
    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }

    /**
     * @return the completedDate
     */
    public LocalDate getCompletedDate() {
        return completedDate;
    }

    /**
     * @param completedDate the completedDate to set
     */
    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    /**
     * @return the readingStatus
     */
    public String getReadingStatus() {
        return readingStatus;
    }

    /**
     * @param readingStatus the readingStatus to set
     */
    public void setReadingStatus(String readingStatus) {
        this.readingStatus = readingStatus;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

}