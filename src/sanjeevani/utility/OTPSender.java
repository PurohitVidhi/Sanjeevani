/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.utility;

/**
 *
 * @author USER
 */

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class OTPSender implements Sender{
    public boolean send(String number, String data) throws Exception {
        Unirest.setTimeouts(0, 0);
        String mobNo = number;
        int otp = Integer.parseInt(data);
        String url = "https://2factor.in/API/V1/7b9c8aef-b8e1-11ed-813b-0200cd936042/SMS/" + mobNo + "/" + otp
                + "/OTP1";
        System.out.println("OTP is:" + otp);
        GetRequest gr = Unirest.get(url);
        HttpResponse<String> response = gr.asString();
        String result = response.getBody();
        return result.contains("Success");
    }
}
