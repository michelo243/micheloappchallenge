package michelo.m.micheloappchallenge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.net.http.SslError
import android.webkit.SslErrorHandler

class ActivityB : AppCompatActivity() {

    var mywebview: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        /*val toolbar = findViewById(R.id.main_area) as Toolbar
        toolbar.setTitle("ALC Phase 1")
        setSupportActionBar(toolbar)*/

        mywebview = findViewById<WebView>(R.id.mywebview)

        mywebview!!.getSettings().setJavaScriptEnabled(true)
        mywebview!!.getSettings().setAppCacheEnabled(true)
        mywebview!!.getSettings().setDatabaseEnabled(true)
        mywebview!!.getSettings().setDomStorageEnabled(true)
        mywebview!!.getSettings().setSupportZoom(true)
        mywebview!!.getSettings().setJavaScriptCanOpenWindowsAutomatically(true)
        mywebview!!.getSettings().setBuiltInZoomControls(true)

        mywebview!!.getSettings().setGeolocationEnabled(true)
        mywebview!!.setWebViewClient(object : WebViewClient() {
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        })
        mywebview!!.loadUrl("https://andela.com/alc/")



        /*

            mywebview!!.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                    view?.clearCache(true)
                    view?.clearHistory()
                    view!!.getSettings().setJavaScriptEnabled(true);
                    view!!.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    view?.loadUrl(url)
                    return true
                }
            }
            mywebview!!.loadUrl("https://andela.com/alc/")
        }*/


    }

}
