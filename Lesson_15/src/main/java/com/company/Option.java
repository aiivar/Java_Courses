package com.company;

/**
 * Created by roi on 4/6/2019.
 */
public class Option {
   private Integer id;
   private String text;
   private Integer votes=0;
   private Integer poll_id;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public void setPoll_id(Integer poll_id) {
        this.poll_id = poll_id;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getVotes() {
        return votes;
    }

    public int getPoll_id() {
        return poll_id;
    }
}
