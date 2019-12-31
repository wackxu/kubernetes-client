package io.fabric8.kubernetes.api.model.storage;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStorageClass extends StorageClassFluentImpl<DoneableStorageClass> implements Doneable<StorageClass>{

    private final StorageClassBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StorageClass,StorageClass> function;

    public DoneableStorageClass(io.fabric8.kubernetes.api.builder.Function<StorageClass,StorageClass> function){
            super();this.builder=new StorageClassBuilder(this);this.function=function;
    }
    public DoneableStorageClass(StorageClass item,io.fabric8.kubernetes.api.builder.Function<StorageClass,StorageClass> function){
            super(item);this.builder=new StorageClassBuilder(this, item);this.function=function;
    }
    public DoneableStorageClass(StorageClass item){
            super(item);this.builder=new StorageClassBuilder(this, item);this.function=new Function<StorageClass, StorageClass>() {
    public StorageClass apply(StorageClass item) {
        return item;
    }
}
;
    }

    public StorageClass done(){
             return function.apply(builder.build());
    }




}
