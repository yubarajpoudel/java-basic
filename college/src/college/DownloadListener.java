/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author yubaraj
 */
// declaration
// accessspecifier interface interfaceName
public interface DownloadListener {
    void downloadCompleted();
    void onStarted();
    void downloadFailed();
}
