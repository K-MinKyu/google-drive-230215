package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FlieUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date type;
    private String userId;
    private Long uploadedTime;
    private String userId;

    public FlieUploaded(File aggregate) {
        super(aggregate);
    }

    public FlieUploaded() {
        super();
    }
}
