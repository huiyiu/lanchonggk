package com.lanchong.controller;

import com.google.gson.Gson;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;
import com.lanchong.ucenter.service.DemoService;
import de.ailis.pherialize.MixedArray;
import de.ailis.pherialize.Pherialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    DemoService demoService;

    @GetMapping("hi")
    public String hello(){
       return new Gson().toJson(demoService.getByEmail());
    }

    @GetMapping
    public String php(){
        String data = "a:8:{i:1;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:6:\"威望\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";s:1:\"1\";s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:2;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:6:\"金钱\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";s:1:\"1\";s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:3;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:6:\"贡献\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";s:1:\"1\";s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:4;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:0:\"\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";N;s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:5;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:0:\"\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";N;s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:6;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:0:\"\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";N;s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:7;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:0:\"\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";N;s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}i:8;a:8:{s:3:\"img\";s:0:\"\";s:5:\"title\";s:0:\"\";s:4:\"unit\";s:0:\"\";s:5:\"ratio\";i:0;s:9:\"available\";N;s:12:\"showinthread\";N;s:15:\"allowexchangein\";N;s:16:\"allowexchangeout\";N;}}";
          //      "a:5:{i:1;a:35:{s:2:\"id\";s:1:\"1\";s:5:\"title\";s:12:\"今日推荐\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:8:\"m_d_bg_c\";s:0:\"\";s:5:\"act_c\";s:7:\"#FF464E\";s:3:\"d_c\";s:7:\"#333333\";s:5:\"act_p\";s:50:\"/bao/170629/b/0/5954f767a9fcf84e99677411_72x72.png\";s:3:\"d_p\";s:50:\"/bao/170629/4/3/5954f7658150a16d8d78cb38_72x72.png\";s:3:\"url\";s:287:\"http://mapi.juanpi.com/goods/zhe/list?catname=newest_zhe&app_name=zhe&platform=${jpPlatform}&page=${page}&app_version=${jpAppVersion}&utm=${jpUtm}&user_group=${jpUserGroup}&ab_attr=${jpJpidAbAttr}&goods_utype=${jpGoodsUtype}&location=${jpLocation}&sex=${jpFeature}&fitperson=${fitperson}\";s:9:\"show_type\";s:1:\"3\";s:7:\"top_img\";s:52:\"/bao/170111/a/2/58765165db01d9f2738b45e7_156x132.png\";s:8:\"sale_img\";s:1:\"0\";s:8:\"sel_type\";s:1:\"2\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:0:\"\";s:4:\"type\";s:1:\"1\";s:10:\"sale_act_p\";s:0:\"\";s:8:\"sale_d_p\";s:0:\"\";s:4:\"item\";s:3:\"all\";s:7:\"ys_cate\";s:1:\"1\";s:7:\"item_id\";s:3:\"317\";s:11:\"multi_style\";s:1:\"0\";s:9:\"top_color\";s:0:\"\";s:6:\"search\";s:1:\"1\";s:7:\"keyword\";s:12:\"秋季女装\";s:5:\"color\";s:7:\"#999999\";s:7:\"message\";s:1:\"1\";s:8:\"category\";s:1:\"1\";s:9:\"cate_type\";s:1:\"1\";s:8:\"cate_url\";s:0:\"\";s:10:\"is_top_sub\";s:1:\"0\";s:11:\"use_keyword\";s:1:\"1\";s:11:\"search_logo\";s:50:\"/bao/170324/a/9/58d4bf07a43d1f6669251772_84x42.png\";}i:3;a:35:{s:2:\"id\";s:1:\"3\";s:5:\"title\";s:12:\"卷皮优选\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:8:\"m_d_bg_c\";s:0:\"\";s:5:\"act_c\";s:7:\"#FF464E\";s:3:\"d_c\";s:7:\"#333333\";s:5:\"act_p\";s:50:\"/bao/170815/0/4/5992a819a9fcf85a433cde5e_72x72.png\";s:3:\"d_p\";s:50:\"/bao/170815/4/1/5992a814a9fcf85a202a0103_72x72.png\";s:3:\"url\";s:528:\"ewoJInRpdGxlIjoiIiwKCSJtb2R1bGUiOiJCZXN0SW5kZXgiLAoJInZlcnNpb24iOiIxMDA3IiwKCSJwYXJhbXMiOgoJCXsKCQkJInppZCI6IjE1ODI0NDIsMTI2MjQxNywxNjUyNDQ3IiwKCQkJImNhdG5hbWUiOiJvcGxpZmVfdGVzdCIKCQl9LAoJIm11bHRpX3ZlcnNpb24iOgoJWwoJCXsKCQkJInZlcnNpb24iOiAiNC41LjQiLAoJCQkicGFyYW1zIjogewoJCQkJInRpdGxlIjoi5Y2355qu5LyY6YCJIiwKCQkJCSJtb2R1bGUiOiJCZXN0IiwKCQkJCSJ2ZXJzaW9uIjoiMTAxMCIsCgkJCQkicGFyYW1zIjp7CgkJCQkJCSJ6aWQiOiIxNTgyNDQyLDEyNjI0MTcsMTY1MjQ0NyIsCgkJCQkJCSJjYXRuYW1lIjoib3BsaWZlX3Rlc3QiCgkJCQkJfQoJCQkJfSwKCQkJIm9wZXIiOiAiPD0iCgkJfQoJXQp9\";s:9:\"show_type\";s:1:\"3\";s:7:\"top_img\";s:0:\"\";s:8:\"sale_img\";s:1:\"0\";s:8:\"sel_type\";s:1:\"6\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:528:\"ewoJInRpdGxlIjoiIiwKCSJtb2R1bGUiOiJCZXN0SW5kZXgiLAoJInZlcnNpb24iOiIxMDA3IiwKCSJwYXJhbXMiOgoJCXsKCQkJInppZCI6IjE1ODI0NDIsMTI2MjQxNywxNjUyNDQ3IiwKCQkJImNhdG5hbWUiOiJvcGxpZmVfdGVzdCIKCQl9LAoJIm11bHRpX3ZlcnNpb24iOgoJWwoJCXsKCQkJInZlcnNpb24iOiAiNC41LjQiLAoJCQkicGFyYW1zIjogewoJCQkJInRpdGxlIjoi5Y2355qu5LyY6YCJIiwKCQkJCSJtb2R1bGUiOiJCZXN0IiwKCQkJCSJ2ZXJzaW9uIjoiMTAxMCIsCgkJCQkicGFyYW1zIjp7CgkJCQkJCSJ6aWQiOiIxNTgyNDQyLDEyNjI0MTcsMTY1MjQ0NyIsCgkJCQkJCSJjYXRuYW1lIjoib3BsaWZlX3Rlc3QiCgkJCQkJfQoJCQkJfSwKCQkJIm9wZXIiOiAiPD0iCgkJfQoJXQp9\";s:3:\"cid\";s:3:\"490\";s:4:\"type\";i:1;s:10:\"sale_act_p\";s:0:\"\";s:8:\"sale_d_p\";s:0:\"\";s:4:\"item\";s:3:\"490\";s:7:\"ys_cate\";i:1;s:7:\"item_id\";s:3:\"308\";s:11:\"multi_style\";s:1:\"1\";s:9:\"top_color\";s:0:\"\";s:6:\"search\";s:9:\"undefined\";s:7:\"keyword\";s:21:\"搜索直发仓商品\";s:5:\"color\";s:7:\"#999999\";s:7:\"message\";s:1:\"2\";s:8:\"category\";s:1:\"2\";s:9:\"cate_type\";s:1:\"1\";s:8:\"cate_url\";s:0:\"\";s:10:\"is_top_sub\";s:1:\"0\";s:11:\"use_keyword\";s:1:\"0\";s:11:\"search_logo\";s:50:\"/bao/170630/5/5/5955a807a9fcf8512c087c97_84x42.png\";}i:6;a:34:{s:2:\"id\";s:1:\"6\";s:5:\"title\";s:9:\"超级券\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:8:\"m_d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:7:\"#333333\";s:9:\"top_color\";s:0:\"\";s:10:\"is_top_sub\";s:1:\"0\";s:5:\"act_p\";s:50:\"/bao/170713/3/f/59671b138150a114b565b1d6_72x72.png\";s:3:\"d_p\";s:50:\"/bao/170713/8/9/59671b11a9fcf865841e36d7_72x72.png\";s:3:\"url\";s:281:\"http://mapi.juanpi.com/goods/zhe/list?cid=taodapai&app_name=zhe&platform=${jpPlatform}&page=${page}&app_version=${jpAppVersion}&utm=${jpUtm}&user_group=${jpUserGroup}&ab_attr=${jpJpidAbAttr}&goods_utype=${jpGoodsUtype}&location=${jpLocation}&sex=${jpFeature}&fitperson=${fitperson}\";s:9:\"show_type\";s:1:\"3\";s:7:\"top_img\";s:52:\"/bao/170717/8/3/596c19aaa9fcf8410775df12_180x132.png\";s:8:\"sale_img\";s:1:\"0\";s:8:\"sel_type\";s:1:\"1\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:8:\"taodapai\";s:4:\"type\";i:1;s:10:\"sale_act_p\";s:0:\"\";s:8:\"sale_d_p\";s:0:\"\";s:4:\"item\";s:8:\"taodapai\";s:7:\"ys_cate\";i:1;s:11:\"use_keyword\";s:1:\"0\";s:11:\"search_logo\";s:0:\"\";s:6:\"search\";s:9:\"undefined\";s:7:\"keyword\";s:0:\"\";s:5:\"color\";s:0:\"\";s:7:\"message\";s:1:\"1\";s:8:\"category\";s:1:\"2\";s:9:\"cate_type\";s:1:\"1\";s:8:\"cate_url\";s:0:\"\";s:7:\"item_id\";s:3:\"281\";}i:4;a:35:{s:2:\"id\";s:1:\"4\";s:5:\"title\";s:9:\"购物车\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:8:\"m_d_bg_c\";s:0:\"\";s:5:\"act_c\";s:7:\"#FF464E\";s:3:\"d_c\";s:7:\"#333333\";s:5:\"act_p\";s:50:\"/bao/170616/4/7/5943c239a43d1f07ba660f0a_72x72.png\";s:3:\"d_p\";s:50:\"/bao/170616/7/e/5943c237ad0a4930578b45ab_72x72.png\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";s:1:\"3\";s:7:\"top_img\";s:0:\"\";s:8:\"sale_img\";s:1:\"0\";s:8:\"sel_type\";s:1:\"2\";s:7:\"ys_type\";s:1:\"6\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:0:\"\";s:4:\"type\";s:1:\"6\";s:10:\"sale_act_p\";s:0:\"\";s:8:\"sale_d_p\";s:0:\"\";s:4:\"item\";s:2:\"c6\";s:7:\"ys_cate\";s:1:\"6\";s:7:\"item_id\";s:3:\"230\";s:11:\"multi_style\";s:1:\"0\";s:9:\"top_color\";s:0:\"\";s:6:\"search\";s:9:\"undefined\";s:7:\"keyword\";s:0:\"\";s:5:\"color\";s:0:\"\";s:7:\"message\";s:1:\"2\";s:8:\"category\";s:1:\"2\";s:9:\"cate_type\";s:1:\"1\";s:8:\"cate_url\";s:0:\"\";s:10:\"is_top_sub\";s:1:\"0\";s:11:\"use_keyword\";s:1:\"0\";s:11:\"search_logo\";s:0:\"\";}i:5;a:35:{s:2:\"id\";s:1:\"5\";s:5:\"title\";s:12:\"我的卷皮\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:8:\"m_d_bg_c\";s:0:\"\";s:5:\"act_c\";s:7:\"#FF464E\";s:3:\"d_c\";s:7:\"#333333\";s:5:\"act_p\";s:50:\"/bao/170616/2/3/5943c249ad0a49ca578b45ab_72x72.png\";s:3:\"d_p\";s:50:\"/bao/170616/b/4/5943c246a43d1f07cd672524_72x72.png\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";s:1:\"3\";s:7:\"top_img\";s:0:\"\";s:8:\"sale_img\";s:1:\"0\";s:8:\"sel_type\";s:1:\"2\";s:7:\"ys_type\";s:1:\"7\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:0:\"\";s:4:\"type\";s:1:\"7\";s:10:\"sale_act_p\";s:0:\"\";s:8:\"sale_d_p\";s:0:\"\";s:4:\"item\";s:2:\"p7\";s:7:\"ys_cate\";s:1:\"7\";s:7:\"item_id\";s:3:\"230\";s:11:\"multi_style\";s:1:\"0\";s:9:\"top_color\";s:0:\"\";s:6:\"search\";s:9:\"undefined\";s:7:\"keyword\";s:0:\"\";s:5:\"color\";s:0:\"\";s:7:\"message\";s:1:\"2\";s:8:\"category\";s:1:\"2\";s:9:\"cate_type\";s:1:\"1\";s:8:\"cate_url\";s:0:\"\";s:10:\"is_top_sub\";s:1:\"0\";s:11:\"use_keyword\";s:1:\"0\";s:11:\"search_logo\";s:0:\"\";}}\n";

        MixedArray list;

        list = Pherialize.unserialize(data).toArray();
        for(int i = 0; i<= list.size(); i++) {
            System.out.println(i + " = " +list.get(i));
        }

        System.out.println("title=" + list.getArray(1).get("title"));
        System.out.println("title=" + list.getArray(2).get("title"));
        System.out.println("title=" + list.getArray(3).get("title"));


        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        ctx.set("单价", 5000);
        ctx.set("数量", 12);
        ctx.set("运费", 7500);
        Object result = fel.eval("单价*数量+运费");
        System.out.println(result);

        return "";
    }
}
