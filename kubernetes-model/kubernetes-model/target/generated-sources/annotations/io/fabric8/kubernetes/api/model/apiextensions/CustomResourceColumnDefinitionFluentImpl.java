package io.fabric8.kubernetes.api.model.apiextensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CustomResourceColumnDefinitionFluentImpl<A extends CustomResourceColumnDefinitionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceColumnDefinitionFluent<A>{

    private String jSONPath;
    private String description;
    private String format;
    private String name;
    private Integer priority;
    private String type;

    public CustomResourceColumnDefinitionFluentImpl(){
    }
    public CustomResourceColumnDefinitionFluentImpl(CustomResourceColumnDefinition instance){
            this.withJSONPath(instance.getJSONPath()); 
            this.withDescription(instance.getDescription()); 
            this.withFormat(instance.getFormat()); 
            this.withName(instance.getName()); 
            this.withPriority(instance.getPriority()); 
            this.withType(instance.getType()); 
    }

    public String getJSONPath(){
            return this.jSONPath;
    }

    public A withJSONPath(String jSONPath){
            this.jSONPath=jSONPath; return (A) this;
    }

    public Boolean hasJSONPath(){
            return this.jSONPath != null;
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

    public String getFormat(){
            return this.format;
    }

    public A withFormat(String format){
            this.format=format; return (A) this;
    }

    public Boolean hasFormat(){
            return this.format != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Integer getPriority(){
            return this.priority;
    }

    public A withPriority(Integer priority){
            this.priority=priority; return (A) this;
    }

    public Boolean hasPriority(){
            return this.priority != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceColumnDefinitionFluentImpl that = (CustomResourceColumnDefinitionFluentImpl) o;
            if (jSONPath != null ? !jSONPath.equals(that.jSONPath) :that.jSONPath != null) return false;
            if (description != null ? !description.equals(that.description) :that.description != null) return false;
            if (format != null ? !format.equals(that.format) :that.format != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
