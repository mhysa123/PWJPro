package com.example.administrator.pwjproject.utils;

/**
 * 封装url的工具类
 */
public class UrlUtil {
    /**
     * 服务器地址(各地址前缀)
     */
    public static final String SERVER_URL = "http://121.42.178.27:8101/main";
    /**
     * 获取验证码
     */
    public static final String GET_VERFY = SERVER_URL + "/open/sms/sendCode/v1";
    /**
     * 注册
     */
    public static final String REGISTER = SERVER_URL + "/open/user/register/v1";
    /**
     * 登录
     */
    public static final String LOGIN = SERVER_URL + "/open/user/login/v1";
    /**
     * 找回密码
     */
    public static final String FINDPWD = SERVER_URL + "/open/user/resetLoginPwd/v1";
    /**
     * 快捷登录
     */
    public static final String SPEEDLOGIN = SERVER_URL + "/open/user/speedLogin/v1";
    /**
     * 提交认证信息
     */
    public static final String COMMITCERFY = SERVER_URL + "/phone/user/authentication/v1";
    /**
     * 获取学校列表的接口
     */
    public static final String GETSCHOOLNAME = SERVER_URL + "/open/syscenter/getSchoolList/v1";
    /**
     * 获取专业列表的接口
     */
    public static final String GETMAJOR = SERVER_URL + "/open/syscenter/getMajorList/v1";
    /**
     * 获取轮播图的接口
     */
    public static final String CAROUSEL = SERVER_URL + "/open/syscenter/getImageList/v1";
    /**
     * 访问图片的前缀
     */
    public static final String IMAGEPATH = "http://edencity-oss-test2.oss-cn-qingdao.aliyuncs.com/";
    /**
     * 编辑个人信息的接口
     */
    public static final String EDITUSERINFO = SERVER_URL + "/private/user/modifyUserInfo/v1";
    /**
     * 获取钱包的信息
     */
    public static final String GETWALLT = SERVER_URL + "/private/user/getUserWallet/v1";
    /**
     * 获取首页话题的数据
     */
    public static final String GETHOMETOPIC = SERVER_URL + "/open/home/homeTopicList/v1";
    /**
     * 3.13.13查询图标列表...................7个
     */
    public static final String QUERTICON = SERVER_URL + "/open/syscenter/getIconList/v1";
    /**
     * 社区滑动标题的列表
     */
    public static final String COMMUNITYTOPIC = SERVER_URL + "/open/bbs/slideTopicList/v1";
    /**
     * 社区首页帖子列表
     */
    public static final String COMMUNITYLIST = SERVER_URL + "/open/bbs/homePostList/v1";

    /**
     * 社区发帖的接口
     */
    public static final String BBS_ADDPOST = SERVER_URL + "/private/bbs/addPost/v1";

