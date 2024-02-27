package com.fabiofrau.UploadDownloadFiles.dto;

import com.fabiofrau.UploadDownloadFiles.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DownloadProfilePictureDTO {

    private User user;
    private byte[] profileImage;

}
