package ru.netology.domain;

public class DonutInfo {
    private boolean isDonut;
    private int paidDuration;
    private String placeholder;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
