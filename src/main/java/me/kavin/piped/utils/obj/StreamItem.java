package me.kavin.piped.utils.obj;

public class StreamItem {

    public String id, url, title, thumbnail, uploaderName, uploaderUrl, uploaderAvatar, uploadedDate, shortDescription;
    public long duration, views, uploaded;
    public boolean uploaderVerified;

    public StreamItem(String url, String title, String thumbnail, String uploaderName, String uploaderUrl,
                      String uploaderAvatar, String uploadedDate, String shortDescription, long duration, long views, long uploaded, boolean uploaderVerified) {
        this.id = url.replaceFirst("/watch\\?v=","");
        this.url = url;
        this.title = title;
        this.thumbnail = thumbnail;
        this.uploaderName = uploaderName;
        this.uploaderUrl = uploaderUrl;
        this.uploaderAvatar = uploaderAvatar;
        this.uploadedDate = uploadedDate;
        this.shortDescription = shortDescription;
        this.duration = duration;
        this.views = views;
        this.uploaded = uploaded;
        this.uploaderVerified = uploaderVerified;
    }
}
