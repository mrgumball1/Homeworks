package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> videos;

    public VideoStore() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }

    public void checkOut(String title) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.checkedOut();
            }
        }
    }

    public void returnVideo(String title) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.returnVideo();
            }
        }
    }

    public void getRating(String title, int rating) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.receiveRating(rating);
            }
        }
    }

    public void printOutInventory() {
        for (Video v : videos) {
            System.out.println(v);
        }
    }
}
