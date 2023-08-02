package com.Transmission;

public class TransmissionImpl {
    public static void main(String[] args) {
        System.out.println();
        Transmission manualTransmission1 = new ManualTransmission("Manual","MP4","4",2.540,1.920,1.510,1.000);
        manualTransmission1.showSpecs();
        System.out.println();

        Transmission manualTransmission2 = new ManualTransmission("Manual","MP5","5",3.545,1.904,1.280,0.914,0.757);
        manualTransmission2.showSpecs();
        System.out.println();

        Transmission manualTransmission3 = new ManualTransmission("Manual","MP6","6",3.010,2.070,1.430,1.000,0.710,0.570);
        manualTransmission3.showSpecs();
        System.out.println();

        ManualTransmission manualTransmission4 = new ManualTransmission("Manual","MD5","5",3.545,1.904,1.233,0.911,0.725f);
        manualTransmission4.showSpecs();
        System.out.println();

        ManualTransmission manualTransmission5 = new ManualTransmission("Manual","MD6","6",3.640,2.150,1.360,1.000,0.750f,0.630f);
        manualTransmission5.showSpecs();
        System.out.println();


        Transmission amt1 = new AMT("AMT","AMTP4","4",2.540,1.940,1.510,1.000);
        amt1.showSpecs();
        System.out.println();

        AMT amt2 = new AMT("AMT","AMTD5","5",2.950,1.940,1.340,1.000,0.630);
        amt2.showSpecs();
        System.out.println();

        Transmission automaticCVT = new AutomaticCVT("Automatic-CVT","CVT6","6(Simulated)",2.631,1.440,1.165,0.906,0.680,0.499);
        automaticCVT.showSpecs();
        System.out.println();

        Transmission automaticDCT = new AutomaticDCT("Automatic-DCT","DCT8","8(Simulated)",4.714,3.143,2.106,1.667,1.285,1.000,0.839,0.667);
        automaticDCT.showSpecs();
        System.out.println();
    }
}
