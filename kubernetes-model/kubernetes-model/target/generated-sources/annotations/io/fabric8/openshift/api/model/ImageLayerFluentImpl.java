package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ImageLayerFluentImpl<A extends ImageLayerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageLayerFluent<A>{

    private String mediaType;
    private String name;
    private Long size;

    public ImageLayerFluentImpl(){
    }
    public ImageLayerFluentImpl(ImageLayer instance){
            this.withMediaType(instance.getMediaType()); 
            this.withName(instance.getName()); 
            this.withSize(instance.getSize()); 
    }

    public String getMediaType(){
            return this.mediaType;
    }

    public A withMediaType(String mediaType){
            this.mediaType=mediaType; return (A) this;
    }

    public Boolean hasMediaType(){
            return this.mediaType != null;
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

    public Long getSize(){
            return this.size;
    }

    public A withSize(Long size){
            this.size=size; return (A) this;
    }

    public Boolean hasSize(){
            return this.size != null;
    }

    public A withNewSize(String arg1){
            return (A)withSize(new Long(arg1));
    }

    public A withNewSize(long arg1){
            return (A)withSize(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLayerFluentImpl that = (ImageLayerFluentImpl) o;
            if (mediaType != null ? !mediaType.equals(that.mediaType) :that.mediaType != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (size != null ? !size.equals(that.size) :that.size != null) return false;
            return true;
    }




}
