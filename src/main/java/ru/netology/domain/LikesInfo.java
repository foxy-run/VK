package ru.netology.domain;

public class LikesInfo {
    private int count;
    String authorLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAuthorLike() {
        return authorLike;
    }

    public void setAuthorLike(String authorLike) {
        this.authorLike = authorLike;
    }
}
