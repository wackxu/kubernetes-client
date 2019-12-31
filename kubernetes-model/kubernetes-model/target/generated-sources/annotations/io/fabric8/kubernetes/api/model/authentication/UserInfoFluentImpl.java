package io.fabric8.kubernetes.api.model.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class UserInfoFluentImpl<A extends UserInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements UserInfoFluent<A>{

    private Map<String,ArrayList<String>> extra;
    private List<String> groups;
    private String uid;
    private String username;

    public UserInfoFluentImpl(){
    }
    public UserInfoFluentImpl(UserInfo instance){
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withUid(instance.getUid()); 
            this.withUsername(instance.getUsername()); 
    }

    public A addToExtra(String key,ArrayList<String> value){
            if(this.extra == null && key != null && value != null) { this.extra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
    }

    public A addToExtra(Map<String,ArrayList<String>> map){
            if(this.extra == null && map != null) { this.extra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(map != null) { this.extra.putAll(map);} return (A)this;
    }

    public A removeFromExtra(String key){
            if(this.extra == null) { return (A) this; }
            if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
    }

    public A removeFromExtra(Map<String,ArrayList<String>> map){
            if(this.extra == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
    }

    public Map<String,ArrayList<String>> getExtra(){
            return this.extra;
    }

    public A withExtra(Map<String,ArrayList<String>> extra){
            if (extra == null) { this.extra =  new LinkedHashMap<String,ArrayList<String>>();} else {this.extra = new LinkedHashMap<String,ArrayList<String>>(extra);} return (A) this;
    }

    public Boolean hasExtra(){
            return this.extra != null;
    }

    public A addToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.add(index, item);
            return (A)this;
    }

    public A setToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.set(index, item); return (A)this;
    }

    public A addToGroups(String... items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A addAllToGroups(Collection<String> items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A removeFromGroups(String... items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public A removeAllFromGroups(Collection<String> items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public List<String> getGroups(){
            return this.groups;
    }

    public String getGroup(int index){
            return this.groups.get(index);
    }

    public String getFirstGroup(){
            return this.groups.get(0);
    }

    public String getLastGroup(){
            return this.groups.get(groups.size() - 1);
    }

    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: groups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withGroups(List<String> groups){
            if (this.groups != null) { _visitables.removeAll(this.groups);}
            if (groups != null) {this.groups = new ArrayList<String>(); for (String item : groups){this.addToGroups(item);}} else { this.groups = new ArrayList<String>();} return (A) this;
    }

    public A withGroups(String... groups){
            if (this.groups != null) {this.groups.clear();}
            if (groups != null) {for (String item :groups){ this.addToGroups(item);}} return (A) this;
    }

    public Boolean hasGroups(){
            return groups != null && !groups.isEmpty();
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

    public String getUsername(){
            return this.username;
    }

    public A withUsername(String username){
            this.username=username; return (A) this;
    }

    public Boolean hasUsername(){
            return this.username != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserInfoFluentImpl that = (UserInfoFluentImpl) o;
            if (extra != null ? !extra.equals(that.extra) :that.extra != null) return false;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            if (username != null ? !username.equals(that.username) :that.username != null) return false;
            return true;
    }




}
