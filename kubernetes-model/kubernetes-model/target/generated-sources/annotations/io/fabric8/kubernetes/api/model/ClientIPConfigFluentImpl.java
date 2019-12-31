package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ClientIPConfigFluentImpl<A extends ClientIPConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ClientIPConfigFluent<A>{

    private Integer timeoutSeconds;

    public ClientIPConfigFluentImpl(){
    }
    public ClientIPConfigFluentImpl(ClientIPConfig instance){
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
    }

    public Integer getTimeoutSeconds(){
            return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(Integer timeoutSeconds){
            this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public Boolean hasTimeoutSeconds(){
            return this.timeoutSeconds != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClientIPConfigFluentImpl that = (ClientIPConfigFluentImpl) o;
            if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
            return true;
    }




}
