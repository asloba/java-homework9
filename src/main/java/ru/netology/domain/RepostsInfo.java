package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean canRepost;
    private boolean isReposted;
    private String repostsImageUrl;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isReposted() {
        return isReposted;
    }

    public void setReposted(boolean reposted) {
        isReposted = reposted;
    }

    public String getRepostsImageUrl() {
        return repostsImageUrl;
    }

    public void setRepostsImageUrl(String repostsImageUrl) {
        this.repostsImageUrl = repostsImageUrl;
    }
}
