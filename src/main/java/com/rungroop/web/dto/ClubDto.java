package com.rungroop.web.dto;

import javax.validation.constraints.NotEmpty;

import com.rungroop.web.models.UserEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class ClubDto {

    private Long id;
    @NotEmpty(message = "Club Title should not be Empty")
    private String title;
    @NotEmpty(message = "Photo Link should not be Empty")
    private String photoUrl;
    @NotEmpty(message = "Content should not be Empty")
    private String content;

    private UserEntity createdBy;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    private List<EventDto> events;
}
