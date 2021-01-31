import com.my.pojo.Music;
import com.my.service.MusicService;
import com.my.service.MvService;
import com.my.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Myteat {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MvService mvService = (MvService) context.getBean("MvServiceImpl");
      /*  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        //2020-07-29
        String time = simpleDateFormat.format(new Date());
        System.out.println(musicService.AddMusic(new Music(0,"一路上有牛","12313",time,"132131")));*/
        //System.out.println(musicService.deleteMusicById(4));
     /*   System.out.println(musicService.findLoveMusicByUserId(11));

        File file = new File("D:\\javaProgram\\JAVA\\OnlieMusic\\web\\music");
        System.out.println(musicService.findLoveMusicByStr("llll",11));*/
        System.out.println(mvService.findMvByStr("水星记"));

    }
}
