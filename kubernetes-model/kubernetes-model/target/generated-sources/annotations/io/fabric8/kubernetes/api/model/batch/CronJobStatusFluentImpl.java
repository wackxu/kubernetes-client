package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class CronJobStatusFluentImpl<A extends CronJobStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CronJobStatusFluent<A>{

    private List<ObjectReferenceBuilder> active;
    private String lastScheduleTime;

    public CronJobStatusFluentImpl(){
    }
    public CronJobStatusFluentImpl(CronJobStatus instance){
            this.withActive(instance.getActive()); 
            this.withLastScheduleTime(instance.getLastScheduleTime()); 
    }

    public A addToActive(int index,ObjectReference item){
            if (this.active == null) {this.active = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.active.add(index >= 0 ? index : active.size(), builder); return (A)this;
    }

    public A setToActive(int index,ObjectReference item){
            if (this.active == null) {this.active = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= active.size()) { active.add(builder); } else { active.set(index, builder);}
             return (A)this;
    }

    public A addToActive(ObjectReference... items){
            if (this.active == null) {this.active = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.active.add(builder);} return (A)this;
    }

    public A addAllToActive(Collection<ObjectReference> items){
            if (this.active == null) {this.active = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.active.add(builder);} return (A)this;
    }

    public A removeFromActive(ObjectReference... items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
    }

    public A removeAllFromActive(Collection<ObjectReference> items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildActive instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getActive(){
            return build(active);
    }

    public List<ObjectReference> buildActive(){
            return build(active);
    }

    public ObjectReference buildActive(int index){
            return this.active.get(index).build();
    }

    public ObjectReference buildFirstActive(){
            return this.active.get(0).build();
    }

    public ObjectReference buildLastActive(){
            return this.active.get(active.size() - 1).build();
    }

    public ObjectReference buildMatchingActive(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            for (ObjectReferenceBuilder item: active) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withActive(List<ObjectReference> active){
            if (this.active != null) { _visitables.removeAll(this.active);}
            if (active != null) {this.active = new ArrayList<ObjectReferenceBuilder>(); for (ObjectReference item : active){this.addToActive(item);}} else { this.active = new ArrayList<ObjectReferenceBuilder>();} return (A) this;
    }

    public A withActive(ObjectReference... active){
            if (this.active != null) {this.active.clear();}
            if (active != null) {for (ObjectReference item :active){ this.addToActive(item);}} return (A) this;
    }

    public Boolean hasActive(){
            return active != null && !active.isEmpty();
    }

    public CronJobStatusFluent.ActiveNested<A> addNewActive(){
            return new ActiveNestedImpl();
    }

    public CronJobStatusFluent.ActiveNested<A> addNewActiveLike(ObjectReference item){
            return new ActiveNestedImpl(-1, item);
    }

    public CronJobStatusFluent.ActiveNested<A> setNewActiveLike(int index,ObjectReference item){
            return new ActiveNestedImpl(index, item);
    }

    public CronJobStatusFluent.ActiveNested<A> editActive(int index){
            if (active.size() <= index) throw new RuntimeException("Can't edit active. Index exceeds size.");
            return setNewActiveLike(index, buildActive(index));
    }

    public CronJobStatusFluent.ActiveNested<A> editFirstActive(){
            if (active.size() == 0) throw new RuntimeException("Can't edit first active. The list is empty.");
            return setNewActiveLike(0, buildActive(0));
    }

    public CronJobStatusFluent.ActiveNested<A> editLastActive(){
            int index = active.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last active. The list is empty.");
            return setNewActiveLike(index, buildActive(index));
    }

    public CronJobStatusFluent.ActiveNested<A> editMatchingActive(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<active.size();i++) { 
            if (predicate.apply(active.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching active. No match found.");
            return setNewActiveLike(index, buildActive(index));
    }

    public String getLastScheduleTime(){
            return this.lastScheduleTime;
    }

    public A withLastScheduleTime(String lastScheduleTime){
            this.lastScheduleTime=lastScheduleTime; return (A) this;
    }

    public Boolean hasLastScheduleTime(){
            return this.lastScheduleTime != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobStatusFluentImpl that = (CronJobStatusFluentImpl) o;
            if (active != null ? !active.equals(that.active) :that.active != null) return false;
            if (lastScheduleTime != null ? !lastScheduleTime.equals(that.lastScheduleTime) :that.lastScheduleTime != null) return false;
            return true;
    }


    public class ActiveNestedImpl<N> extends ObjectReferenceFluentImpl<CronJobStatusFluent.ActiveNested<N>> implements CronJobStatusFluent.ActiveNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
        private final int index;
    
            ActiveNestedImpl(int index,ObjectReference item){
                    this.index = index;
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ActiveNestedImpl(){
                    this.index = -1;
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CronJobStatusFluentImpl.this.setToActive(index, builder.build());
    }
    public N endActive(){
            return and();
    }

}


}
