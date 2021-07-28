import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Blog;
import org.mybatis.example.BlogMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName CreateSqlSessionFactoryFromXML.java
 * @Description 从 XML 中构建 SqlSessionFactory
 * @date 2021/7/21 11:20 上午
 */
public class CreateSqlSessionFactoryFromXML {
    public static void main(String[] args) {
        try {

            String resouce = "org/mybatis/example/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resouce);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            //查询值
//            Blog blog = mapper.selectBlog(1);
//            if (Objects.isNull(blog)) {
//                System.out.println("未能正常获取到值");
//            } else {
//                System.out.println("获取得到的值为:"+blog.toString());
//            }
//
//            //查询hashmap
//            HashMap<String,Object> maps=mapper.selectBlogMap(1);
//            for (String key : maps.keySet()) {
//                System.out.println("key:"+key+",value:"+maps.get(key));
//            }



            //查询blog总数
//            int count = mapper.countBlog();
//            System.out.println("总数为:"+count);

            /**
             * 插入blog
             */
            Blog blog = new Blog(3,"new_blog");
            mapper.insertBlog(blog);

            /**
             * 查询所有值
             */
            List<Blog> blogs = mapper.selectBlogs();
            for (Blog value : blogs) {
                System.out.println(value.toString());
            }

            /**
             * 必须commit，才能更新数据
             */
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