    /**
     * 帖子详情的列表/open/bbs/postDetail/v1
     */
    public static final String COMMUNITYDETAIL = SERVER_URL + "/open/bbs/postDetail/v1";
    /**
     * 收藏帖子的接口
     */
    public static final String COLECTCARD = SERVER_URL + "/private/bbs/giveCollectPost/v1";
    /**
     * 获取评论列表
     */
    public static final String COMMENTLIST = SERVER_URL + "/open/bbs/commentList/v1";
    /**
     * 点赞的接口
     */
    public static final String PLAYGROUNDLIKE = SERVER_URL + "/private/bbs/givePostLike/v1";
    /**
     * 获取话题列表
     */
    public static final String TOPICLIST = SERVER_URL + "/open/bbs/topicList/v1";
    /**
     * 根据话题id获取帖子列表..........................................................................................................................
     */
    public static final String GETTOPICBYTOPICID = SERVER_URL + "/open/bbs/postListByTopicId/v1";
    /**
     * 获取二级话题列表
     */
    public static final String GETSECONDTOPIC = SERVER_URL + "/open/bbs/secondTopicList/v1";
    /**
     * 评论回复帖子
     */
    public static final String SENDMESSAGE = SERVER_URL + "/private/bbs/commentPost/v1";
    /**
     * 举报其他用户帖子
     */
    public static final String REPORT = SERVER_URL + "/open/bbs/givePostReport/v1";
    /**
     * 删除帖子的接口
     */
    public static final String DELETEPOST = SERVER_URL + "/private/bbs/deletePost/v1";
    /**
     * 标签列表
     */
    public static final String LABLES = SERVER_URL + "/open/bbs/labelList/v1";
    /**
     * 关注话题的接口
     */
    public static final String CONCERN = SERVER_URL + "/private/bbs/topicFocus/v1";
    /**
     * 取消关注的接口
     */
    public static final String DELETECONCERN = SERVER_URL + "/private/bbs/cancelTopicFocus/v1";
    /**
     * 获取(他人)用户信息的接口
     */
    public static final String GETUSERINFO = SERVER_URL + "/open/user/getUserInfo/v1";
    /**
     * 获取达人信息点赞数/总发帖数/达人show数
     */
    public static final String DARENINFO = SERVER_URL + "/open/bbs/masterShowNum/v1";
    /**
     * 获取用户的帖子列表3.1.16
     */
    public static final String GETUSRERPOST = SERVER_URL + "/open/bbs/myPostList/v1";
    /**
     * 完善用户信息的接口
     */
    public static final String COMPLETEINFO = SERVER_URL + "/phone/user/perfectInfomation/v1";
    /**
     * 我的活动的接口
     */
    public static final String MYACTIVITIES = SERVER_URL + "/private/home/myApplyActList/v1/";
    /**
     * 获取用户的帖子列表
     */
    /**
     * 退出登录的接口
     */
    public static final String LOGINOUT = SERVER_URL + "/private/user/logout/v1";
    /**
     * 获取个人中心我的帖子的列表接口
     */
    public static final String GETUSERPOSTLIST = SERVER_URL + "/open/bbs/myPostList/v1";
    /**
     * 我的回复的列表
     */
    public static final String MINEREPLYLIST = SERVER_URL + "/private/bbs/myReplyList/v1";
    /**
     * 我收藏的帖子
     */
    public static final String GETCOLLECTPOSTED = SERVER_URL + "/private/bbs/myPostCollectList/v1";
    /**
     * 我收藏的活动的接口
     */
    public static final String GETMYCOLLECTACTIVITIES = SERVER_URL + "/private/home/myCollectActList/v1";
    /**
     * 获取个人中心各个栏目的数量
     */
    public static final String PERSONALNUMBER = SERVER_URL + "/private/bbs/myNums/v1";
    /**
     * 获取我收藏的店铺的列表
     */
    public static final String GETCOLLECTSHOP = SERVER_URL + "/private/mallShop/getCollectionShop/v1";
    /**
     * 获取每日一课的收藏列表
     */
    public static final String GETSTUDYLIST = SERVER_URL + "/private/home/myCollectLessonList/v1";
    /**
     * 攻略 Finally
     */
    public static final String GETFINALLYLIST = SERVER_URL + "/private/home/myCollectOfficialPostList/v1";
    /**
     * 获取账单列表
     */
    public static final String GETBILLLIST = SERVER_URL + "/private/user/getUserAccountRecord/v1";
    /**
     * 意见反馈接口
     */
    public static final String FEEDBACK = SERVER_URL + "/open/syscenter/putSysFeedback/v1";
    /**
     * 充值接口
     */
    public static final String RECHARGEMONEY = SERVER_URL + "/private/account/recharge/v1";
    public static final String RECHARGEWX = SERVER_URL + "/private/pay/wxpay/v1";
    /**
     * 是否已经关注的接口
     */
    public static final String ISORNOTVISIT = SERVER_URL + "/private/bbs/topic/isFocus/v1";
    /**
     * 获取特殊类型的帖子列表
     */
    public static final String SPECIALPOSTLIST = SERVER_URL + "/open/bbs/specialPostList/v1";
    /**
     * 获取帖子的点赞数和评论数
     */
    public static final String GETPOSTCOMMOUNT = SERVER_URL + "/open/bbs/commentAndLikeCount/v1";
    /**
     * 打赏帖子和打赏评论
     */
    public static final String REWARDPOSTEDANDREPLY = SERVER_URL + "/private/bbs/rewardPost/v1";
    /**
     * 获取支付宝支付参数接口
     */
    public static final String GETZHIFUBAOARGUMENT = SERVER_URL + "/private/pay/paramsMap/v1";
    /**
     * 分享增加成长值和伊甸币接口
     */
    public static final String SHAREGETMONEY = SERVER_URL + "/private/syscenter/share/v1";
    /**
     * 根据话题标签的id来请求帖子列表的接口
     */
    public static final String TOPICTITLEPOST = SERVER_URL + "/open/bbs/postListByLabelId/v1";
    /**
     * 查询o20店铺一级分类
     */
    public static final String STORELEVELONE = SERVER_URL + "/open/online/getOnLineOneCateGory/v1";
    /**
     * 查询o2o店铺二级分类
     */
    public static final String STORESECONDLEVEL = SERVER_URL + "/open/online/getOnLineTwoCateGory/v1";
    /**
     * 按照分类分页查询o2o店铺列表
     */
    public static final String BASESTOREQUERY = SERVER_URL + "/open/online/getOnlineShopList/v1";
    /**
     * 查询o2o的店铺详情
     */
    public static final String QUERYSTOREDETAIL = SERVER_URL + "/open/online/getOnlineShop/v1";
    /**
     * 分页查询店铺商品
     */
    public static final String QUERYORDERGOODS = SERVER_URL + "/open/online/getOnlineGoodsList/v1";
    /**
     * 分页查询店铺评论列表
     */
    public static final String QUERYSTORECOMMENT = SERVER_URL + "/open/online/getOnlineCommentList/v1";
    /**
     * 查询优惠金额
     */
    public static final String QUERYORDERNUM = SERVER_URL + "/open/online/getPreferentialMoney/v1";
    /**
     * 添加收藏
     */
    public static final String ADDSTORECOLLECT = SERVER_URL + "/private/online/collectionShop/v1";
    /**
     * 取消收藏
     */
    public static final String CANCLESTORECOLLECT = SERVER_URL + "/private/online/cancelCollection/v1";
    /**
     * 预约o2o店铺
     */
    public static final String PREPAREO2OSTORE = SERVER_URL + "/private/online/postOnlineBespeak/v1";
    /**
     * 取消预约
     */
    public static final String CANCLEPREPAREORDER = SERVER_URL + "/private/online/cancleBespeak/v1";
    /**
     * 获取预约详情
     */
    public static final String GETPREPAREDETAILS = SERVER_URL + "/private/online/getBespeak/v1";
    /**
     * 删除预约
     */
    public static final String DELETEPREPAREORDER = SERVER_URL + "/private/online/deleteBespeak/v1";
    /**
     * 查询我的预约
     */
    public static final String QUERYMYPREPARE = SERVER_URL + "/private/online/getMyBespeakList/v1";
    /**
     * 提交优惠买单
     */
    public static final String COMMITOFFERORDER = SERVER_URL + "/private/online/postOnlineOrder/v1";
    /**
     * 查询我的优惠买单
     */
    public static final String QUERYMYOFFERORDER = SERVER_URL + "/private/online/getOnlineOrderList/v1";
    /**
     * 修改支付密码
     */
    public static final String EDITPAYPASSWORD = SERVER_URL + "/open/user/resetPayPwd/v1";
    /**
     * 余额支付
     */
    public static final String MYBALANCEPAY = SERVER_URL + "/private/pay/balancePay/v1";
    /**
     * 删除我的优惠买单
     */
    public static final String DELETEOFFERORDER = SERVER_URL + "/private/online/deleteOrder/v1";
    /**
     * 取消优惠买单
     */
    public static final String CANCLEOFFERORDER = SERVER_URL + "/private/online/cancleOrder/v1";
    /**
     * 查询优惠买单详情
     */
    public static final String QUREYOFFERORDERDETAIL = SERVER_URL + "/private/online/getOnlineOrderDetail/v1";
    /**
     * 添加评论
     */
    public static final String ADDCOMENT = SERVER_URL + "/private/online/postComment/v1";
    /**
     * 修改支付密码
     */
    public static final String CHANGEPAYPASSWORD = SERVER_URL + "/private/user/modifyPayPwd/v1";
    /**
     * 查询订单数量
     */
    public static final String QUERYORDERNUMBER = SERVER_URL + "/private/mallOrder/getOrderStatusNum/v1";

