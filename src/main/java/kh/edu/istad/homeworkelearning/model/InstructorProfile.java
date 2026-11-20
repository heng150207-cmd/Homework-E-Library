package kh.edu.istad.homeworkelearning.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="instructur_profiles")
public class InstructureProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String user_id;

    @Column(length = 255)
    private String biography;
    @Column(length = 255)
    private String facebook_link;
    @Column(length = 255)
    private String github_link;
    @Column(length = 255)
    private String job_link;
    @Column(length = 255)
    private String phone_number;
}
