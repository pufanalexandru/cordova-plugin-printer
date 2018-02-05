package android.serialport.api;

public interface SerialPortDataReceivedScan {
	public void onDataReceivedListener(final byte[] buffer, final int size); 

}
