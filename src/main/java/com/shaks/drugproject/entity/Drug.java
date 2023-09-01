package com.shaks.drugproject.entity;

import com.shaks.drugproject.status.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "drug")
@Builder
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String drugName;

    private String BrandName;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdAt;

}
