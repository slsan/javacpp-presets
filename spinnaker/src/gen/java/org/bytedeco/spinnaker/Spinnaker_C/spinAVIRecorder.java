// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* Handle for video recording functionality. Created by calling
* spinVideoOpenUncompressed(), spinVideoOpenMJPG(), and
* spinVideoOpenH264(), which require a call to
* spinVideoClose() to destroy.
*
* Note: spinAVIRecorder is deprecated, use spinVideo instead.
*/
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinAVIRecorder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinAVIRecorder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinAVIRecorder(Pointer p) { super(p); }
}
