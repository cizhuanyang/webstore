package com.packt.webstore.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//按照权限处理不同的请求
public class PromoCodeInterceptor extends HandlerInterceptorAdapter {

   private String promoCode;
   private String errorRedirect;
   private String offerRedirect;

   
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException{
      //从请求参数中获得promp参数
	   String givenPromoCode = request.getParameter("promo");

      if (promoCode.equals(givenPromoCode)) {
         response.sendRedirect(request.getContextPath() + "/" + offerRedirect);
      } else {
         response.sendRedirect(errorRedirect);
      }

      return false;
   }

   public void setPromoCode(String promoCode) {
      this.promoCode = promoCode;
   }

   public void setErrorRedirect(String errorRedirect) {
      this.errorRedirect = errorRedirect;
   }

   public void setOfferRedirect(String offerRedirect) {
      this.offerRedirect = offerRedirect;
   }
}
