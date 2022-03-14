import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：MyBatis_where_and_set
 * Package(包名): PACKAGE_NAME
 * Class(测试类名): SiteMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/14
 * Time(创建时间)： 16:41
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */
class SiteMapperTest
{

    /**
     * Select.
     *
     * @throws IOException the io exception
     */
    @Test
    void select() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> list = siteMapper.select(null, null, null, 12, null, null);
        for (Site site : list)
        {
            System.out.println(site);
            System.out.println();
        }

        sqlSession.close();
    }

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp()
    {
    }

    /**
     * Tear down.
     */
    @AfterEach
    void tearDown()
    {
    }

    /**
     * After all.
     */
    @AfterAll
    static void afterAll()
    {

    }

    /**
     * Before all.
     */
    @BeforeAll
    static void beforeAll()
    {

    }

    /**
     * Update.
     *
     * @throws IOException the io exception
     */
    @Test
    void update() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);

        int i = siteMapper.update(7, null, null, null, "CN", null);
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }
}