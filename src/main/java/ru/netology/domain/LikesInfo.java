package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLike;
    private boolean caneRemoveLike;
    private boolean isLiked;
    private String likesImageUrl;

    public boolean isCanSeeWhoLiked() {
        return canSeeWhoLiked;
    }

    public void setCanSeeWhoLiked(boolean canSeeWhoLiked) {
        this.canSeeWhoLiked = canSeeWhoLiked;
    }

    private boolean canSeeWhoLiked;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCaneRemoveLike() {
        return caneRemoveLike;
    }

    public void setCaneRemoveLike(boolean caneRemoveLike) {
        this.caneRemoveLike = caneRemoveLike;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getLikesImageUrl() {
        return likesImageUrl;
    }

    public void setLikesImageUrl(String likesImageUrl) {
        this.likesImageUrl = likesImageUrl;
    }
}
