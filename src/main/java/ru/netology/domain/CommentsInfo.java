package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean canRemoveComment;
    private boolean canReplyToComment;
    private boolean canAttachFile;
    private boolean canAttachPhoto;
    private boolean canAttachEmoji;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanRemoveComment() {
        return canRemoveComment;
    }

    public void setCanRemoveComment(boolean canRemoveComment) {
        this.canRemoveComment = canRemoveComment;
    }

    public boolean isCanReplyToComment() {
        return canReplyToComment;
    }

    public void setCanReplyToComment(boolean canReplyToComment) {
        this.canReplyToComment = canReplyToComment;
    }

    public String getCommentsPinUrl() {
        return commentsPinUrl;
    }

    public void setCommentsPinUrl(String commentsPinUrl) {
        this.commentsPinUrl = commentsPinUrl;
    }

    private String commentsPinUrl;

    public boolean isCanAttachFile() {
        return canAttachFile;
    }

    public void setCanAttachFile(boolean canAttachFile) {
        this.canAttachFile = canAttachFile;
    }

    public boolean isCanAttachPhoto() {
        return canAttachPhoto;
    }

    public void setCanAttachPhoto(boolean canAttachPhoto) {
        this.canAttachPhoto = canAttachPhoto;
    }

    public boolean isCanAttachEmoji() {
        return canAttachEmoji;
    }

    public void setCanAttachEmoji(boolean canAttachEmoji) {
        this.canAttachEmoji = canAttachEmoji;
    }
}
