// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


// realsense device public interface
@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_device extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_device(Pointer p) { super(p); }

    public native @Const @ByRef rs_stream_interface get_stream_interface(@Cast("rs_stream") int stream);

    public native @Cast("const char*") BytePointer get_name();
    public native @Cast("const char*") BytePointer get_serial();
    public native @Cast("const char*") BytePointer get_firmware_version();
    public native @Cast("const char*") BytePointer get_camera_info(@Cast("rs_camera_info") int arg0);
    public native float get_depth_scale();
                                            
    public native void enable_stream(@Cast("rs_stream") int stream, int width, int height, @Cast("rs_format") int format, int fps, @Cast("rs_output_buffer_format") int output);
    public native void enable_stream_preset(@Cast("rs_stream") int stream, @Cast("rs_preset") int preset);
    public native void disable_stream(@Cast("rs_stream") int stream);
                                            
    public native void enable_motion_tracking();
    public static class On_frame_rs_device_rs_frame_ref_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    On_frame_rs_device_rs_frame_ref_Pointer(Pointer p) { super(p); }
        protected On_frame_rs_device_rs_frame_ref_Pointer() { allocate(); }
        private native void allocate();
        public native void call(rs_device device, rs_frame_ref frame, Pointer user);
    }
    public native void set_stream_callback(@Cast("rs_stream") int stream, On_frame_rs_device_rs_frame_ref_Pointer on_frame, Pointer user);
    public native void set_stream_callback(@Cast("rs_stream") int stream, rs_frame_callback callback);
    public native void disable_motion_tracking();

    public native @ByVal rs_motion_intrinsics get_motion_intrinsics();
    public native @ByVal rs_extrinsics get_motion_extrinsics_from(@Cast("rs_stream") int from);
    public static class On_event_rs_device_rs_motion_data_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    On_event_rs_device_rs_motion_data_Pointer(Pointer p) { super(p); }
        protected On_event_rs_device_rs_motion_data_Pointer() { allocate(); }
        private native void allocate();
        public native void call(rs_device device, @ByVal rs_motion_data data, Pointer user);
    }
    public native void set_motion_callback(On_event_rs_device_rs_motion_data_Pointer on_event, Pointer user);
    public native void set_motion_callback(rs_motion_callback callback);
    public static class On_event_rs_device_rs_timestamp_data_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    On_event_rs_device_rs_timestamp_data_Pointer(Pointer p) { super(p); }
        protected On_event_rs_device_rs_timestamp_data_Pointer() { allocate(); }
        private native void allocate();
        public native void call(rs_device device, @ByVal rs_timestamp_data data, Pointer user);
    }
    public native void set_timestamp_callback(On_event_rs_device_rs_timestamp_data_Pointer on_event, Pointer user);
    public native void set_timestamp_callback(rs_timestamp_callback callback);
                                            
    public native void start(@Cast("rs_source") int source);
    public native void stop(@Cast("rs_source") int source);

    public native void start_fw_logger(@Cast("char") byte fw_log_op_code, int grab_rate_in_ms, @Cast("std::timed_mutex*") @ByRef Pointer mutex);
    public native void stop_fw_logger();

    public native @Cast("bool") boolean is_capturing();
    public native int is_motion_tracking_active();
                                            
    public native void wait_all_streams();
    public native @Cast("bool") boolean poll_all_streams();
                                            
    public native @Cast("bool") boolean supports(@Cast("rs_capabilities") int capability);

    public native @Cast("bool") boolean supports_option(@Cast("rs_option") int option);
    public native void get_option_range(@Cast("rs_option") int option, @ByRef DoublePointer min, @ByRef DoublePointer max, @ByRef DoublePointer step, @ByRef DoublePointer def);
    public native void get_option_range(@Cast("rs_option") int option, @ByRef DoubleBuffer min, @ByRef DoubleBuffer max, @ByRef DoubleBuffer step, @ByRef DoubleBuffer def);
    public native void get_option_range(@Cast("rs_option") int option, @ByRef double[] min, @ByRef double[] max, @ByRef double[] step, @ByRef double[] def);
    public native void set_options(@Cast("const rs_option*") IntPointer options, @Cast("size_t") long count, @Const DoublePointer values);
    public native void set_options(@Cast("const rs_option*") IntBuffer options, @Cast("size_t") long count, @Const DoubleBuffer values);
    public native void set_options(@Cast("const rs_option*") int[] options, @Cast("size_t") long count, @Const double[] values);
    public native void get_options(@Cast("const rs_option*") IntPointer options, @Cast("size_t") long count, DoublePointer values);
    public native void get_options(@Cast("const rs_option*") IntBuffer options, @Cast("size_t") long count, DoubleBuffer values);
    public native void get_options(@Cast("const rs_option*") int[] options, @Cast("size_t") long count, double[] values);
    public native @Cast("const char*") BytePointer get_option_description(@Cast("rs_option") int option);

    public native void release_frame(rs_frame_ref ref);
    public native rs_frame_ref clone_frame(rs_frame_ref frame);

    public native @Cast("const char*") BytePointer get_usb_port_id();
}
