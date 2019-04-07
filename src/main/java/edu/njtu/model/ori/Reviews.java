package edu.njtu.model.ori;

import edu.njtu.model.Review;

public class Reviews extends Review {
    private Votes votes;

    public Votes getVotes() {
        return votes;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }
}
