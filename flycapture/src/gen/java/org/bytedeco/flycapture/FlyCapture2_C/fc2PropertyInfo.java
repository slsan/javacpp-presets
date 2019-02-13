// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * Information about a specific camera property. This structure is also
     * also used as the TriggerDelayInfo structure.
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2PropertyInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2PropertyInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2PropertyInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2PropertyInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2PropertyInfo position(long position) {
            return (fc2PropertyInfo)super.position(position);
        }
    
        /** Property info type. */
        public native @Cast("fc2PropertyType") int type(); public native fc2PropertyInfo type(int type);
        /** Flag indicating if the property is present. */
        public native @Cast("BOOL") int present(); public native fc2PropertyInfo present(int present);
        /** Flag indicating if auto is supported. */
        public native @Cast("BOOL") int autoSupported(); public native fc2PropertyInfo autoSupported(int autoSupported);
        /** Flag indicating if manual is supported. */
        public native @Cast("BOOL") int manualSupported(); public native fc2PropertyInfo manualSupported(int manualSupported);
        /** Flag indicating if on/off is supported. */
        public native @Cast("BOOL") int onOffSupported(); public native fc2PropertyInfo onOffSupported(int onOffSupported);
        /** Flag indicating if one push is supported. */
        public native @Cast("BOOL") int onePushSupported(); public native fc2PropertyInfo onePushSupported(int onePushSupported);
        /** Flag indicating if absolute mode is supported. */
        public native @Cast("BOOL") int absValSupported(); public native fc2PropertyInfo absValSupported(int absValSupported);
        /** Flag indicating if property value can be read out. */
        public native @Cast("BOOL") int readOutSupported(); public native fc2PropertyInfo readOutSupported(int readOutSupported);
        /** Minimum value (as an integer). */
        public native @Cast("unsigned int") int min(); public native fc2PropertyInfo min(int min);
        /** Maximum value (as an integer). */
        public native @Cast("unsigned int") int max(); public native fc2PropertyInfo max(int max);
        /** Minimum value (as a floating point value). */
        public native float absMin(); public native fc2PropertyInfo absMin(float absMin);
        /** Maximum value (as a floating point value). */
        public native float absMax(); public native fc2PropertyInfo absMax(float absMax);
        /** Textual description of units. */
        public native @Cast("char") byte pUnits(int i); public native fc2PropertyInfo pUnits(int i, byte pUnits);
        @MemberGetter public native @Cast("char*") BytePointer pUnits();
        /** Abbreviated textual description of units. */
        public native @Cast("char") byte pUnitAbbr(int i); public native fc2PropertyInfo pUnitAbbr(int i, byte pUnitAbbr);
        @MemberGetter public native @Cast("char*") BytePointer pUnitAbbr();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2PropertyInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
