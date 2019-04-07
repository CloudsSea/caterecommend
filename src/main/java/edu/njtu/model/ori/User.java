package edu.njtu.model.ori;


import java.util.List;

public class User extends edu.njtu.model.User {
    private List<String> elite;
    private List<String> friends;

    private Votes votes;
    private Compliments compliments;

    public List<String> getElite() {
        return elite;
    }

    public void setElite(List<String> elite) {
        this.elite = elite;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Votes getVotes() {
        return votes;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Compliments getCompliments() {
        return compliments;
    }

    public void setCompliments(Compliments compliments) {
        this.compliments = compliments;
    }
}
