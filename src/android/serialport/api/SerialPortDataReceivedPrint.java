package android.serialport.api;

public interface SerialPortDataReceivedPrint {
	public void onDataReceivedListener(final byte[] buffer, final int size); 

}
