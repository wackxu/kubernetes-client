package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GroupVersionResourceFluentImpl<A extends GroupVersionResourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GroupVersionResourceFluent<A>{

    private String group;
    private String resource;
    private String version;

    public GroupVersionResourceFluentImpl(){
    }
    public GroupVersionResourceFluentImpl(GroupVersionResource instance){
            this.withGroup(instance.getGroup()); 
            this.withResource(instance.getResource()); 
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

    public String getResource(){
            return this.resource;
    }

    public A withResource(String resource){
            this.resource=resource; return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
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
            GroupVersionResourceFluentImpl that = (GroupVersionResourceFluentImpl) o;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (version != null ? !version.equals(that.version) :that.version != null) return false;
            return true;
    }




}
