package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GroupVersionKindFluentImpl<A extends GroupVersionKindFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GroupVersionKindFluent<A>{

    private String group;
    private String kind;
    private String version;

    public GroupVersionKindFluentImpl(){
    }
    public GroupVersionKindFluentImpl(GroupVersionKind instance){
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withVersion(instance.getVersion()); 
    }

    public String getGroup(){
            return this.group;
    }

    public A withGroup(String group){
            this.group=group; return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public String getVersion(){
            return this.version;
    }

    public A withVersion(String version){
            this.version=version; return (A) this;
    }

    public Boolean hasVersion(){
            return this.version != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupVersionKindFluentImpl that = (GroupVersionKindFluentImpl) o;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (version != null ? !version.equals(that.version) :that.version != null) return false;
            return true;
    }




}
