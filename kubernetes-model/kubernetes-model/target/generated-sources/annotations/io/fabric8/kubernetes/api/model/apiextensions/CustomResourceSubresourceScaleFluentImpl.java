package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CustomResourceSubresourceScaleFluentImpl<A extends CustomResourceSubresourceScaleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceSubresourceScaleFluent<A>{

    private String labelSelectorPath;
    private String specReplicasPath;
    private String statusReplicasPath;

    public CustomResourceSubresourceScaleFluentImpl(){
    }
    public CustomResourceSubresourceScaleFluentImpl(CustomResourceSubresourceScale instance){
            this.withLabelSelectorPath(instance.getLabelSelectorPath()); 
            this.withSpecReplicasPath(instance.getSpecReplicasPath()); 
            this.withStatusReplicasPath(instance.getStatusReplicasPath()); 
    }

    public String getLabelSelectorPath(){
            return this.labelSelectorPath;
    }

    public A withLabelSelectorPath(String labelSelectorPath){
            this.labelSelectorPath=labelSelectorPath; return (A) this;
    }

    public Boolean hasLabelSelectorPath(){
            return this.labelSelectorPath != null;
    }

    public String getSpecReplicasPath(){
            return this.specReplicasPath;
    }

    public A withSpecReplicasPath(String specReplicasPath){
            this.specReplicasPath=specReplicasPath; return (A) this;
    }

    public Boolean hasSpecReplicasPath(){
            return this.specReplicasPath != null;
    }

    public String getStatusReplicasPath(){
            return this.statusReplicasPath;
    }

    public A withStatusReplicasPath(String statusReplicasPath){
            this.statusReplicasPath=statusReplicasPath; return (A) this;
    }

    public Boolean hasStatusReplicasPath(){
            return this.statusReplicasPath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourceScaleFluentImpl that = (CustomResourceSubresourceScaleFluentImpl) o;
            if (labelSelectorPath != null ? !labelSelectorPath.equals(that.labelSelectorPath) :that.labelSelectorPath != null) return false;
            if (specReplicasPath != null ? !specReplicasPath.equals(that.specReplicasPath) :that.specReplicasPath != null) return false;
            if (statusReplicasPath != null ? !statusReplicasPath.equals(that.statusReplicasPath) :that.statusReplicasPath != null) return false;
            return true;
    }




}
