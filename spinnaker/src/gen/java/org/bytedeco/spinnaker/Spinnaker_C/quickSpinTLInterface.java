// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**	
* \defgroup TLInterfaceC_h TLInterface Structures
* \ingroup CQuickSpin
*/
/*@{*/

@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class quickSpinTLInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public quickSpinTLInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public quickSpinTLInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public quickSpinTLInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public quickSpinTLInterface position(long position) {
        return (quickSpinTLInterface)super.position(position);
    }

	public native @Cast("quickSpinStringNode") spinNodeHandle InterfaceID(); public native quickSpinTLInterface InterfaceID(spinNodeHandle InterfaceID);
	public native @Cast("quickSpinStringNode") spinNodeHandle InterfaceDisplayName(); public native quickSpinTLInterface InterfaceDisplayName(spinNodeHandle InterfaceDisplayName);
	public native @Cast("quickSpinStringNode") spinNodeHandle InterfaceType(); public native quickSpinTLInterface InterfaceType(spinNodeHandle InterfaceType);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceGateway(); public native quickSpinTLInterface GevInterfaceGateway(spinNodeHandle GevInterfaceGateway);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceMACAddress(); public native quickSpinTLInterface GevInterfaceMACAddress(spinNodeHandle GevInterfaceMACAddress);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceIPAddress(); public native quickSpinTLInterface GevInterfaceIPAddress(spinNodeHandle GevInterfaceIPAddress);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceSubnetMask(); public native quickSpinTLInterface GevInterfaceSubnetMask(spinNodeHandle GevInterfaceSubnetMask);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle POEStatus(); public native quickSpinTLInterface POEStatus(spinNodeHandle POEStatus);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle FilterDriverStatus(); public native quickSpinTLInterface FilterDriverStatus(spinNodeHandle FilterDriverStatus);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionDeviceKey(); public native quickSpinTLInterface GevActionDeviceKey(spinNodeHandle GevActionDeviceKey);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionGroupKey(); public native quickSpinTLInterface GevActionGroupKey(spinNodeHandle GevActionGroupKey);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionGroupMask(); public native quickSpinTLInterface GevActionGroupMask(spinNodeHandle GevActionGroupMask);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionTime(); public native quickSpinTLInterface GevActionTime(spinNodeHandle GevActionTime);
	public native @Cast("quickSpinCommandNode") spinNodeHandle ActionCommand(); public native quickSpinTLInterface ActionCommand(spinNodeHandle ActionCommand);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceUnlock(); public native quickSpinTLInterface DeviceUnlock(spinNodeHandle DeviceUnlock);
	public native @Cast("quickSpinCommandNode") spinNodeHandle DeviceUpdateList(); public native quickSpinTLInterface DeviceUpdateList(spinNodeHandle DeviceUpdateList);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle DeviceCount(); public native quickSpinTLInterface DeviceCount(spinNodeHandle DeviceCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle DeviceSelector(); public native quickSpinTLInterface DeviceSelector(spinNodeHandle DeviceSelector);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceID(); public native quickSpinTLInterface DeviceID(spinNodeHandle DeviceID);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceVendorName(); public native quickSpinTLInterface DeviceVendorName(spinNodeHandle DeviceVendorName);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceModelName(); public native quickSpinTLInterface DeviceModelName(spinNodeHandle DeviceModelName);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle DeviceAccessStatus(); public native quickSpinTLInterface DeviceAccessStatus(spinNodeHandle DeviceAccessStatus);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceIPAddress(); public native quickSpinTLInterface GevDeviceIPAddress(spinNodeHandle GevDeviceIPAddress);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceSubnetMask(); public native quickSpinTLInterface GevDeviceSubnetMask(spinNodeHandle GevDeviceSubnetMask);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceMACAddress(); public native quickSpinTLInterface GevDeviceMACAddress(spinNodeHandle GevDeviceMACAddress);
	public native @Cast("quickSpinCommandNode") spinNodeHandle AutoForceIP(); public native quickSpinTLInterface AutoForceIP(spinNodeHandle AutoForceIP);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleDeviceCount(); public native quickSpinTLInterface IncompatibleDeviceCount(spinNodeHandle IncompatibleDeviceCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleDeviceSelector(); public native quickSpinTLInterface IncompatibleDeviceSelector(spinNodeHandle IncompatibleDeviceSelector);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceID(); public native quickSpinTLInterface IncompatibleDeviceID(spinNodeHandle IncompatibleDeviceID);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceVendorName(); public native quickSpinTLInterface IncompatibleDeviceVendorName(spinNodeHandle IncompatibleDeviceVendorName);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceModelName(); public native quickSpinTLInterface IncompatibleDeviceModelName(spinNodeHandle IncompatibleDeviceModelName);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceIPAddress(); public native quickSpinTLInterface IncompatibleGevDeviceIPAddress(spinNodeHandle IncompatibleGevDeviceIPAddress);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceSubnetMask(); public native quickSpinTLInterface IncompatibleGevDeviceSubnetMask(spinNodeHandle IncompatibleGevDeviceSubnetMask);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceMACAddress(); public native quickSpinTLInterface IncompatibleGevDeviceMACAddress(spinNodeHandle IncompatibleGevDeviceMACAddress);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterName(); public native quickSpinTLInterface HostAdapterName(spinNodeHandle HostAdapterName);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterVendor(); public native quickSpinTLInterface HostAdapterVendor(spinNodeHandle HostAdapterVendor);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterDriverVersion(); public native quickSpinTLInterface HostAdapterDriverVersion(spinNodeHandle HostAdapterDriverVersion);
}
