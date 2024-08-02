package com.example.olive.domain;

import com.example.olive.type.ProductCategory;
import com.example.olive.type.ProductState;
import com.example.olive.type.StoreType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StoreType storeType;
    private String productName;
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
    private Long price;
    private Long quantity;
    @Enumerated(EnumType.STRING)
    private ProductState productState;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
