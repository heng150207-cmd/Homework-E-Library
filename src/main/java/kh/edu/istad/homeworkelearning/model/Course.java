package kh.edu.istad.homeworkelearning.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 4)
    private Integer count_rating;
    private Timestamp created_at;
    @Column(length = 255)
    private String description;
    @Column(nullable = false)
    private Float discount_percent;
    @Column(nullable = false)
    private Boolean is_deleted;
    @Column(nullable = false)
    private Boolean is_published;
    @Column(length = 255)
    private String keyword;
    @Column(length = 255)
    private String level;
    @Column(nullable = false)
    public BigDecimal price;
    @Column(length = 255)
    private String slug;
    private Float star_rating;
    @Column(length = 255)
    private String thumnail;
    @Column(length = 255)
    private String title;
    private Float total_hours;
    private Timestamp updated_at;
    private Integer category_id;
    @Column(length = 255)
    private String instructor_id;

}
