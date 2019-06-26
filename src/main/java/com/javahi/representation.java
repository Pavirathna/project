package com.javahi;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class representation {
    @Length(max = 3)
    private String content = "HelloPradeep";

    private representation(String content) {
    }

    @JsonProperty
    public String getContent() {

        return content;
    }

    public void setContent() {
        this.content = getContent();
    }
}