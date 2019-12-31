package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class FlockerVolumeSourceFluentImpl<A extends FlockerVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements FlockerVolumeSourceFluent<A>{

    private String datasetName;
    private String datasetUUID;

    public FlockerVolumeSourceFluentImpl(){
    }
    public FlockerVolumeSourceFluentImpl(FlockerVolumeSource instance){
            this.withDatasetName(instance.getDatasetName()); 
            this.withDatasetUUID(instance.getDatasetUUID()); 
    }

    public String getDatasetName(){
            return this.datasetName;
    }

    public A withDatasetName(String datasetName){
            this.datasetName=datasetName; return (A) this;
    }

    public Boolean hasDatasetName(){
            return this.datasetName != null;
    }

    public String getDatasetUUID(){
            return this.datasetUUID;
    }

    public A withDatasetUUID(String datasetUUID){
            this.datasetUUID=datasetUUID; return (A) this;
    }

    public Boolean hasDatasetUUID(){
            return this.datasetUUID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FlockerVolumeSourceFluentImpl that = (FlockerVolumeSourceFluentImpl) o;
            if (datasetName != null ? !datasetName.equals(that.datasetName) :that.datasetName != null) return false;
            if (datasetUUID != null ? !datasetUUID.equals(that.datasetUUID) :that.datasetUUID != null) return false;
            return true;
    }




}
