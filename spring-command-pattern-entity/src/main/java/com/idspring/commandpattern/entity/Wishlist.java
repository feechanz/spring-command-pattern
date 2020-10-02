package com.idspring.commandpattern.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Wishlist {
    @Id
    private String id;

    private String productId;
}
