package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class GroupRestrictionFluentImpl<A extends GroupRestrictionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GroupRestrictionFluent<A>{

    private List<String> groups;
    private List<LabelSelectorBuilder> labels;

    public GroupRestrictionFluentImpl(){
    }
    public GroupRestrictionFluentImpl(GroupRestriction instance){
            this.withGroups(instance.getGroups()); 
            this.withLabels(instance.getLabels()); 
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

    public A addToLabels(int index,LabelSelector item){
            if (this.labels == null) {this.labels = new ArrayList<LabelSelectorBuilder>();}
            LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.labels.add(index >= 0 ? index : labels.size(), builder); return (A)this;
    }

    public A setToLabels(int index,LabelSelector item){
            if (this.labels == null) {this.labels = new ArrayList<LabelSelectorBuilder>();}
            LabelSelectorBuilder builder = new LabelSelectorBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= labels.size()) { labels.add(builder); } else { labels.set(index, builder);}
             return (A)this;
    }

    public A addToLabels(LabelSelector... items){
            if (this.labels == null) {this.labels = new ArrayList<LabelSelectorBuilder>();}
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(builder);this.labels.add(builder);} return (A)this;
    }

    public A addAllToLabels(Collection<LabelSelector> items){
            if (this.labels == null) {this.labels = new ArrayList<LabelSelectorBuilder>();}
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.add(builder);this.labels.add(builder);} return (A)this;
    }

    public A removeFromLabels(LabelSelector... items){
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.remove(builder);if (this.labels != null) {this.labels.remove(builder);}} return (A)this;
    }

    public A removeAllFromLabels(Collection<LabelSelector> items){
            for (LabelSelector item : items) {LabelSelectorBuilder builder = new LabelSelectorBuilder(item);_visitables.remove(builder);if (this.labels != null) {this.labels.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildLabels instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelector> getLabels(){
            return build(labels);
    }

    public List<LabelSelector> buildLabels(){
            return build(labels);
    }

    public LabelSelector buildLabel(int index){
            return this.labels.get(index).build();
    }

    public LabelSelector buildFirstLabel(){
            return this.labels.get(0).build();
    }

    public LabelSelector buildLastLabel(){
            return this.labels.get(labels.size() - 1).build();
    }

    public LabelSelector buildMatchingLabel(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate){
            for (LabelSelectorBuilder item: labels) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withLabels(List<LabelSelector> labels){
            if (this.labels != null) { _visitables.removeAll(this.labels);}
            if (labels != null) {this.labels = new ArrayList<LabelSelectorBuilder>(); for (LabelSelector item : labels){this.addToLabels(item);}} else { this.labels = new ArrayList<LabelSelectorBuilder>();} return (A) this;
    }

    public A withLabels(LabelSelector... labels){
            if (this.labels != null) {this.labels.clear();}
            if (labels != null) {for (LabelSelector item :labels){ this.addToLabels(item);}} return (A) this;
    }

    public Boolean hasLabels(){
            return labels != null && !labels.isEmpty();
    }

    public GroupRestrictionFluent.LabelsNested<A> addNewLabel(){
            return new LabelsNestedImpl();
    }

    public GroupRestrictionFluent.LabelsNested<A> addNewLabelLike(LabelSelector item){
            return new LabelsNestedImpl(-1, item);
    }

    public GroupRestrictionFluent.LabelsNested<A> setNewLabelLike(int index,LabelSelector item){
            return new LabelsNestedImpl(index, item);
    }

    public GroupRestrictionFluent.LabelsNested<A> editLabel(int index){
            if (labels.size() <= index) throw new RuntimeException("Can't edit labels. Index exceeds size.");
            return setNewLabelLike(index, buildLabel(index));
    }

    public GroupRestrictionFluent.LabelsNested<A> editFirstLabel(){
            if (labels.size() == 0) throw new RuntimeException("Can't edit first labels. The list is empty.");
            return setNewLabelLike(0, buildLabel(0));
    }

    public GroupRestrictionFluent.LabelsNested<A> editLastLabel(){
            int index = labels.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last labels. The list is empty.");
            return setNewLabelLike(index, buildLabel(index));
    }

    public GroupRestrictionFluent.LabelsNested<A> editMatchingLabel(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorBuilder> predicate){
            int index = -1;
            for (int i=0;i<labels.size();i++) { 
            if (predicate.apply(labels.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching labels. No match found.");
            return setNewLabelLike(index, buildLabel(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupRestrictionFluentImpl that = (GroupRestrictionFluentImpl) o;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (labels != null ? !labels.equals(that.labels) :that.labels != null) return false;
            return true;
    }


    public class LabelsNestedImpl<N> extends LabelSelectorFluentImpl<GroupRestrictionFluent.LabelsNested<N>> implements GroupRestrictionFluent.LabelsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
        private final int index;
    
            LabelsNestedImpl(int index,LabelSelector item){
                    this.index = index;
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            LabelsNestedImpl(){
                    this.index = -1;
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) GroupRestrictionFluentImpl.this.setToLabels(index, builder.build());
    }
    public N endLabel(){
            return and();
    }

}


}
