package n.eus.wifiqs;

public interface WifiStateListener {
    void onWifiStateChanged(WifiState state, int rss);
}
