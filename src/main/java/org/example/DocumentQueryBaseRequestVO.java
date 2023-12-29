package org.example;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ToString
@Data
public class DocumentQueryBaseRequestVO {

    @NotBlank
    private String documentId;

    private Integer requestType;

    private String rootDocumentId;

    private String bizLineId;

}
