package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ImageLabelFluentImpl<A extends ImageLabelFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageLabelFluent<A>{

    private String name;
    private String value;

    public ImageLabelFluentImpl(){
    }
    public ImageLabelFluentImpl(ImageLabel instance){
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
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

    public String getValue(){
            return this.value;
    }

    public A withValue(String value){
            this.value=value; return (A) this;
    }

    public Boolean hasValue(){
            return this.value != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLabelFluentImpl that = (ImageLabelFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            return true;
    }




}
