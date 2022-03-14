import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Project name(项目名称)：MyBatis_where_and_set
 * Package(包名): PACKAGE_NAME
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/14
 * Time(创建时间)： 16:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public interface SiteMapper
{
    /**
     * Select list.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     * @return the list
     */
    public List<Site> select(@Param("id") Integer id, @Param("name") String name, @Param("url") String url
            , @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);

    /**
     * Update int.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     * @return the int
     */
    public int update(@Param("id") Integer id, @Param("name") String name, @Param("url") String url
            , @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);
}
