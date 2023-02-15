package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileIndexed extends AbstractEvent {

    private Long Id;
    private Long fileId;
    private List<String> keyword;
}
