package com.lanchong.base;



public class AvatarUtils {

    public static String  getAvatarDir(Integer uid,Boolean valid){
        if(valid){
            return "uc_server/images/noavatar_middle.gif";
        }
        String idStr = String.format("%09d", uid);
       /* $dir1 = substr($uid, 0, 3);
        $dir2 = substr($uid, 3, 2);
        $dir3 = substr($uid, 5, 2);*/
      /*  $file = $ucenterurl.'/data/avatar/'.$dir1.'/'.$dir2.'/'.$dir3.'/'.substr($uid, -2).($real ? '_real' : '').'_avatar_'.$size.'.jpg';
        return $returnsrc ? $file : '<img src="'.$file.'" onerror="this.onerror=null;this.src=\''.$ucenterurl.'/images/noavatar_'.$size.'.gif\'" />';*/
        String dir1 = idStr.substring(0,3);
        String dir2 = idStr.substring(3,5);
        String dir3 = idStr.substring(5,7);
        String left = idStr.substring(7);
        StringBuffer sb = new StringBuffer();
        return sb.append("uc_server/data/avatar/")
                 .append(dir1).append("/")
                 .append(dir2).append("/")
                 .append(dir3).append("/")
                 .append(left).append("_avatar_middle.jpg")
                 .toString();
    }

    public static void main(String[] args) {
        System.out.println(getAvatarDir(1,true));
    }
}
