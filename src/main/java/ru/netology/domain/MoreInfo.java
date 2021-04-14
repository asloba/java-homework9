package ru.netology.domain;

public class MoreInfo {
    private boolean canComplain;
    private boolean canSubscribe;
    private boolean canSaveToBookmarks;

    public boolean isCanComplain() {
        return canComplain;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public boolean isCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public boolean isCanSaveToBookmarks() {
        return canSaveToBookmarks;
    }

    public void setCanSaveToBookmarks(boolean canSaveToBookmarks) {
        this.canSaveToBookmarks = canSaveToBookmarks;
    }
}
