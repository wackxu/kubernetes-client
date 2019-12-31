package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class RunAsUserStrategyOptionsFluentImpl<A extends RunAsUserStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RunAsUserStrategyOptionsFluent<A>{

    private String type;
    private Long uid;
    private Long uidRangeMax;
    private Long uidRangeMin;

    public RunAsUserStrategyOptionsFluentImpl(){
    }
    public RunAsUserStrategyOptionsFluentImpl(RunAsUserStrategyOptions instance){
            this.withType(instance.getType()); 
            this.withUid(instance.getUid()); 
            this.withUidRangeMax(instance.getUidRangeMax()); 
            this.withUidRangeMin(instance.getUidRangeMin()); 
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

    public Long getUid(){
            return this.uid;
    }

    public A withUid(Long uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public A withNewUid(String arg1){
            return (A)withUid(new Long(arg1));
    }

    public A withNewUid(long arg1){
            return (A)withUid(new Long(arg1));
    }

    public Long getUidRangeMax(){
            return this.uidRangeMax;
    }

    public A withUidRangeMax(Long uidRangeMax){
            this.uidRangeMax=uidRangeMax; return (A) this;
    }

    public Boolean hasUidRangeMax(){
            return this.uidRangeMax != null;
    }

    public A withNewUidRangeMax(String arg1){
            return (A)withUidRangeMax(new Long(arg1));
    }

    public A withNewUidRangeMax(long arg1){
            return (A)withUidRangeMax(new Long(arg1));
    }

    public Long getUidRangeMin(){
            return this.uidRangeMin;
    }

    public A withUidRangeMin(Long uidRangeMin){
            this.uidRangeMin=uidRangeMin; return (A) this;
    }

    public Boolean hasUidRangeMin(){
            return this.uidRangeMin != null;
    }

    public A withNewUidRangeMin(String arg1){
            return (A)withUidRangeMin(new Long(arg1));
    }

    public A withNewUidRangeMin(long arg1){
            return (A)withUidRangeMin(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RunAsUserStrategyOptionsFluentImpl that = (RunAsUserStrategyOptionsFluentImpl) o;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            if (uidRangeMax != null ? !uidRangeMax.equals(that.uidRangeMax) :that.uidRangeMax != null) return false;
            if (uidRangeMin != null ? !uidRangeMin.equals(that.uidRangeMin) :that.uidRangeMin != null) return false;
            return true;
    }




}
