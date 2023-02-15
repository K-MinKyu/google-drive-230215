package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long Id;
    private Long fileId;
    private String url;
}