    /**
     * 查询我的优惠买单数
     */
    public static final String QUERYMYOFFERORDERNUMBER = SERVER_URL + "/private/online/getOnlineOrderNum/v1";
    /**
     * 查询我的预约数
     */
    public static final String QUERYMYPREPARENUMBER = SERVER_URL + "/private/online/getbespeakNum/v1";


    //3.13.7获取系统版本VertionNo
    public static final String GETVERTIONNO = SERVER_URL + "/open/syscenter/getVertion/v1";
    //3.13.4溜达页面轮播图的接口
    public static final String WALKPAGEIMAGE = SERVER_URL + "/open/syscenter/getImageList/v1";
    //3.9.1溜达场景购物栏目接口
    public static final String SHOPPINGLIST = SERVER_URL + "/open/sceneMall/getColumnList/v1";
    //3.9.2按照栏目id分页查询场景购物
    public static final String SCENESHOPLIST = SERVER_URL + "/open/sceneMall/getSceneShopList/v1";
    //3.9.3查询场景购物详情接口
    public static final String DETAILS = SERVER_URL + "/open/sceneMall/getSceneShopDetails/v1";
    //3.9.4增加购物场景浏览量
    public static final String SCENESHOPDETAILS = SERVER_URL + "/open/sceneMall/addBrowseNum/v1";
    //3.9.5添加评论
    public static final String ADDCOMMENT = SERVER_URL + "/private/sceneMall/comment/v1";
    //3.9.6分页查询评论列表CommentList
    public static final String MYCOMMENTLIST = SERVER_URL + "/open/sceneMall/getCommentList/v1";
    //3.9.7添加收藏
    public static final String COLLENTION = SERVER_URL + "/private/sceneMall/collection/v1";
    //3.9.8取消收藏
    public static final String NOTCOLLENTION = SERVER_URL + "/private/sceneMall/cancel/v1";
    //3.8.1店铺相关左侧listview条目
    public static final String SEARCHLIST = SERVER_URL + "/open/shop/getBusinessTypeList/v1";
    //3.8.3店铺相关右侧gridview条目
    public static final String SEARCHGRID = SERVER_URL + "/open/shop/getShopList/v1";
    //3.8.2按照店铺名称分页查询店铺searchShop
    public static final String SEARCHSHOP = SERVER_URL + "/open/shop/searchShop/v1";
    //3.8.4查询店铺详情ShopDetails
    public static final String SHOPDETAILS = SERVER_URL + "/open/shop/getShopDetails/v1";
    //3.15.1查询达人分类
    public static final String SCHOOLDRESSER = SERVER_URL + "/open/master/getMasterClassList/v1";
    //3.15.4根据达人分类id分页查询达人列表
    public static final String DRESSERTYPE = SERVER_URL + "/open/master/getMasterExamineList/v1";
    //3.1.26获取我点赞过的帖子得数目
    public static final String ZANGUO = SERVER_URL + "/open/bbs/myLikePostList/v1";
    //3.1.25获取达人信息点赞数/总发帖数/达人show数
    public static final String GETCONTENT = SERVER_URL + "/open/bbs/masterShowNum/v1";
    //3.2.6获取他人用户信息接口
    public static final String OTHERUSER = SERVER_URL + "/open/user/getOtherUser/v1";
    //3.3.1获取活动分组
    public static final String HUODONGLIST = SERVER_URL + "/open/home/actList/v1";
    //3.4.1签到
    public static final String SIGN = SERVER_URL + "/private/syscenter/sign/v1";
    //3.5.2获取首页中部话题里面得帖子列表（约会神助攻，爱情门诊部）
    public static final String HOMEPOSTLIST = SERVER_URL + "/open/home/officialPostList/v1";
    //3.5.3获取首页中部话题里面得帖子得详情（约会神助攻，爱情门诊部,以及2*n）  3.5.3获取首页中部话题里面得帖子得详情
    public static final String HOMEPOSTDETAIL = SERVER_URL + "/open/home/officialPostDetail/v1";
    //3.4.1获取最新调查
    public static final String ONLINE = SERVER_URL + "/open/homePage/survey/v1";
    //3.4.2参与在线调查
    public static final String ONLINERESULT = SERVER_URL + "/open/homePage/participateSurvey/v1";
    //3.4.3获取在线调查调查结果
    public static final String SURVEYRESULT = SERVER_URL + "/open/homePage/surveyResult/v1";
    //3.6每日一课相关接口
    public static final String MEIRIYIKE = SERVER_URL + "/open/home/lessonList/v1";
    //3.6.2获取每日一课详情详情
    public static final String MEIRIYIKEDRTAILS = SERVER_URL + "/open/home/lessonDetail/v1";
    //3.6.3每日一课收藏或取消收藏
    public static final String MEIRIYIKECOLLETION = SERVER_URL + "/private/home/giveCollectLesson/v1";
    //3.3.2获取活动详情
    public static final String HUODONGDETAILS = SERVER_URL + "/open/home/actDetail/v1";
    //3.3.5活动收藏或取消收藏
    public static final String HUODONGDCOLLECTION = SERVER_URL + "/private/home/giveCollectAct/v1";
    //3.3.3活动报名
    public static final String HUODONGDJOIN = SERVER_URL + "/private/home/applyAct/v1";
    //3.3.4我报名的活动
    public static final String HUODONGDMeJOIN = SERVER_URL + "/private/home/myApplyActList/v1/";
    //3.2.1获取资讯列表
    public static final String ZIXUNLIST = SERVER_URL + "/open/home/infoList/v1";
    //3.2.2获取资讯详情
    public static final String ZIXUNDETAILS = SERVER_URL + "/open/home/infoDetail/v1";
    //3.1.9获取评论列表
    public static final String PINGLUNLIST = SERVER_URL + "/open/bbs/commentList/v1";
    //3.1.10评论回复帖子
    public static final String PINGLUN = SERVER_URL + "/private/bbs/commentPost/v1";
    //3.15.2达人申请接口
    public static final String JOINDAREN = SERVER_URL + "/realname/master/examineMaster/v1";
    //3.15.3查询达人认证状态和认证标识接口
    public static final String DARENSTATE = SERVER_URL + "/open/master/getMasterExamine/v1";
    //3.5.4获取首页中部话题里面得帖子得详情...............................................................（约会神助攻，爱情门诊部）
    public static final String LOVE = SERVER_URL + "/open/home/officialPostDetail/v1";
    //3.5.5收藏或取消收藏官方帖子
    public static final String COLLECTORNOT = SERVER_URL + "/private/home/giveCollectOfficialPost/v1";
    //3.5.6首页搜索帖子
    public static final String HOMESEARCH = SERVER_URL + "/open/bbs/searchPost/v1";
    //3.8.5添加收藏(店铺)
    public static final String SHOPCOLLECTION = SERVER_URL + "/private/shop/collectionShop/v1";
    //3.8.5取消收藏(店铺)
    public static final String SHOPCOCANCELLLECTION = SERVER_URL + "/private/shop/ cancelCollection/v1";
    //3.16.1查询当天是否有抢伊甸币活动select
    public static final String SELECTSHAKE = SERVER_URL + "/open/shake/getShake/v1";
    //3.16.2抢伊甸币接口
    public static final String GOLDRUSH = SERVER_URL + "/realname/shake/shake/v1";
    //3.16.4分页抢伊甸币活动中奖记录
    public static final String SELECTSHAKENUM = SERVER_URL + "/open/shake/getShakeItem/v1";
    //////////////////////////////////////////////////////////////////////////电商/////////////////////////////////////////////////////////////////////////////////////////
    //1.2.1查询商城店铺一级分类列表
    public static final String GETMALLONECATEGORY = SERVER_URL + "/open/mallShop/getMallOneCateGory/v1";
    //1.2.1查询商城店铺二级分类列表
    public static final String GETMALLTWOCATEGORY = SERVER_URL + "/open/mallShop/getMallTwoCateGory/v1";
    //1.2.3查询商城店铺列表
    public static final String GETONLINESHOPLIST = SERVER_URL + "/open/mallShop/getMallShopList/v1";
    //1.2.5查询商城店铺详情
    public static final String GETMALLSHOP = SERVER_URL + "/open/mallShop/getMallShop/v1";
    //1.2.9查询商品一级分类列表
    public static final String GETGOODSONECATEGORY = SERVER_URL + "/open/mallShop/getGoodsOneCateGory/v1";
    //1.2.10查询商品二级分类
    public static final String GETGOODSTWOCATEGORY = SERVER_URL + "/open/mallShop/getGoodsTwoCateGory/v1";
    //1.2.13按照商品一二级分类排序规则分页查询商品
    public static final String GETGOODSLIST = SERVER_URL + "/open/mallShop/getGoodsList/v1";
    //1.2.15查询商品详情
    public static final String GETGOODSDETAILS = SERVER_URL + "/open/mallShop/getGoodsDetails/v1";
    //1.2.16收藏商城商品
    public static final String COLLECTIONGOODS = SERVER_URL + "/private/mallShop/collectionGoods/v1";
    //1.2.17取消收藏商品
    public static final String CANCELCOLLECTIONGOODS = SERVER_URL + "/private/mallShop/cancelCollectionGoods/v1";
    //1.2.18分页查询商品评论
    public static final String GETGOODSCOMMENTLIST = SERVER_URL + "/open/mallShop/getGoodsCommentList/v1";
    //1.3.1加入购物车
    public static final String POSTSHOPPINGCART = SERVER_URL + "/private/shopping/postShoppingCart/v1";
    //1.2.12按照店铺id，商品名称,自定义分类id 分页查询商品
    public static final String GETGOODSBYSHOP = SERVER_URL + "/open/mallShop/getGoodsByShop/v1";
    //1.2.6收藏商城店铺
    public static final String COLLECTIONSHOP = SERVER_URL + "/private/mallShop/collectionShop/v1";
    //1.2.7取消收藏商城店铺
    public static final String CANCELCOLLECTIONSHOP = SERVER_URL + "/private/mallShop/cancelCollection/v1";
    //1.3.2查询我的购物车
    public static final String GETSHOPPINGCART = SERVER_URL + "/private/shopping/ getShoppingCart/v1";
    //1.3.4清空购物车
    public static final String CLEAREDSHOPPINGCART = SERVER_URL + "/private/shopping/clearedShoppingCart/v1";
    //1.2.19根据已选择属性查询商品条目
    public static final String GETGOODSITEMLIST = SERVER_URL + "/open/mallShop/getGoodsItemList/v1";
    //1.3.3从购物车中删除某件商品
    public static final String DELETESHOPPINGCART = SERVER_URL + "/private/shopping/deleteShoppingCart/v1";
    //1.3.5.2 创建订单
    public static final String CREATEORDER = SERVER_URL + "/private/mallOrder/createOrder/v1";
    //1.3.7分页查询订单列表
    public static final String GETORDERLIST = SERVER_URL + "/private/mallOrder/getOrderList/v1";
    //1.2.20查询top好店
    public static final String GETGOODSHOP = SERVER_URL + "/open/mallShop/getGoodShop/v1";
    //1.2.21查询商城栏目（发现好物）
    public static final String GETMALLCOLUMN = SERVER_URL + "/open/mallShop/getMallColumn/v1";
    //1.3.10取消订单
    public static final String CANCELORDER = SERVER_URL + "/private/mallOrder/cancelOrder/v1";
    //1.3.15申请退单接口
    public static final String APPLYRETURNORDER = SERVER_URL + "/private/mallOrder/applyReturnOrder/v1";
    //1.3.11确认收货
    public static final String CONFIEMRECEIPT = SERVER_URL + "/private/mallOrder/confiemReceipt/v1";
    //1.3.14根据子订单id删除子订单
    public static final String DELETECHILDORDER = SERVER_URL + "/private/mallOrder/deleteChildOrder/v1";
    //1.2.8添加商城评论
    public static final String POSTCOMMENT = SERVER_URL + "/private/mallShop/postComment/v1";
    //1.3.2同步购物车
    public static final String SYNSHOPPINGCART = SERVER_URL + "/private/shopping/synShoppingCart/v1";
    //1.2.11查询商家自定义分类
    public static final String GETSHOPGOODSCATEGORY = SERVER_URL + "/open/mallShop/getShopGoodsCateGory/v1";
    //1.4.3查询我的地址
    public static final String GETADDRESSLIST = SERVER_URL + "/private/userAddress/getAddressList/v1";
    //1.4.1新增地址
    public static final String POSTADDRESS = SERVER_URL + "/private/userAddress/postAddress/v1";
    //1.4.2更新地址
    public static final String PUTADDRESS = SERVER_URL + "/private/userAddress/putAddress/v1";
    //1.4.3将地址设为默认地址
    public static final String PUTADDRESSTODEFAULT = SERVER_URL + "/private/userAddress/putAddressToDefault/v1";
    //1.4.4查询默认地址
    public static final String GETDEFAULTADDRESS = SERVER_URL + "/private/userAddress/getDefaultAddress/v1";
    //1.4.6删除地址
    public static final String DELETEADDRESS = SERVER_URL + "/private/userAddress/deleteAddress/v1";
    //1.4.7查询区域信息
    public static final String GETAREALIST = SERVER_URL + "/open/syscenter/getAreaList/v1";
    //1.3.9查询主订单详情
    public static final String GETORDER = SERVER_URL + "/private/mallOrder/getOrder/v1";
    //1.3.14查询子订单详情
    public static final String GETCHILDORDER = SERVER_URL + "/private/mallOrder/getChildOrder/v1";
    //1.3.18取消退单接口
    public static final String CANCELAPPLY = SERVER_URL + "/private/mallOrder/cancelApply/v1";
    //1.3.19保存物流信息
    public static final String POSTEXPRESS = SERVER_URL + "/private/mallOrder/postExpress/v1";
    //1.3.21查询发票信息
    public static final String GETINVOICELIST = SERVER_URL + "/private/mallOrder/getInvoiceList/v1";
    //1.3.22合计运费接口
    public static final String TOTALFREIGHT = SERVER_URL + "/private/mallOrder/totalFreight/v1";
}
