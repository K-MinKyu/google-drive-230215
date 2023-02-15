package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FlieUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date type;
    private String userId;
    private Long uploadedTime;
    private String userId;
}
