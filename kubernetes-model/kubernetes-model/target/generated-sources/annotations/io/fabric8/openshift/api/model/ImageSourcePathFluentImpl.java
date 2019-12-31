package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ImageSourcePathFluentImpl<A extends ImageSourcePathFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageSourcePathFluent<A>{

    private String destinationDir;
    private String sourcePath;

    public ImageSourcePathFluentImpl(){
    }
    public ImageSourcePathFluentImpl(ImageSourcePath instance){
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSourcePath(instance.getSourcePath()); 
    }

    public String getDestinationDir(){
            return this.destinationDir;
    }

    public A withDestinationDir(String destinationDir){
            this.destinationDir=destinationDir; return (A) this;
    }

    public Boolean hasDestinationDir(){
            return this.destinationDir != null;
    }

    public String getSourcePath(){
            return this.sourcePath;
    }

    public A withSourcePath(String sourcePath){
            this.sourcePath=sourcePath; return (A) this;
    }

    public Boolean hasSourcePath(){
            return this.sourcePath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSourcePathFluentImpl that = (ImageSourcePathFluentImpl) o;
            if (destinationDir != null ? !destinationDir.equals(that.destinationDir) :that.destinationDir != null) return false;
            if (sourcePath != null ? !sourcePath.equals(that.sourcePath) :that.sourcePath != null) return false;
            return true;
    }




}
