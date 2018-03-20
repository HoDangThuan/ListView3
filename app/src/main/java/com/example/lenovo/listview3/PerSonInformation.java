package com.example.lenovo.listview3;

/**
 * Created by Lenovo on 07-Mar-18.
 */

public class PerSonInformation {

    private int perSon, dot, dotOff, star, next;
    private String name;
    private float distance, score, time;

    public PerSonInformation(int perSon, int dot, int dotOff, int star, int next, String name, float distance, float score, float time) {
        this.perSon = perSon;
        this.dot = dot;
        this.star = star;
        this.next = next;
        this.name = name;
        this.dotOff = dotOff;
        this.distance = distance;
        this.score = score;
        this.time = time;
    }

    public int getPerSon() {
        return perSon;
    }

    public int getDot() {
        return dot;
    }

    public int getDotOff() {
        return dotOff;
    }

    public int getStar() {
        return star;
    }

    public int getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public float getDistance() {
        return distance;
    }

    public float getScore() {
        return score;
    }

    public float getTime() {
        return time;
    }

    public void setPerSon(int perSon) {
        this.perSon = perSon;
    }

    public void setDot(int dot) {
        this.dot = dot;
    }

    public void setDotOff(int dotOff) {
        this.dotOff = dotOff;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setTime(float time) {
        this.time = time;
    }
}

