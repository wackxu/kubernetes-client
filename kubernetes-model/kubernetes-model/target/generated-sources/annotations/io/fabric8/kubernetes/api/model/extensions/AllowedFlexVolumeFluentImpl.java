package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class AllowedFlexVolumeFluentImpl<A extends AllowedFlexVolumeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AllowedFlexVolumeFluent<A>{

    private String driver;

    public AllowedFlexVolumeFluentImpl(){
    }
    public AllowedFlexVolumeFluentImpl(AllowedFlexVolume instance){
            this.withDriver(instance.getDriver()); 
    }

    public String getDriver(){
            return this.driver;
    }

    public A withDriver(String driver){
            this.driver=driver; return (A) this;
    }

    public Boolean hasDriver(){
            return this.driver != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AllowedFlexVolumeFluentImpl that = (AllowedFlexVolumeFluentImpl) o;
            if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
            return true;
    }




}
