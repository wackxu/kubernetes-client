package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;

public class PatchFluentImpl<A extends PatchFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PatchFluent<A>{


    public PatchFluentImpl(){
    }
    public PatchFluentImpl(Patch instance){
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PatchFluentImpl that = (PatchFluentImpl) o;
            return true;
    }




}
