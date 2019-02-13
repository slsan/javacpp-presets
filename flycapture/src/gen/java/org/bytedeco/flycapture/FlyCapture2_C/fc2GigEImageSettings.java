// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Image settings for a GigE camera. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GigEImageSettings extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2GigEImageSettings() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2GigEImageSettings(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GigEImageSettings(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2GigEImageSettings position(long position) {
            return (fc2GigEImageSettings)super.position(position);
        }
    
        /** Horizontal image offset. */
        public native @Cast("unsigned int") int offsetX(); public native fc2GigEImageSettings offsetX(int offsetX);
        /** Vertical image offset. */
        public native @Cast("unsigned int") int offsetY(); public native fc2GigEImageSettings offsetY(int offsetY);
        /** Width of image. */
        public native @Cast("unsigned int") int width(); public native fc2GigEImageSettings width(int width);
        /** Height of image. */
        public native @Cast("unsigned int") int height(); public native fc2GigEImageSettings height(int height);
        /** Pixel format of image. */
        public native @Cast("fc2PixelFormat") int pixelFormat(); public native fc2GigEImageSettings pixelFormat(int pixelFormat);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2GigEImageSettings reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    }
