package com.zmeng.sdk;

public class MainActivity  {

//    private TextView text;
//    private FrameLayout bannerContainer;
//    private TextView text1;
//    private TextView back;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initView();
//        init();
//    }
//
//    private void initView() {
//        text = (TextView) findViewById(R.id.text);
//        bannerContainer = (FrameLayout) findViewById(R.id.bannerContainer);
//        text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getIAD().setZADListener(new ZADInterstitialListener() {
//                    @Override
//                    public void onNoAD(AdError adError) {
//                        Log.e("onNoAD", "onNoAD");
//                    }
//
//                    @Override
//                    public void onADReceive() {
//                        zadInterstitial.showAsPopupWindow();
//                        Log.e("onADReceive", "onADReceive");
//                    }
//
//                    @Override
//                    public void onADOpened() {
//                        Log.e("onADOpened", "onADOpened");
//                    }
//
//                    @Override
//                    public void onADExposure() {
//                        Log.e("onADExposure", "onADExposure");
//                    }
//
//                    @Override
//                    public void onADClicked() {
//                        Log.e("onADClicked", "onADClicked");
//                    }
//
//                    @Override
//                    public void onADClosed() {
//                        Log.e("onADClosed", "onADClosed");
//                    }
//
//                    @Override
//                    public void onADLeftApplication() {
//                        Log.e("onADLeftApplication", "onADLeftApplication");
//                    }
//                });
//                zadInterstitial.loadAD();
//            }
//        });
//
//        text1 = (TextView) findViewById(R.id.text1);
//        back = (TextView) findViewById(R.id.back);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, LoadingActivity.class);
//                startActivity(intent);
//                onBackPressed();
//            }
//        });
//        text1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getIAD().setZADListener(new ZADInterstitialListener() {
//                    @Override
//                    public void onNoAD(AdError adError) {
//
//                    }
//
//                    @Override
//                    public void onADReceive() {
//                        zadInterstitial.show();
//                    }
//
//                    @Override
//                    public void onADOpened() {
//
//                    }
//
//                    @Override
//                    public void onADExposure() {
//
//                    }
//
//                    @Override
//                    public void onADClicked() {
//
//                    }
//
//                    @Override
//                    public void onADClosed() {
//
//                    }
//
//                    @Override
//                    public void onADLeftApplication() {
//
//                    }
//                });
//                zadInterstitial.loadAD();
//            }
//        });
//    }
//
//    private void init() {
//        ZADBanner zadBanner = new ZADBanner(this, "zm_ad_2_1000");
//        zadBanner.setZADListener(new ZADBannerListener() {
//            @Override
//            public void onNoAD(AdError error) {
//                Log.e("zoubuzou ", error.getErrorMsg());
//            }
//
//            @Override
//            public void onADExposure() {
//                Log.e("zoubuzou ", "sdas");
//            }
//
//            @Override
//            public void onADClicked() {
//                Log.e("zoubuzou ", "sdadfff");
//            }
//        });
//        bannerContainer.addView(zadBanner);
//        zadBanner.loadAD();
//
//    }
//
//    ZADInterstitial zadInterstitial;
//
//    private ZADInterstitial getIAD() {
//        if (this.zadInterstitial != null) {
//            zadInterstitial.closePopupWindow();
//            zadInterstitial = null;
//        }
//        zadInterstitial = new ZADInterstitial(this, "ccc");
//        return zadInterstitial;
//    }
//
//
//    private void closeAsPopup() {
//        if (zadInterstitial != null) {
//            zadInterstitial.closePopupWindow();
//        }
//    }
}
