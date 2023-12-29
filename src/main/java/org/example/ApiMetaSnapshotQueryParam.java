package org.example;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApiMetaSnapshotQueryParam {


    private Integer bizLine;

    private Long apiCollectionId;

    private Long moduleId;

    private List<ApiVersionParam> apiVersionParams;
}
