package com.lanchong.base;

import java.util.Map;

public class MessageFmtUtils {
    public  static final String messageTemplate = "[quote][size=2][url=forum.php?mod=redirect&goto=findpost&pid=${post.pid}&ptid=${post.tid}][color=#999999]${post.author} 发表于 ${post.datetime}[/color][/url][/size]\n" +
            "${post.message}[/quote]\n" +
            "\n" +
          /*  "[img]${post.imgurl}[/img]\n" +*/
            "${post.message2}";



   public static String formatMessage(Map<String,Object> post){

       return BeetlEngine.render(messageTemplate,"post",post);
   }

}
