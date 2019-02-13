// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* Handle for interface event functionality. Created by calling
* spinInterfaceEventCreate(), which requires a call to
* spinInterfaceEventDestroy() to destroy.
*/
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinInterfaceEvent extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinInterfaceEvent() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinInterfaceEvent(Pointer p) { super(p); }
}
