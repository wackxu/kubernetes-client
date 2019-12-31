package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import javax.validation.constraints.NotNull;

public class OwnerReferenceFluentImpl<A extends OwnerReferenceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OwnerReferenceFluent<A>{

    private String apiVersion;
    private Boolean blockOwnerDeletion;
    private Boolean controller;
    private String kind;
    private String name;
    private String uid;

    public OwnerReferenceFluentImpl(){
    }
    public OwnerReferenceFluentImpl(OwnerReference instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion()); 
            this.withController(instance.getController()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withUid(instance.getUid()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public Boolean isBlockOwnerDeletion(){
            return this.blockOwnerDeletion;
    }

    public A withBlockOwnerDeletion(Boolean blockOwnerDeletion){
            this.blockOwnerDeletion=blockOwnerDeletion; return (A) this;
    }

    public Boolean hasBlockOwnerDeletion(){
            return this.blockOwnerDeletion != null;
    }

    public A withNewBlockOwnerDeletion(String arg1){
            return (A)withBlockOwnerDeletion(new Boolean(arg1));
    }

    public A withNewBlockOwnerDeletion(boolean arg1){
            return (A)withBlockOwnerDeletion(new Boolean(arg1));
    }

    public Boolean isController(){
            return this.controller;
    }

    public A withController(Boolean controller){
            this.controller=controller; return (A) this;
    }

    public Boolean hasController(){
            return this.controller != null;
    }

    public A withNewController(String arg1){
            return (A)withController(new Boolean(arg1));
    }

    public A withNewController(boolean arg1){
            return (A)withController(new Boolean(arg1));
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

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OwnerReferenceFluentImpl that = (OwnerReferenceFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (blockOwnerDeletion != null ? !blockOwnerDeletion.equals(that.blockOwnerDeletion) :that.blockOwnerDeletion != null) return false;
            if (controller != null ? !controller.equals(that.controller) :that.controller != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }




}
