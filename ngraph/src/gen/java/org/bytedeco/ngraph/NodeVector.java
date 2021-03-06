// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /** \brief Zero or more nodes. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeVector extends NgraphNodeVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NodeVector(Pointer p) { super(p); }
    

        public NodeVector(@Const @ByRef NgraphNodeVector nodes) { super((Pointer)null); allocate(nodes); }
        private native void allocate(@Const @ByRef NgraphNodeVector nodes);

        public NodeVector(@Const @ByRef NodeVector nodes) { super((Pointer)null); allocate(nodes); }
        private native void allocate(@Const @ByRef NodeVector nodes);

        public NodeVector(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
        private native void allocate(@Cast("size_t") long size);

        public native @ByRef @Name("operator =") NodeVector put(@Const @ByRef NodeVector other);

        public NodeVector() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
