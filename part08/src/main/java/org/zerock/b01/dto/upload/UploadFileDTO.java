package org.zerock.b01.dto.upload;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by sskim
 */
@Data
public class UploadFileDTO {

    private List<MultipartFile> files;
}
