package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ListMetaFluentImpl<A extends ListMetaFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ListMetaFluent<A>{

    private String _continue;
    private String resourceVersion;
    private String selfLink;

    public ListMetaFluentImpl(){
    }
    public ListMetaFluentImpl(ListMeta instance){
            this.withContinue(instance.getContinue()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
    }

    public String getContinue(){
            return this._continue;
    }

    public A withContinue(String _continue){
            this._continue=_continue; return (A) this;
    }

    public Boolean hasContinue(){
            return this._continue != null;
    }

    public String getResourceVersion(){
            return this.resourceVersion;
    }

    public A withResourceVersion(String resourceVersion){
            this.resourceVersion=resourceVersion; return (A) this;
    }

    public Boolean hasResourceVersion(){
            return this.resourceVersion != null;
    }

    public String getSelfLink(){
            return this.selfLink;
    }

    public A withSelfLink(String selfLink){
            this.selfLink=selfLink; return (A) this;
    }

    public Boolean hasSelfLink(){
            return this.selfLink != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ListMetaFluentImpl that = (ListMetaFluentImpl) o;
            if (_continue != null ? !_continue.equals(that._continue) :that._continue != null) return false;
            if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
            if (selfLink != null ? !selfLink.equals(that.selfLink) :that.selfLink != null) return false;
            return true;
    }




}
