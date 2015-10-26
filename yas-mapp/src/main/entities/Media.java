package src.main.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Salman on 10/25/2015.
 */

@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "media_location")
    private String mediaLocation;

    @Column(name = "media_location_url")
    private boolean fromUrl;

    @Column(name = "date")
    private Date uploadDate;

    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMediaLocation() {
        return mediaLocation;
    }

    public void setMediaLocation(String mediaLocation) {
        this.mediaLocation = mediaLocation;
    }

    public boolean isFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(boolean fromUrl) {
        this.fromUrl = fromUrl;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
