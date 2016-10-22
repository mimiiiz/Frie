package com.google.firebase.codelab.friendlychat;

/**
 * Created by User on 22/10/2559.
 */

public class Review {

    private int reviewId;
    private String reviewComment;
    private double reviewStar;

    public Review(int reviewId, String reviewComment, double reviewStar){
        this.reviewId = reviewId;
        this.reviewComment = reviewComment;
        this.reviewStar = reviewStar;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public double getReviewStar() {
        return reviewStar;
    }

    public void setReviewStar(double reviewStar) {
        this.reviewStar = reviewStar;
    }
}
