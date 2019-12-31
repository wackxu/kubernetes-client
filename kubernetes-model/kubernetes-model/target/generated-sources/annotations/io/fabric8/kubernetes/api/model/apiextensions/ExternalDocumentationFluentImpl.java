package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ExternalDocumentationFluentImpl<A extends ExternalDocumentationFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExternalDocumentationFluent<A>{

    private String description;
    private String url;

    public ExternalDocumentationFluentImpl(){
    }
    public ExternalDocumentationFluentImpl(ExternalDocumentation instance){
            this.withDescription(instance.getDescription()); 
            this.withUrl(instance.getUrl()); 
    }

    public String getDescription(){
            return this.description;
    }

    public A withDescription(String description){
            this.description=description; return (A) this;
    }

    public Boolean hasDescription(){
            return this.description != null;
    }

    public String getUrl(){
            return this.url;
    }

    public A withUrl(String url){
            this.url=url; return (A) this;
    }

    public Boolean hasUrl(){
            return this.url != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalDocumentationFluentImpl that = (ExternalDocumentationFluentImpl) o;
            if (description != null ? !description.equals(that.description) :that.description != null) return false;
            if (url != null ? !url.equals(that.url) :that.url != null) return false;
            return true;
    }




}
