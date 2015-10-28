package src.main.to;

import src.main.entities.Media;
import src.main.entities.Review;
import src.main.entities.User;
import src.main.entities.UserRole;

import java.util.Date;
import java.util.List;

/**
 * Created by Salman on 10/27/2015.
 */
public class UserTO extends TO {

    private Integer id;
    private UserRole role;
    private String firstName;
    private String lastName;
    private String email;
    private List<Media> medias;
    private Date birthDate;
    private List<Review> userReviews;

    public UserTO() {

    }

    public void createTO(User user) {
        this.id = user.getId();
        this.role = user.getRole();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.medias = user.getMedias();
        this.birthDate = user.getBirthDate();
        this.userReviews = user.getUserReviews();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Review> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(List<Review> userReviews) {
        this.userReviews = userReviews;
    }
}
