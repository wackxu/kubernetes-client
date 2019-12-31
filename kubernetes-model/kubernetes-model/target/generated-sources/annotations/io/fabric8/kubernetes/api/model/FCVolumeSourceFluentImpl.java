package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class FCVolumeSourceFluentImpl<A extends FCVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements FCVolumeSourceFluent<A>{

    private String fsType;
    private Integer lun;
    private Boolean readOnly;
    private List<String> targetWWNs;
    private List<String> wwids;

    public FCVolumeSourceFluentImpl(){
    }
    public FCVolumeSourceFluentImpl(FCVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withLun(instance.getLun()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withTargetWWNs(instance.getTargetWWNs()); 
            this.withWwids(instance.getWwids()); 
    }

    public String getFsType(){
            return this.fsType;
    }

    public A withFsType(String fsType){
            this.fsType=fsType; return (A) this;
    }

    public Boolean hasFsType(){
            return this.fsType != null;
    }

    public Integer getLun(){
            return this.lun;
    }

    public A withLun(Integer lun){
            this.lun=lun; return (A) this;
    }

    public Boolean hasLun(){
            return this.lun != null;
    }

    public Boolean isReadOnly(){
            return this.readOnly;
    }

    public A withReadOnly(Boolean readOnly){
            this.readOnly=readOnly; return (A) this;
    }

    public Boolean hasReadOnly(){
            return this.readOnly != null;
    }

    public A withNewReadOnly(String arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A withNewReadOnly(boolean arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A addToTargetWWNs(int index,String item){
            if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
            this.targetWWNs.add(index, item);
            return (A)this;
    }

    public A setToTargetWWNs(int index,String item){
            if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
            this.targetWWNs.set(index, item); return (A)this;
    }

    public A addToTargetWWNs(String... items){
            if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
            for (String item : items) {this.targetWWNs.add(item);} return (A)this;
    }

    public A addAllToTargetWWNs(Collection<String> items){
            if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
            for (String item : items) {this.targetWWNs.add(item);} return (A)this;
    }

    public A removeFromTargetWWNs(String... items){
            for (String item : items) {if (this.targetWWNs!= null){ this.targetWWNs.remove(item);}} return (A)this;
    }

    public A removeAllFromTargetWWNs(Collection<String> items){
            for (String item : items) {if (this.targetWWNs!= null){ this.targetWWNs.remove(item);}} return (A)this;
    }

    public List<String> getTargetWWNs(){
            return this.targetWWNs;
    }

    public String getTargetWWN(int index){
            return this.targetWWNs.get(index);
    }

    public String getFirstTargetWWN(){
            return this.targetWWNs.get(0);
    }

    public String getLastTargetWWN(){
            return this.targetWWNs.get(targetWWNs.size() - 1);
    }

    public String getMatchingTargetWWN(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: targetWWNs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withTargetWWNs(List<String> targetWWNs){
            if (this.targetWWNs != null) { _visitables.removeAll(this.targetWWNs);}
            if (targetWWNs != null) {this.targetWWNs = new ArrayList<String>(); for (String item : targetWWNs){this.addToTargetWWNs(item);}} else { this.targetWWNs = new ArrayList<String>();} return (A) this;
    }

    public A withTargetWWNs(String... targetWWNs){
            if (this.targetWWNs != null) {this.targetWWNs.clear();}
            if (targetWWNs != null) {for (String item :targetWWNs){ this.addToTargetWWNs(item);}} return (A) this;
    }

    public Boolean hasTargetWWNs(){
            return targetWWNs != null && !targetWWNs.isEmpty();
    }

    public A addToWwids(int index,String item){
            if (this.wwids == null) {this.wwids = new ArrayList<String>();}
            this.wwids.add(index, item);
            return (A)this;
    }

    public A setToWwids(int index,String item){
            if (this.wwids == null) {this.wwids = new ArrayList<String>();}
            this.wwids.set(index, item); return (A)this;
    }

    public A addToWwids(String... items){
            if (this.wwids == null) {this.wwids = new ArrayList<String>();}
            for (String item : items) {this.wwids.add(item);} return (A)this;
    }

    public A addAllToWwids(Collection<String> items){
            if (this.wwids == null) {this.wwids = new ArrayList<String>();}
            for (String item : items) {this.wwids.add(item);} return (A)this;
    }

    public A removeFromWwids(String... items){
            for (String item : items) {if (this.wwids!= null){ this.wwids.remove(item);}} return (A)this;
    }

    public A removeAllFromWwids(Collection<String> items){
            for (String item : items) {if (this.wwids!= null){ this.wwids.remove(item);}} return (A)this;
    }

    public List<String> getWwids(){
            return this.wwids;
    }

    public String getWwid(int index){
            return this.wwids.get(index);
    }

    public String getFirstWwid(){
            return this.wwids.get(0);
    }

    public String getLastWwid(){
            return this.wwids.get(wwids.size() - 1);
    }

    public String getMatchingWwid(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: wwids) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withWwids(List<String> wwids){
            if (this.wwids != null) { _visitables.removeAll(this.wwids);}
            if (wwids != null) {this.wwids = new ArrayList<String>(); for (String item : wwids){this.addToWwids(item);}} else { this.wwids = new ArrayList<String>();} return (A) this;
    }

    public A withWwids(String... wwids){
            if (this.wwids != null) {this.wwids.clear();}
            if (wwids != null) {for (String item :wwids){ this.addToWwids(item);}} return (A) this;
    }

    public Boolean hasWwids(){
            return wwids != null && !wwids.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FCVolumeSourceFluentImpl that = (FCVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (lun != null ? !lun.equals(that.lun) :that.lun != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (targetWWNs != null ? !targetWWNs.equals(that.targetWWNs) :that.targetWWNs != null) return false;
            if (wwids != null ? !wwids.equals(that.wwids) :that.wwids != null) return false;
            return true;
    }




}
