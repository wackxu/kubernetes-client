package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class NodeAddressFluentImpl<A extends NodeAddressFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeAddressFluent<A>{

    private String address;
    private String type;

    public NodeAddressFluentImpl(){
    }
    public NodeAddressFluentImpl(NodeAddress instance){
            this.withAddress(instance.getAddress()); 
            this.withType(instance.getType()); 
    }

    public String getAddress(){
            return this.address;
    }

    public A withAddress(String address){
            this.address=address; return (A) this;
    }

    public Boolean hasAddress(){
            return this.address != null;
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
            NodeAddressFluentImpl that = (NodeAddressFluentImpl) o;
            if (address != null ? !address.equals(that.address) :that.address != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
