package org.example;

import java.util.Date;

public class Note {

    private int id;
    private Date creationDate;
    private Date completioDate;
    private String description;
    private String text;
    private boolean state;
    private String link;
    private String mentions;
    private boolean priority;

    public Note( int id,Date creationDate, Date completioDate, String description, String text, boolean state, String link, String mentions, boolean priority) {
        this.id = id;
        // Autoincrement
        this.creationDate = creationDate;
        this.completioDate = completioDate;
        this.description = description;
        this.text = text;
        this.state = state;
        this.link = link;
        this.mentions = mentions;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCompletioDate() {
        return completioDate;
    }

    public void setCompletioDate(Date completioDate) {
        this.completioDate = completioDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMentions() {
        return mentions;
    }

    public void setMentions(String mentions) {
        this.mentions = mentions;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", completioDate=" + completioDate +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", state=" + state +
                ", link='" + link + '\'' +
                ", mentions='" + mentions + '\'' +
                ", priority=" + priority +
                '}';
    }
}
