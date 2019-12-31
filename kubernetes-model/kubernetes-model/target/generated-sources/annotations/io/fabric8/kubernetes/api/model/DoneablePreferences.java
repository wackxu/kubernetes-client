package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePreferences extends PreferencesFluentImpl<DoneablePreferences> implements Doneable<Preferences>{

    private final PreferencesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Preferences,Preferences> function;

    public DoneablePreferences(io.fabric8.kubernetes.api.builder.Function<Preferences,Preferences> function){
            super();this.builder=new PreferencesBuilder(this);this.function=function;
    }
    public DoneablePreferences(Preferences item,io.fabric8.kubernetes.api.builder.Function<Preferences,Preferences> function){
            super(item);this.builder=new PreferencesBuilder(this, item);this.function=function;
    }
    public DoneablePreferences(Preferences item){
            super(item);this.builder=new PreferencesBuilder(this, item);this.function=new Function<Preferences, Preferences>() {
    public Preferences apply(Preferences item) {
        return item;
    }
}
;
    }

    public Preferences done(){
             return function.apply(builder.build());
    }




}
